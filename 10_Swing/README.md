# 銘傳電通系Java應用程式設計

----

### Swing

----
* 建立可動態調整介面的視窗應用程式<br>
i.  運用 JFrame與JPanel建立視窗應用程式<br>
ii. 並於視窗中繪出字串  Hello MCU

![image](https://github.com/aiden00713/Java-AWT/blob/master/10_Swing/screenshot/1.png)

* 建立圖片繪製程式<br>

```
提示：使用以下程式片段可檢查是否支援該介面
private boolean isLookAndFeelSupported(String lnfname) {
    try { 
      Class lnfclass = Class.forName(lnfname);
      javax.swing.LookAndFeel lnf = (LookAndFeel)(lnfclass.newInstance());
            // 判斷作業系統是否支援Look and Feel
      return lnf.isSupportedLookAndFeel();
    } 
    catch(Exception e) { 
      return false;    
    }
}
```

![image](https://github.com/aiden00713/Java-AWT/blob/master/10_Swing/screenshot/2-1.png)


![image](https://github.com/aiden00713/Java-AWT/blob/master/10_Swing/screenshot/2-2.png)


![image](https://github.com/aiden00713/Java-AWT/blob/master/10_Swing/screenshot/2-3.png)


![image](https://github.com/aiden00713/Java-AWT/blob/master/10_Swing/screenshot/2-4.png)
