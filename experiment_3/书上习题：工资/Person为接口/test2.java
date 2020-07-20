package project2;


public class test2 {

	public static void main(String[] args) {
		
		// 实现多态性
		Person t=new Teacher();
		System.out.println("教师的工资支出是："+t.pay());
		Person s=new CollegeStudent();
		System.out.println("学生的工资支出是："+s.pay());
	}

}
