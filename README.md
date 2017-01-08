# SimpleTabBar

![alt tag](https://lh3.googleusercontent.com/EqU9R7YsShgXgXXM5AgjYfABsPzriEZWYf-NU1WdYK7KcvXaUIMQdhkDGP7wmA9cbV7EkLZXkCW-qEptdKGVCuukKhIIdEkJEkO6ekb2P4-a92gtmxdCUh3RzbaoS66jUWff8yAdLv-LA2ngb3sHG7ZcUm0kN1lIRZR2BxZPinfD_kGqPQiJCzGnPmZrxnF2YhquOkAVtH7X_6BGG0aa9n3wktdFf33a0pQrln8vTfDC6gsN2oRjoZvxuljcy2pRUmP3J6DIHwgo8QyUVToDqGyn2OLOtsf7FEOk_aWqqUviPJkZgCurETInXSlUArQf7Mp7E3cMxAQpl-0ihUTEMD3dZXEcFM0k8jo0KIqOfGNz_WiquBkledz7KrOx1vibZvVgD6iGWQcuPr_F_Po7h3-SIAIUEtU9j65vmERt1WLd_XmTV4MF1a5kozYf15OPlP37R0C4tRZdwU7S3kt8rnTVNMm4jl2A0Hmd3Wd5t0oExlEtNZyK5H5dSxlpLK6IprOABOQ5pZrdO3QAL2runob5VSXz7NH9K4N6sjD71CYCanbGxjjxMtaKvNa-UiBo54IXRaW5SA1d8EK22fQuu4euXEELk6DaFdRPCruGBqnDwOMy6OP2=w507-h901-no)

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
