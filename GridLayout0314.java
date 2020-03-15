import java.awt.*;

public class GridLayout0314 extends java.awt.Frame{
	public static void main (String args[]){
		new GridLayout0314();
	}

	public GridLayout0314(){
		int row = 4;     
		int column = 3;  
		setLayout(new GridLayout(row,column));
		
		Button button0 = new Button("(0,0)");
		Button button1 = new Button("(0,1)");
		Button button2 = new Button("(0,2)");
		Button button3 = new Button("(1,0)");
		Button button4 = new Button("(1,1)");
		Button button5 = new Button("(1,2)");
		Button button6 = new Button("(2,0)");
		Button button7 = new Button("(2,1)");
		Button button8 = new Button("(2,2)");
		Button button9 = new Button("(3,0)");
		Button button10 = new Button("(3,1)");
		Button button11 = new Button("(3,2)");
		
		add(button0);
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		add(button6);
		add(button7);
		add(button8);
		add(button9);
		add(button10);
		add(button11);
		
		this.setSize(300,300);
		this.setVisible(true);
	}
}