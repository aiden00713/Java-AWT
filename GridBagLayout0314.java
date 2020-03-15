import java.awt.*;

public class GridBagLayout0314 extends java.awt.Frame{
	public static void main (String args[]){
		new GridBagLayout0314();
	}

	public GridBagLayout0314(){
		Button button;
		GridBagLayout gridbaglayout = new GridBagLayout();
		GridBagConstraints gbConstraints = new GridBagConstraints();
		
		// �w�q Layout Manager �� GridBagLayout
		setLayout(gridbaglayout);
    
		// ������������
		gbConstraints.fill = GridBagConstraints.BOTH;
		
		// �̥[�v��Ҥ��t���󶡤�����V�B�~���ϰ�
		gbConstraints.weightx = 0.5;
		
		
		button = new Button("1");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		button = new Button("2");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		button = new Button("3");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		button = new Button("4");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER����񺡩ҳѦC��
		button = new Button("5");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.gridwidth = GridBagConstraints.RELATIVE; //RELATIVE����񺡦̫ܳ�@�ӳ椸�e
		button = new Button("6");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER����񺡩ҳѦC��
		button = new Button("7");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		button = new Button("8");
		gbConstraints.gridwidth = 2;
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER����񺡩ҳѦC��
		button = new Button("9");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		// �]�w����t�m�ɩҦ��ڰϰ�C���ƥ�
		gbConstraints.gridwidth = 2;          
		// �]�w����t�m�ɩҦ��ڰϰ�檺�ƥ�
		gbConstraints.gridheight = 7;
		// �̥[�v��Ҥ��t���󶡫�����V�B�~���ϰ�
		gbConstraints.weighty = 1.0;
		button = new Button("10");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER����񺡩ҳѦC��
		gbConstraints.gridheight = 1;      
		button = new Button("11");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER����񺡩ҳѦC��
		gbConstraints.gridheight = 1;      
		button = new Button("12");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = GridBagConstraints.REMAINDER; //REMAINDER����񺡩ҳѦC��
		gbConstraints.gridheight = 1;      
		button = new Button("13");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = 2; 
		gbConstraints.gridheight = 1;
		gbConstraints.gridx = 3;  //��button4�ӹ���A�q0��}�l��b��3��
		gbConstraints.gridy = 6;  //�q0�C�}�l�p��A�b��6�C
		button = new Button("14");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = 1; 
		gbConstraints.gridheight = 1;
		gbConstraints.gridx = 2;  //��button3�ӹ���A�q0��}�l��b��2��
		gbConstraints.gridy = 7;  //�q0�C�}�l�p��A�b��7�C
		button = new Button("15");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = 1; 
		gbConstraints.gridheight = 1;
		gbConstraints.gridx = 3;  //��button4�ӹ���A�q0��}�l��b��3��
		gbConstraints.gridy = 8;  //�q0�C�}�l�p��A�b��8�C
		button = new Button("16");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		gbConstraints.weighty = 0.0;       
		gbConstraints.gridwidth = 1; 
		gbConstraints.gridheight = GridBagConstraints.REMAINDER;  //REMAINDER����񺡩ҳѦ��
		gbConstraints.gridx = 4;  //��button5�ӹ���A�q0��}�l��b��4��
		gbConstraints.gridy = 9;  //�q0�C�}�l�p��A�b��9�C
		button = new Button("17");
		gridbaglayout.setConstraints(button, gbConstraints);
		add(button);
		
		this.setSize(300,300);
		this.setVisible(true);
	}
}