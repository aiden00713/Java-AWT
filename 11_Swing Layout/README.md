# 銘傳電通系Java應用程式設計

----

### Swing Layout

----
* 使用 Overlay Layout建立視窗應用程式<br>
i.  建立兩個Button<br>
ii. Button1 的水平對齊點為0.0f 垂直對齊點為0.5f,最小尺寸為100x100,最佳尺寸為200x200<br>
iii.Button2 的水平對齊點為0.5f 垂直對齊點為0.0f,最小尺寸為100x100,最佳尺寸為200x200

![image](https://github.com/aiden00713/Java-AWT/blob/master/11_Swing%20Layout/screenshot/1.png)

----
* 使用 Box Layout建立視窗應用程式<br>
i.  建立兩個Button<br>
ii. 由左至右配置<br>
iii.設定Button1之前的Rigid Area為(100,100)<br>
iv. 設定Button1與Button2之間的Rigid Area為(150,150)<br>
v.  設定Button2之後的Rigid Area為(50,50)

![image](https://github.com/aiden00713/Java-AWT/blob/master/11_Swing%20Layout/screenshot/2.png)
----
* 使用 Spring Layout建立視窗應用程式<br>
i.  建立5個JButton並具有圖示(icon)<br>
ii. 第1個JButton的Spring.constant為10, x與y均是<br>
iii.第2~5個JButton的位置為Spring.constant(20)+ SpringLayout.EAST與Spring.constant(20)+ SpringLayout.SOUTH

![image](https://github.com/aiden00713/Java-AWT/blob/master/11_Swing%20Layout/screenshot/3.png
