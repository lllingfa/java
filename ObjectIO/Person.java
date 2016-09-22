package ObjectIO;

import java.io.*;

class Person implements Serializable{
	public static final long serialVersionUID = 42L;
String name;
transient int age;
//静态的不能被序列化
static String country="cn";
Person(String name,int age,String country){
	this.name=name;
	this.age=age;
	this.country=country;
}
public String toString(){
	return name+":"+age+":"+country;
}
}
