package com.ufonaut.simpletabbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.ufonaut.simpletabbar.exception.IncorrectAdapterSetException;

/**
 * Created by UFOnaut on 03.10.2016.
 */
public class SimpleTabBar extends HorizontalScrollView {

    private Context context;
    private int margin;
    private int padding;
    private int tabWidth;
    private int tabHeight;
    private int indicatorColor;
    private int indicatorHeight = 10;

    private LinearLayout llTabs;
    private View indicator;

    public SimpleTabBar(Context context) {
        super(context);
        init(context, null);
    }

    public SimpleTabBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attributeSet) {
        this.context = context;
        if (attributeSet != null)
            initAttributes(attributeSet);
    }

    private void initAttributes(AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.SimpleTabBar, 0, 0);
        try {
            margin = typedArray.getDimensionPixelSize(R.styleable.SimpleTabBar_margin, 0);
            padding = typedArray.getDimensionPixelSize(R.styleable.SimpleTabBar_padding, 0);
            tabWidth = typedArray.getDimensionPixelSize(R.styleable.SimpleTabBar_tabWidth, 0);
            tabHeight = typedArray.getDimensionPixelSize(R.styleable.SimpleTabBar_tabHeight, 0);
            int defaultIndicatorColor = context.getResources().getColor(R.color.defaultIndicatorColor);
            indicatorColor = typedArray.getColor(R.styleable.SimpleTabBar_indicatorColor, defaultIndicatorColor);
            indicatorHeight = typedArray.getDimensionPixelSize(R.styleable.SimpleTabBar_indicatorHeight, 10);
        } finally {
            typedArray.recycle();
        }
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setHorizontalScrollBarEnabled(false);
        addView(prepareContainerWithTabsAndIndicator(viewPager));
        scrollWithViewPager(viewPager);
    }

    private LinearLayout prepareContainerWithTabsAndIndicator(ViewPager viewPager) {
        llTabs = new LinearLayout(context);
        LinearLayout.LayoutParams tabParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                tabHeight);
        llTabs.setOrientation(LinearLayout.HORIZONTAL);
        llTabs.setLayoutParams(tabParams);
        addTabs(viewPager);

        LinearLayout parent = new LinearLayout(context);
        LinearLayout.LayoutParams parentParams = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                tabHeight + indicatorHeight);
        parent.setLayoutParams(parentParams);
        parent.setOrientation(LinearLayout.VERTICAL);

        parent.addView(llTabs);
        parent.addView(getFieldWithIndicator());

        return parent;
    }

    private FrameLayout getFieldWithIndicator() {
        FrameLayout indicatorField = new FrameLayout(context);

        indicator = new View(context);
        LinearLayout.LayoutParams indicatorParams = new LinearLayout.LayoutParams(tabWidth, indicatorHeight);
        indicator.setBackgroundResource(indicatorColor);

        indicatorField.addView(indicator, indicatorParams);
        return indicatorField;
    }

    private void addTabs(final ViewPager viewPager) {
        try {
            for (int i = 0; i < viewPager.getAdapter().getCount(); i++) {
                addTab(viewPager, i);
            }
        } catch (IncorrectAdapterSetException e) {
            e.printStackTrace();
        }
    }

    private void addTab(final ViewPager viewPager, final int position) throws IncorrectAdapterSetException {
        View view = newTab(viewPager, position);
        setMargins(view, margin, margin, margin, margin);
        view.setPadding(padding, padding, padding, padding);
        view.setMinimumWidth(tabWidth);
        view.setMinimumHeight(tabHeight);
        view.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(position);
            }
        });
        llTabs.addView(view);
    }

    private View newTab(ViewPager viewPager, int position) throws IncorrectAdapterSetException {
        if (viewPager.getAdapter() instanceof SimpleTabBarAdapter)
            return getTabViewWithIcon(((SimpleTabBarAdapter) viewPager.getAdapter()), position);
        else
            throw new IncorrectAdapterSetException("Your adapter doesn't extend SimpleTabBarAdapter");
    }

    private View getTabViewWithIcon(SimpleTabBarAdapter adapter, int position) {
        View tabView = LayoutInflater.from(context).inflate(R.layout.item_tab, null);
        TextView tv = (TextView) tabView.findViewById(R.id.tvText);
        ImageView iv = (ImageView) tabView.findViewById(R.id.ivImage);
        tv.setText(adapter.getPageTitle(position));
        iv.setImageResource(adapter.getIconResource(position));
        tabView.setBackgroundResource(adapter.getColorResource(position));
        return tabView;
    }

    private void setMargins(View view, int left, int top, int right, int bottom) {
        if (view.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams p = (RelativeLayout.LayoutParams) view.getLayoutParams();
            p.setMargins(left, top, right, bottom);
            view.requestLayout();
        }
    }

    private void scrollWithViewPager(final ViewPager viewPager) {
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                indicator.animate()
                        .x((position + positionOffset) * tabWidth)
                        .setDuration(0)
                        .start();
                scrollTo((int) ((position + positionOffset - 1) * tabWidth), 0);
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
