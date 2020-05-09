import java.awt.*;
import java.awt.event.*;

public class CustomDialog_work extends java.awt.Frame implements ActionListener{
  public static void main(String args[]){
    new CustomDialog_work();
  }
  
  String menulabel[]={"File"};
  String menuitemlabel[][]={ { "New", "Open", "-", "Save", "Save As...", "-", "Exit" } };
  Menu menu[] = new Menu[1];
  MenuItem menuitem[][] = new MenuItem[1][7];
  Label label = new Label();

  public CustomDialog_work(){
	super("CustomDialog work");
	BorderLayout borderlayout = new BorderLayout();
	add(label,BorderLayout.SOUTH);
	
	// �إ߿��C
	MenuBar menuBar = createMenuBar();
	// �w�q�����ϥΪ̤��������C
    setMenuBar(menuBar);
	
	this.setSize(300,300);
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
  
  private MenuBar createMenuBar() {
    // �إ߿��C
    MenuBar menuBar = new MenuBar();

    // �إ߿��
    for (int i=0; i<menulabel.length; i++){
      // �إ߿��
      menu[i] = new Menu(menulabel[i]);
      menu[i].setFont(new Font("Consolas", Font.PLAIN, 10));

      // �s�W���ܿ��C
      menuBar.add(menu[i]);
    }
	
	for(int i=0; i<menulabel.length; i++){  //0-1-2-3
      for(int j=0; j<menuitemlabel[i].length; j++){ 
		menuitem[i][j] = new MenuItem(menuitemlabel[i][j]);
		menuitem[i][j].setFont(new Font("Consolas", Font.PLAIN, 10));
		menuitem[i][j].addActionListener(this);
		menu[i].add(menuitem[i][j]);
	  }
	}
	return menuBar;
  }
  
  // ��@ActionListener��������k
  public void actionPerformed(ActionEvent e) {
    // ���o���Ͱʧ@�ƥ󪺿�涵��
    MenuItem menuitem = (MenuItem)e.getSource();

    if (menuitem.getLabel().equals("New")) {
	  CustomDialog customDialog = new CustomDialog(this,"New","New Dialog Demo.", true);
	  
	  if(customDialog.getState()){
		  label.setText("Select OK Button.");
	  }else{
		  label.setText("Select Cancel Button.");
	  }
    }
	else if (menuitem.getLabel().equals("Open")) {
	  FileDialog fileDialog = new FileDialog(this, "Open File",FileDialog.LOAD);
      Filter filter = new Filter("java");
      fileDialog.setFilenameFilter(filter);
      fileDialog.setVisible(true);
      label.setText("File Selected: " + fileDialog.getDirectory() + fileDialog.getFile());
	}
	else if (menuitem.getLabel().equals("Save")) {
	  FileDialog fileDialog = new FileDialog(this,"Save File",FileDialog.SAVE);
      Filter filter = new Filter("java");
      fileDialog.setFilenameFilter(filter);
      fileDialog.setVisible(true);
      label.setText("File Selected: " + fileDialog.getDirectory() + fileDialog.getFile());
	}
	else if (menuitem.getLabel().equals("Save As...")) {
	  CustomDialog customDialog = new CustomDialog(this,"Save As...","Save As... Dialog Demo.", true);

      if (customDialog.getState()) {
        label.setText("Select OK Button.");
      } else {
        label.setText("Select Cancel Button.");
      } 
	}
	else if (menuitem.getLabel().equals("Exit")) {
      System.exit(0);
    } 
  }
}