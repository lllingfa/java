package class2;
/*��̬���������Ϊ������ڵĶ���������̬
 * �ˣ��У�Ů
 * ���è ����
 * è x=new è������
 * ���� x=new è������
 *��ߴ������չ��
 *��̬��ǰ�᣺�������й�ϵ��Ҫô�̳У�Ҫôʵ��
 *���ڸ���
 *�׶ˣ�ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա
 */
abstract class Animal{
	abstract void eat();
}

class Cat extends Animal{
	public void eat(){
		System.out.println("eat fish");}
		public void catchMouse(){
			System.out.println("catch mouse");
		}
	
}
class Dog extends Animal{
	public void eat(){
		System.out.println("eat bone");
	}
	public void eatBone(){
		System.out.println("eatBone");
	}
}



public class DuoTai {
	public static void main(String[] args){
		Cat c=new Cat();
		c.eat();
		Dog d=new Dog();
		d.eat();
		Cat c1=new Cat();
		function(c1);
		function(new Dog());
		//����ת��,��ε����������з���
		Animal a=new Dog();
		Dog d1=(Dog)a;
		d1.eatBone();
		/*�����Խ��������ת����������
		 * ������ת���Ǹ�������ָ�����Լ����������ʱ����Ӧ�ÿ��Ա�������
		 * Ҳ���Ա�ǿ��ת������̬��ʼ���ն������������ű仯
		 * Animal a=new Animal();
		//Cat c=(Cat)a;
		����*/
	}
	public static void function(Cat c){
		c.eat();
	}
	public static void function(Animal c){
		//animal c=new Dog();��������������ת��
		c.eat();
		//�ж��ǲ���ĳ��
		if(c instanceof Cat){
			Cat a=(Cat)c;
			a.catchMouse();
		}
	}
}
