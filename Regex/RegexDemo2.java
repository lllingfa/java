/*������ʽ�ĵ��ĸ�����
 * 4.��ȡ�����ַ����еķ��Ϲ�����Ӵ�ȡ��
 * �������裺
 * 1.��������ʽ��װ�ɶ���
 * 2.����������Ҫ�������ַ��������
 * 3�������󣬻�ȡ����ƥ������
 * 4.ͨ������Է��Ϲ�����Ӵ����в���������ȡ��*/
import java.util.regex.*;
public class RegexDemo2 {
	public static void main(String[] args){
		getDemo();
	}
	public static void getDemo(){
		String str="jdiha dheu deu  due";
		String reg="\\b[a-z]{3}\\b";
		//str="123";
		//String reg="[1-9]\\d[4,14]";
		//�������װ�ɶ���
        Pattern p=Pattern.compile(reg);
        //����������Ҫ���õ��ַ��������
        Matcher m=p.matcher(str);
      //  System.out.println(m.matches());//��ʵString���е�matches�������õľ���
        //������������ɵ�
        boolean b=m.find();//���������õ��ַ����ϣ������з��Ϲ���Ľ��
        System.out.println(m.group());//���ڻ�ȡƥ���Ľ����
        while(m.find()){
        	System.out.println(m.group());
        	System.out.println(m.start()+"..."+m.end());
        }
	}
}

