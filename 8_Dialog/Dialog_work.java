import java.awt.*;
import java.awt.event.*;

public class Dialog_work extends java.awt.Frame implements ActionListener{
  public static void main(String args[]){
    new Dialog_work();
  }
  
  Button[] button = new Button[4];
  
  public Dialog_work() {
    super("Dialog work");
	setLayout(new FlowLayout(FlowLayout.CENTER));
	
	String[] text = {"test1","test2","test3","test4"};
	
	for(int i=0;i<4;i++){
		button[i] = new Button(text[i]);
		button[i].addActionListener(this);
		add(button[i]);
	}
	
	this.setSize(250,100);

	// Center the frame
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

  public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(button[0])){
			Dialog dialog = new Dialog(this,"test1");
			dialog.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
			dialog.setSize(250,150);
			dialog.setVisible(true);
		}
		else if(e.getSource().equals(button[1])){
			Dialog dialog = new Dialog(this,"test2");
			dialog.setModalityType(Dialog.ModalityType.DOCUMENT_MODAL);
			dialog.setSize(250,150);
			dialog.setVisible(true);
		}
		else if(e.getSource().equals(button[2])){
			Dialog dialog = new Dialog(this,"test3");
			dialog.setModalityType(Dialog.ModalityType.MODELESS);
			dialog.setSize(250,150);
			dialog.setVisible(true);
		}
		else if(e.getSource().equals(button[3])){
			Dialog dialog = new Dialog(this,"test4");
			dialog.setModalityType(Dialog.ModalityType.TOOLKIT_MODAL);
			dialog.setSize(250,150);
			dialog.setVisible(true);
		}
	}
}