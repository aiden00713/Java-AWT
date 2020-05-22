import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.plaf.metal.MetalLookAndFeel;

public class LookandFeel_work extends javax.swing.JFrame {
  JButton[] button = new JButton[6];
  String[] options = new String[] { "Metal", "CDE/Motif", "Windows XP", "Windows Classic", "GTK+", "Mac" };
  String[] classname = new String[] { "javax.swing.plaf.metal.MetalLookAndFeel", 
									  "com.sun.java.swing.plaf.motif.MotifLookAndFeel", 
									  "com.sun.java.swing.plaf.windows.WindowsLookAndFeel", 
									  "com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel", 
  									  "com.sun.java.swing.plaf.gtk.GTKLookAndFeel", 
  									  "com.sun.java.swing.plaf.mac.MacLookAndFeel" };
									 
									 
  public static void main(String[] args) {
    try {
      UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
    }
    catch(Exception e) {
      e.printStackTrace();
    }

    new LookandFeel_work();
  }

  // «Øºc¨ç¦¡
  public LookandFeel_work() {
    super("Look & Feel work");
    this.setLayout(new FlowLayout());
	
	for(int i=0;i<options.length;i++){
		button[i] = new JButton(options[i]);
		boolean bool = isLookAndFeelSupported(classname[i]);
		
		if(bool==true){
			button[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try{
						for(int i=0;i<options.length;i++){
							if(e.getActionCommand().equals(options[i])){
								UIManager.setLookAndFeel(classname[i]);
								update();
							}
						}
					}catch(Exception exc){
						exc.printStackTrace();
					}
				}
			});
		}
		else{
			button[i].setEnabled(false);
		}
		this.add(button[i]);
	}

    // Center the frame
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    Dimension frameSize = this.getSize();
    if (frameSize.height > screenSize.height)
      frameSize.height = screenSize.height;
    if (frameSize.width > screenSize.width)
      frameSize.width = screenSize.width;
    this.setLocation((screenSize.width - frameSize.width) / 2, (screenSize.height - frameSize.height) / 2);
	this.setSize(300, 150);
    this.setVisible(true);

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e) {
        System.exit(0);
      }
    });
  }
  
  public void update(){
	SwingUtilities.updateComponentTreeUI(this);
  }
  
  private boolean isLookAndFeelSupported(String lnfname){
	try{ 
		Class lnfclass = Class.forName(lnfname);
		javax.swing.LookAndFeel lnf = (LookAndFeel)(lnfclass.newInstance());
		return lnf.isSupportedLookAndFeel();
	}catch(Exception e){
		return false;	
	}
  }
}