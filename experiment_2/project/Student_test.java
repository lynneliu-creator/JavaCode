package project;
import student.Student;

public class Student_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // 创建对象s1,s2
        Student s1 = new Student("001", "2", "小明","男", 20);
        Student s2 = new Student("010", "2", "小红", "女", 20);
         
        // 输出对象信息
        System.out.println("第一个学生：" + s1.toString());
        System.out.println("第二个学生：" + s2.toString());
         
        // 修改姓名和年龄
        s1.setName("小亮");
        s1.setAge(10);
        System.out.println("修改后第一个学生：" + s1.toString());
        System.out.println("修改后第二个学生：" + s2.toString());
         
        // 比较年龄并输出年龄大的对象
        if(s1.getAge() > s2.getAge()){
            System.out.println("年龄较大的学生是: " + s1.toString());
        }
        else{
            System.out.println("年龄较大的学生是: " + s2.toString());
        }
    }

}
