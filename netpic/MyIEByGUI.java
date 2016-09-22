
import java.awt.*;
import java.awt.event.*;
import java.io.File;

	
 class MyWindowDemo {
	private Frame f;
	private TextField tf;
	private Button but;
	private TextArea ta;
	private Dialog d;
	private Label lab;
	private Button okBut;
	MyWindowDemo(){
		init();
	}
	public void init(){
		f=new Frame("my window");
		f.setBounds(300,100,600,500);
		f.setLayout(new FlowLayout());
		tf=new TextField(60);
		but=new Button("change to");
		ta=new TextArea(25,70);
		d=new Dialog(f,"提示信息-self",true);
		d.setBounds(400,200,240,150);
		d.setLayout(new FlowLayout());
		lab=new Label();
		okBut=new Button("确定");
		d.add(lab);
		d.add(okBut);
		f.add(tf);
		f.add(but);
		f.add(ta);
		myEvent();
		f.setVisible(true);
	}
	private  void myEvent(){
		okBut.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				d.setVisible(false);
			}
		});
		tf.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==KeyEvent.VK_ENTER)
					showDir();
			}
		});
		but.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				showDir();
			}
		});
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		d.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				d.setVisible(false);
			}
		});
	}
private  void showDir(){
	String url=tf.getText();
	int index1=url.indexOf("//")+2;
	int index2=url.indexOf("/",index1);
	String str=url.substring(index1, index2);
	String path=url.substring(index2);
	ta.setText(str+"..."+path);
	
}
	public static void main(String[] args){
		new MyWindowDemo();
	}
}

public class MyIEByGUI {

}
