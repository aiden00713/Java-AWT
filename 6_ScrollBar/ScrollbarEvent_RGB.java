import java.awt.*;
import java.awt.event.*;

public class ScrollbarEvent_RGB extends java.awt.Frame implements AdjustmentListener {

  Scrollbar scrollbar[] = new Scrollbar[3] ;
  Panel colorPanel_all = new Panel();
  Panel colorPanel = new Panel();
  Panel colorPane2 = new Panel();
  Panel colorPane3 = new Panel();
  Label label = new Label();

  int red = 0;
  int green = 0;
  int blue = 0;

  public static void main(String args[]){
    new ScrollbarEvent_RGB();
  }
  
  // �غc�禡
  public ScrollbarEvent_RGB() {
    super("Scrollbar Event Demo");

    // �w�q Layout Manager �� BorderLayout
    setLayout(new BorderLayout());

    Panel panel = new Panel();
    panel.setLayout(new GridLayout(3, 1));
	colorPanel_all.setLayout(new GridLayout(3, 1));
	
    for (int i=0; i < 3; i++) {
      // �]�w�t�m��V���������b
      //     �ثe�Ȭ�0, ���b����j�p�Ȭ�0
      //     �̤p�Ȭ�0, �̤j�Ȭ�256
      scrollbar[i] = new Scrollbar(Scrollbar.HORIZONTAL, 0, 0, 0, 256);

      // ���U AdjustmentListener
      scrollbar[i].addAdjustmentListener(this);

      panel.add(scrollbar[i]);
    }
	
    label.setText("Red: " + red + ", Green: " + green + ", Blue: " + blue);
    colorPanel.setBackground(new Color(red,0,0));
	colorPane2.setBackground(new Color(0,green,0));
	colorPane3.setBackground(new Color(0,0,blue));
	
	colorPanel_all.add(colorPanel);
	colorPanel_all.add(colorPane2);
	colorPanel_all.add(colorPane3);
    this.add(panel,      BorderLayout.NORTH);
    this.add(colorPanel_all, BorderLayout.CENTER);
    this.add(label,      BorderLayout.SOUTH);


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

  public void adjustmentValueChanged(AdjustmentEvent e) {
    // ���o���ͽծըƥ󤧪��� 
    Scrollbar sb = (Scrollbar)(e.getAdjustable());

    // ���o���ͽծըƥ�ɱ��b���ثe��
    if (sb == scrollbar[0])
      red = sb.getValue();
    else if (sb == scrollbar[1])
      green = sb.getValue();
    else if (sb == scrollbar[2])
      blue = sb.getValue();
    
    label.setText("Red: " + red + ", Green: " + green + ", Blue: " + blue);
    colorPanel.setBackground(new Color(red,0,0));
	colorPane2.setBackground(new Color(0,green,0));
	colorPane3.setBackground(new Color(0,0,blue));
    
    // �^�ǲ��ͽծըƥ�ɤ�����
    int type = e.getAdjustmentType();
    
    switch (type) {
      case AdjustmentEvent.BLOCK_DECREMENT:
        System.out.println("BLOCK_DECREMENT");
        break;
      case AdjustmentEvent.BLOCK_INCREMENT:
        System.out.println("BLOCK_INCREMENT");
        break;
      case AdjustmentEvent.UNIT_DECREMENT:
        System.out.println("UNIT_DECREMENT");
        break;
      case AdjustmentEvent.UNIT_INCREMENT:
        System.out.println("UNIT_INCREMENT");
        break;
      case AdjustmentEvent.TRACK:
        System.out.println("TRACK");
        break;
      default:
        break;
    }
    
    if (e.getValueIsAdjusting())
      System.out.println("���b������Q�즲��");
  }
}