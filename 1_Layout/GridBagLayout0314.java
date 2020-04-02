import java.awt.*;

public class GridBagLayout0314 extends java.awt.Frame{
	public static void main (String args[]){
		new GridBagLayout0314();
	}

	public GridBagLayout0314(){
		Button button;
		GridBagLayout gridbaglayout = new GridBagLayout();
		GridBagConstraints gbConstraints = new GridBagConstraints();
		
		// 定義 Layout Manager 為 GridBagLayout
		setLayout(gridbaglayout);
    
		// 垂直水平都填滿
		gbConstraints.fill = GridBagConstraints.BOTH;
		
		// 依加權比例分配物件間水平方向額外之區域
		gbConstraints.weightx = 0.5;
		
		
		button = new Button("1");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		button = new Button("2");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		button = new Button("3");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		button = new Button("4");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER物件填滿所剩列數
		button = new Button("5");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.gridwidth = GridBagConstraints.RELATIVE; //RELATIVE物件填滿至最後一個單元前
		button = new Button("6");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER物件填滿所剩列數
		button = new Button("7");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		button = new Button("8");
		gbConstraints.gridwidth = 2;
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER物件填滿所剩列數
		button = new Button("9");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		// 設定物件配置時所佔據區域列的數目
		gbConstraints.gridwidth = 2;          
		// 設定物件配置時所佔據區域行的數目
		gbConstraints.gridheight = 7;
		// 依加權比例分配物件間垂直方向額外之區域
		gbConstraints.weighty = 1.0;
		button = new Button("10");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER物件填滿所剩列數
		gbConstraints.gridheight = 1;      
		button = new Button("11");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER物件填滿所剩列數
		gbConstraints.gridheight = 1;      
		button = new Button("12");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER物件填滿所剩列數
		gbConstraints.gridheight = 1;      
		button = new Button("13");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = 2; 
		gbConstraints.gridheight = 1;
		gbConstraints.gridx = 3;  //用button4來對齊，從0行開始算在第3行
		gbConstraints.gridy = 6;  //從0列開始計算，在第6列
		button = new Button("14");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = 1; 
		gbConstraints.gridheight = 1;
		gbConstraints.gridx = 2;  //用button3來對齊，從0行開始算在第2行
		gbConstraints.gridy = 7;  //從0列開始計算，在第7列
		button = new Button("15");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = 1; 
		gbConstraints.gridheight = 1;
		gbConstraints.gridx = 3;  //用button4來對齊，從0行開始算在第3行
		gbConstraints.gridy = 8;  //從0列開始計算，在第8列
		button = new Button("16");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = 1; 
		gbConstraints.gridheight = GridBagConstraints.REMAINDER;  //REMAINDER物件填滿所剩行數
		gbConstraints.gridx = 4;  //用button5來對齊，從0行開始算在第4行
		gbConstraints.gridy = 9;  //從0列開始計算，在第9列
		button = new Button("17");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		this.setSize(300,300);
		this.setVisible(true);
	}
}
