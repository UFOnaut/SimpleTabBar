# SimpleTabBar

![alt tag](https://lh3.googleusercontent.com/OH3KoZU2Ov8yUrZoixWkYIMfL9JAgpuf9qI-FCJxO_J8bco_7oKxFifC3fQatqhpw3pIL5b7o8Joub6SjJz4B6sC0-drPRJJmm2D0S2WPJojMlE5BXszHwkoIZQN3wI-mpfjGfBSBGNXDg-W24Uzk2O7paILo37D1TutEv8DuCD6f4iL5aNpYtCgnm_UF3xAumKCwYJdwmzaoTqFAgyGR-FoQnQKc5GKj-9SXuq6WBgfu9wRi1tQdmdlaOyEBfJhTuq2C4CM9u-PydwvDj1q4uTzWM6iRqbRQDqPdwvwKci8LcgGcfVorPFwufv7cacmT7QffZ_OkEesCuXOCu_1xSz6sXrmqWl_fTj85BTJUsqG_VWAfsTAxyXGHqeC40SZFpVPpgDr2aU0qUcSrAe0nY4VlAjuNnEx0Mz7Xhw9s9LMm_crEg6cUxFSdkrfX01dvO7Yz2P6XOZuT0l89sMvHuaiU3D55gHZlWGAKDQlx_zTEl03wmB0oNjT_kCsW_7d7TWGX1zXXgHEUvJnDdjdYLsJnfe2hvM7iYXyFgbyPuvQyU-9ldGjqYRMjCMxOYgUc9z7sLuLTZ6KRwqa-Ptr17wbJrJ0H0ISr0JHkJbWHNGHbHgWRbrX=w1080-h702-no)

## Fast install
- Initialize your ViewPager with Adapter extended with SimpleTabBarAdapter
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
| selectedTabImageColor | tab image colorfilter applied on image | color | taken from adapter  |
| indicatorLineColor | indicator line color  | color  | transparent |
| noImage | hides image  | boolean  | false  |
| noText | hides text  | boolean  | false  |
| imagePosition | position of image within tab  | left, top, right, bottom  | left  |
| imageMargin | margin of image  | dimension  | 5dp  |
| imageWidth | width of image  | dimension  | 20dp  |
| imageHeight | height of image  | dimension  | 20dp  |
| textMargin | margin of text  | dimension  | 5dp  |
| textSize | size of text  | dimension  | 12sp  |
