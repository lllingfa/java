package IO;
/*readline�������ַ���BufferedReader���еķ���
 * read���ֽ���InputStream�ķ���
 * InputStreamReader
 * �������Ļ������ɣ�
 * 1.��ȷԴ��Ŀ��
 * Դ�������� InputStream Reader
 * Ŀ�ģ������ OutputStream Writer
 * 2.�����������Ƿ��Ǵ��ı�
 * �ǣ��ַ���
 * ���ǣ��ֽ���
 * 3.����ϵ��ȷ������ȷҪʹ���ĸ�����Ķ���
 * ͨ���豸���л���
 * Դ�豸���ڴ棬Ӳ�̣�����
 * Ŀ���豸���ڴ棬Ӳ�̣�����̨
 * 1.��һ���ļ��е����ݴ洢����һ���ļ��У������ļ�
 * Դ���ļ���Ϊ��Դ������ʹ�ö�ȡ��  InputStream Reader
 * �ǲ��ǲ����ı��ļ�����ʱѡ��Reader
 * FIleReader fr=new FileReader("a.txt")
 * �Ƿ���Ҫ���Ч��
 * BufferedReader
 * BufferedReader bufr=new BufferedReader(fr)
 * ��������ȷҪʹ�ø���ϵ�е��ĸ�����
 * ��ȷ�豸��reader��ϵ�п��Բ����ļ��Ķ�����FileReader
 * Ŀ�ģ��ļ�
 *�Ƿ��Ǵ��ı�
 *�ǣ�Writer
 *�豸��Ӳ�̣�һ���ļ�
 *���Բ����ļ��Ķ���FileWriter
 *FileWriter fw=new DileWriter("b.txt")
 *BufferedWriter bufw=new BufferedWriter(fw)
 *-----------------------------------------------------
 *2.������¼������ݱ��浽һ���ļ���
 *Դ��InputStream Reader
 *�ǲ��Ǵ��ı�
 *Reader
 *�豸������
 *��Ӧ�Ķ�����System.in
 *��Ӧ�����ֽ�����ת���ַ���
 *InputStreamReader
 *BufferedReader
 *Ŀ�ģ�OutputStream Writer
 *�Ƿ��Ǵ��ı���Writer
 *�豸��Ӳ�̣�ʹ��FileWriter,ʹ��Ĭ�ϱ����
 *��չ������ָ���ı�����浽�ļ��У�utf-8��
 *ֻ��ת��������ָ��
 *OutputStreamWriter
 *
 *
 *
 * */
import java.io.*;
 class TransStreamDemo {
	public static void main(String[] args) throws IOException{
		//��ȡ����¼�����
		InputStream in=System.in;
		//���ֽ���תΪ�ַ���,ʹ��ת���� InputStreamReader
		InputStreamReader isr=new InputStreamReader(in);
	    //Ϊ�����Ч�ʣ����ַ������л�����������Ч��ȡ
		BufferedReader bufr=new BufferedReader(isr);
		//����¼�����д��
		BufferedReader bufr1=new BufferedReader(new InputStreamReader(System.in));
		BufferedReader bufr2=new BufferedReader(new InputStreamReader(new FileInputStream("D:\\Users\\admin\\workspace\\IO\\src\\IO\\Copypic.java")));
		OutputStream out=System.out;
		OutputStreamWriter osw=new OutputStreamWriter(out);
		BufferedWriter bufw=new BufferedWriter(osw);
		BufferedWriter bufw1=new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedWriter bufw2=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\Users\\admin\\workspace\\IO\\src\\IO\\Copy1.txt"),"UTF-8"));
		System.setIn(new FileInputStream("D:\\Users\\admin\\workspace\\IO\\src\\IO\\Copy1.txt"));
		System.setOut(new PrintStream("zz.txt"));
		String line=null;
		while((line=bufr2.readLine())!=null){
			if("over".equals(line))
				break;
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
			bufw2.write(line.toUpperCase());
			bufw2.newLine();
			bufw2.flush();
			//osw.write(line.toUpperCase()+"\r\n");
			//osw.flush();
			//System.out.println(line.toUpperCase());
		}
		bufr.close();
		bufr1.close();
		bufw2.close();
		bufw.close();
		bufw1.close();
		bufr2.close();
	}
}
