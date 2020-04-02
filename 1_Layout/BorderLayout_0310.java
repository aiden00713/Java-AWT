import java.awt.*;

public class BorderLayout_0310 extends java.awt.Frame{
	public static void main (String args[]){
		new BorderLayout_0310();
	}

	public BorderLayout_0310(){
		BorderLayout borderlayout = new BorderLayout();
	
		Button button1 = new Button("EAST");
		Button button2 = new Button("SOUTH");
		Button button3 = new Button("WEST");
		Button button4 = new Button("NORTH");
		Button button5 = new Button("CENTER");
	
		//增加按鈕
		add(button1,BorderLayout.EAST);
		add(button2,BorderLayout.SOUTH);
		add(button3,BorderLayout.WEST);
		add(button4,BorderLayout.NORTH);
		add(button5,BorderLayout.CENTER);
		this.setSize(300,300);  //設定視窗大小
		this.setVisible(true); //視窗顯示
	}
}