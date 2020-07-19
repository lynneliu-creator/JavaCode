package student;

public class Student {
	private String number;
	private String classNum;
	private String name;
	private String sex;
	private int age;
	private int count=0;
	
	public Student(String number,String classNum,String name,String sex,int age) {
		this.number=number;
		this.classNum=classNum;
		this.name=name;
		this.sex=sex;
		this.age=age;
		count++;
	}
	
	//获得各属性的方法
	public String getNumeber() {
		return number;
	}
	public String getclassNum() {
		return classNum;
	}
	public String getName() {
		return name;
	}
	public String getSex() {
		return sex;
	}
	public int getAge() {
		return age;
	}
	
	//修改各属性的方法
	public void setNumeber(String number) {
		this.number=number;
	}
	
	public void setclassNum(String classNum) {
		this.classNum=classNum;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	//字符串
	public String toString() {
		return ("学号："+number+"  班号:"+classNum+"  姓名："+name+"  性别："+sex+"  年龄："+age);
	}
	//班级人数
	public int getCount() {
		return count;
	}

}
