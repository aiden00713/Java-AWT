import java.awt.*;

public class midterm02{
	public static void main (String args[]){
		java.awt.Frame frame = new Frame();
		FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER);
		frame.setLayout(flowlayout); 
		
		Button button1 = new Button("Aa");
		Button button2 = new Button("Bb");
		Button button3 = new Button("Cc");
		Button button4 = new Button("Dd");
		Button button5 = new Button("Ee");
		
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.add(button4);
		frame.add(button5);
		frame.setSize(200,200);
		frame.setVisible(true);
	}
}