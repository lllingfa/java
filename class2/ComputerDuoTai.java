package class2;

/*class MainBoard{
	public void run(){
		System.out.println("mainboard run");
	}
	public void useNetCard(NetCard c){
      c.open();
      c.close();
	}
}

class NetCard{
	public void open(){
		System.out.println("netcard open");
		
	}
	public void close(){
		System.out.println("netcard close");
	}
}
*/
interface PCI{
	public void open();
	public void close();
}
class MainBoard{
	public void run(){
		System.out.println("mainboard run");
	}
	public void usePCI(PCI p){
		if(p!=null){
		p.open();
		p.close();}
	}
}
class NetCard implements PCI{
	public void open(){
		System.out.println("netcard open");
	}
	public void close(){
		System.out.println("netcard close");
	}
}
//���ݿ�Ĳ���

/*
 * 1.�������ݿ� JDBC Hibernate
 * 2.�������ݿ�
 * c create r read u update d delete
 * 3.�ر����ݿ�����*/
public class ComputerDuoTai {
	public static void main(String[] args){
		/*MainBoard mb=new MainBoard();
		mb.run();
		mb.useNetCard(new NetCard());*/
		MainBoard mb=new MainBoard();
		mb.run();
		mb.usePCI(null);
		mb.usePCI(new NetCard());
	}
}
