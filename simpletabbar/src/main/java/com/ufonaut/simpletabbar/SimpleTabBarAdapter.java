package com.ufonaut.simpletabbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by UFOnaut on 05.10.2016.
 */
public abstract class SimpleTabBarAdapter extends FragmentPagerAdapter {

    public SimpleTabBarAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    public abstract int getCount();

    public abstract Fragment getItem(int position);

    public abstract CharSequence getPageTitle(int position);

    abstract int getColorResource(int position);

    abstract int getIconResource(int position);
}
