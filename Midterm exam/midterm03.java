import java.awt.*;
import java.awt.event.*;

public class midterm03 extends java.awt.Frame implements MouseMotionListener,ActionListener{

  public static void main(String args[]){
    new midterm03();
  }
  Button button = new Button("Action Listener");
  public midterm03() {
    super("midterm03");
	button.addActionListener(this);
	this.addMouseMotionListener(this);
	
	setLayout(new GridLayout(2,1));
    java.awt.Label label;

	
    label = new Label("Mouse Motion Listener");
	label.setAlignment(Label.CENTER);
    label.addMouseMotionListener((MouseMotionListener)this);
    add(label);
	
	add(button);
    
    this.setSize(300,300);

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();

    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;

    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;

    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
    this.setVisible(true);
    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
  
  public void mouseDragged(MouseEvent e){
	System.out.println("·Æ¹«©ì¦² X¡G"+ e.getX() +"  Y¡G" + e.getY());
  }
  
  public void mouseMoved(MouseEvent e){
	System.out.println("·Æ¹«²¾°Ê X¡G" + e.getX() +"  Y¡G" + e.getY());
  }
  
  public void actionPerformed(ActionEvent e){
	if(e.getSource().equals(button)){
		System.out.println("·Æ¹«ÂIÀ»«ö¶s");
	}
  }
}