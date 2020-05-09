import java.awt.*;

public class midterm01 extends java.awt.Frame{
	public static void main (String args[]){
		new midterm01();
	}

	public midterm01(){
		BorderLayout borderlayout = new BorderLayout();
	
		Button button1 = new Button("EAST");
		Button button2 = new Button("SOUTH");
		Button button3 = new Button("WEST");
		Button button4 = new Button("NORTH");
	
		add(button1,BorderLayout.EAST);
		add(button2,BorderLayout.SOUTH);
		add(button3,BorderLayout.WEST);
		add(button4,BorderLayout.NORTH);
		this.setSize(300,300);  //設定視窗大小
		this.setVisible(true); //視窗顯示
	}
}