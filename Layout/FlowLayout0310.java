import java.awt.*;

public class FlowLayout0310 extends java.awt.Frame{
	public static void main (String args[]){
		new FlowLayout0310();
}

	public FlowLayout0310(){
		FlowLayout flowlayout = new FlowLayout(FlowLayout.CENTER);
		setLayout(flowlayout); 
		Button button = new Button("Hello world");
		add(button);
		this.setSize(300,300);
		this.setVisible(true);
	}
}