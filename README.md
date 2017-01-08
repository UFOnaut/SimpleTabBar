# SimpleTabBar

![alt tag](http://i65.tinypic.com/2q0nfhi.png)

## Fast install
- Initialize your ViewPager with Adapter extended from SimpleTabBarAdapter
- Add SimpleTabBar to your layout
- Populate SimpleTabBar with "setupWithViewPager" method

## Additional attributes
|   Attribute                 |  Description  |    Values     |   Default     |
| --------------------------- | ------------- | ------------- | ------------- |
| tabWidth | width of every tab | dimension | 120dp |
| tabHeight | height of every tab  | dimension  | 50dp  |
| indicatorColor | color of indicator  | color | #404DFF  |
| indicatorHeight | height of indicator  | dimension   | 3dp  |
| selectedTabBackgroundColor | tab backgound color  | color  | taken from adapter |
| selectedTabTextColor | tab text color  | color  | taken from adapter  |
| selectedTabImageColor | tab image colorfilter applied | color | taken from adapter  |
| indicatorLineColor | indicator line color  | color  | transparent |
| noImage | hides image  | boolean  | false  |
| noText | hides text  | boolean  | false  |
| imagePosition | position of image within tab  | left, top, right, bottom  | left  |
| imageMargin | margin of image  | dimension  | 5dp  |
| imageWidth | width of image  | dimension  | 20dp  |
| imageHeight | height of image  | dimension  | 20dp  |
| textMargin | margin of text  | dimension  | 5dp  |
| textSize | size of text  | dimension  | 12sp  |
