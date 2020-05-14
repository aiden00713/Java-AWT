# 銘傳電通系Java應用程式設計

----

### Dialog

----
* 建立對話盒,屬性設定如下<br>
i.  對話盒1, 標題列為test1, 獨佔模式為 Application Modal<br>
ii.	對話盒2, 標題列為test2, 獨佔模式為 Document Modal<br>
iii.對話盒3, 標題列為test3, 獨佔模式為 Toolkit Modal<br>
iv.	對話盒4, 標題列為test4, 獨佔模式為 Modeless<br>

![image](https://github.com/aiden00713/Java-AWT/blob/master/8_Dialog/screenshot/1.png)

* 建立檔案對話盒,屬性設定如下<br>
i.	建立選項清單,內容為 File ->  New, Open, 分隔線, Save, Save As…, 分隔線, Exit<br>
ii.	點選 Open , Save會出現檔案對話盒,並且有Filename Filter的功能(只顯示副檔名為java的檔案) (windows下不會有效果,程式中有設定即可)<br>
iii.點選 New, Save As…, 會出現自製的對話盒<br>
iv.	點選 Exit 即離開程式<br>

```
提示:開啟檔案對話盒,且為儲存功能
FileDialog filedialog = new FileDialog(this, "Save File", FileDialog.SAVE);

定義篩選條件: 副檔名為java
Filter filter = new Filter("java"); 
filedialog.setFilenameFilter(filter);

資料夾內要包含Filter.class及CustomDialog.class這兩個檔案才能正常編譯。
```

![image](https://github.com/aiden00713/Java-AWT/blob/master/8_Dialog/screenshot/2-1.png)

![image](https://github.com/aiden00713/Java-AWT/blob/master/8_Dialog/screenshot/2-2.png)
