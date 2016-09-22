package AWT;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
/*菜单，打开和保存文件*/
public class MyMenuDemo {
	private Frame f;
	private MenuBar bar;
	private Menu fileMenu,subMenu;
	private MenuItem closeItem,subItem,openMenu,saveMenu;
	private FileDialog openDia,saveDia;
	private TextArea ta;
	private File file;
	MyMenuDemo(){
		init();
	}
	public void init(){
		f=new Frame("my window");
		f.setBounds(300,100,650,600);
		//f.setLayout(new FlowLayout());
		bar=new MenuBar();
		ta=new TextArea();
		fileMenu=new Menu("File");
		subMenu=new Menu("subMenu");
		subItem=new MenuItem("subItem");
		openMenu=new MenuItem("openMenu");
		saveMenu=new MenuItem("saveMenu");
		
		closeItem=new MenuItem("exit");
		subMenu.add(subItem);
		fileMenu.add(subMenu);
		fileMenu.add(closeItem);
		fileMenu.add(openMenu);
		fileMenu.add(saveMenu);
		bar.add(fileMenu);
		f.setMenuBar(bar);
		openDia=new FileDialog(f,"i need to open",FileDialog.LOAD);
		saveDia=new FileDialog(f,"i need to save",FileDialog.SAVE);
		f.add(ta);
		myEvent();
		f.setVisible(true);
		
	}
	private  void myEvent(){
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		saveMenu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(file==null){
				saveDia.setVisible(true);
				String dirPath=saveDia.getDirectory();
				String fileName=saveDia.getFile();
				if(dirPath==null||fileName==null){
					return;
				}
				File file=new File(dirPath,fileName);
				}
				try{
					BufferedWriter bufw=new BufferedWriter(new FileWriter(file));
					String text=ta.getText();
					bufw.write(text);
					bufw.close();
				}
				catch(IOException ex1){
					throw new RuntimeException();
				}
				
			}
		});
		openMenu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				openDia.setVisible(true);
				String dirPath=openDia.getDirectory();
				String fileName=openDia.getFile();
				System.out.println(dirPath+"..."+fileName);
				//处理异常
				if(dirPath==null||fileName==null){
					return;
				}
				ta.setText("");
				 file=new File(dirPath,fileName);
				try{
					BufferedReader bufr=new BufferedReader(new FileReader(file));
					String line=null;
					while((line=bufr.readLine())!=null){
						ta.append(line+"\r\n");
					}
				}
				catch(IOException ex){
					throw new RuntimeException("read wrong");
				}
			}
		});
		
	}
	public static void main(String[] args){
		new MyMenuDemo();
	}
}
