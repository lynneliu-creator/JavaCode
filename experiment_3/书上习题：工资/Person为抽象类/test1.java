package project;

public class test1 {

	public static void main(String[] args) {
		
		//ʵ�ֶ�̬��
		Person t=new Teacher();
		System.out.println("��ʦ�Ĺ���֧���ǣ�"+t.pay());
		Person s=new CollegeStudent();
		System.out.println("ѧ���Ĺ���֧���ǣ�"+s.pay());
	}
}
