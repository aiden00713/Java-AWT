import java.awt.*;
import java.awt.event.*;

public class Button_ActionListener extends java.awt.Frame implements ActionListener{

	public static void main(String args[]){
		new Button_ActionListener();
	}
	
	Button[] button = new Button[6];
	public Button_ActionListener(){
		super("Button ActionListener");
		setLayout(new FlowLayout(FlowLayout.CENTER));  //�]�wlayout
		String[] text = {"New","Open","Save","Cut","Copy","Paste"};
		
		for(int i=0;i<6;i++){
			button[i] = new Button(text[i]);
			button[i].addActionListener(this);
			add(button[i]);
		}
		
		// �]�w�������j�p
		this.setSize(300,300);

		// Center the frame
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		Dimension frameSize = this.getSize();

		if (frameSize.height > screenSize.height)
		frameSize.height = screenSize.height;

		if (frameSize.width > screenSize.width)
		frameSize.width = screenSize.width;

		this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);

		// ��ܵ���
		this.setVisible(true);

		this.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		});
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource().equals(button[0])){
			System.out.println("�}�ҷs��");
		}
		else if(e.getSource().equals(button[1])){
			System.out.println("�}������");
		}
		else if(e.getSource().equals(button[2])){
			System.out.println("�s��");
		}
		else if(e.getSource().equals(button[3])){
			System.out.println("�ŤU");
		}
		else if(e.getSource().equals(button[4])){
			System.out.println("�ƻs");
		}
		else if(e.getSource().equals(button[5])){
			System.out.println("�K�W");
		}
	}
}