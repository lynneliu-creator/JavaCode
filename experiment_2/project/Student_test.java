package project;
import student.Student;

public class Student_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  // ��������s1,s2
        Student s1 = new Student("001", "2", "С��","��", 20);
        Student s2 = new Student("010", "2", "С��", "Ů", 20);
         
        // ���������Ϣ
        System.out.println("��һ��ѧ����" + s1.toString());
        System.out.println("�ڶ���ѧ����" + s2.toString());
         
        // �޸�����������
        s1.setName("С��");
        s1.setAge(10);
        System.out.println("�޸ĺ��һ��ѧ����" + s1.toString());
        System.out.println("�޸ĺ�ڶ���ѧ����" + s2.toString());
         
        // �Ƚ����䲢��������Ķ���
        if(s1.getAge() > s2.getAge()){
            System.out.println("����ϴ��ѧ����: " + s1.toString());
        }
        else{
            System.out.println("����ϴ��ѧ����: " + s2.toString());
        }
    }

}
