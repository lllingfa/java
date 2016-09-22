package AWT;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

	
public class MyWindowDemo {
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
	ta.setText("");
	String dirPath =tf.getText();
	File dir=new File(dirPath);
			if(dir.exists()&&dir.isDirectory()){
				String[] names=dir.list();
				for(String name:names){
					ta.append(name+"\r\n");
				}
			}
			else{
				String info="your info "+dirPath+"is wrong ,please reenter";
				lab.setText(info);
				d.setVisible(true);
			}
/*	ta.setText(text);
	System.out.println(text);*/
	tf.setText("");
}
	public static void main(String[] args){
		new MyWindowDemo();
	}
}
