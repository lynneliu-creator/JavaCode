package project4;

public class StringFunction {
	

	public void StringSort(String s1) {//���ַ�����Unicode�ֵ�˳������
		StringBuffer buf1=new StringBuffer(s1.length());
		buf1.append(s1.charAt(0));
		
		int i,j;
		for(i=1;i<s1.length();i++){
			for(j=0;j<i;j++){
				if(s1.charAt(i)<buf1.charAt(j))
					break;
			}
			buf1.insert(j, s1.charAt(i));
		}
		
		System.out.println("�������ַ���Ϊ��"+ buf1);
	}
	
	public void Countchar(String s1) {//ͳ��ÿ���ַ����ֵĴ�����λ��
		StringBuffer[] buf1=new StringBuffer[s1.length()];
		
		int bufnum=1,i,j;
		int flag=0;
		buf1[0]=new StringBuffer();
		buf1[0].append(s1.charAt(0));//�ַ�
		buf1[0].append(0);//λ��
		
		
		for(i=1;i<s1.length();i++) {
			for(j=0;j<bufnum;j++) {
				if(s1.charAt(i)==buf1[j].charAt(0)) {
					buf1[j].append(i); 
					flag=1;
					break;
				}
			}
			if(flag==0) {
				buf1[bufnum]=new StringBuffer();
				buf1[bufnum].insert(0,s1.charAt(i));
				buf1[bufnum].insert(1,i);
				bufnum++;
			}
			flag=0;
		}
		
		for(i=0;i<bufnum;i++) {
			System.out.print("�ַ���"+buf1[i].charAt(0)+"һ�������� "+(buf1[i].length()-1)+" ��  ������λ��:");
			for(j=1;j<buf1[i].length();j++) {
		        System.out.print(" "+buf1[i].charAt(j));
			}
			System.out.println();
		}
			
	}

	public void WordinString(String s1) {//���ʸ��������������
		String [] words;
		words=s1.split("\\t|\\r| ");
		System.out.println("���ʸ�����"+words.length);
		
		System.out.println("����������ʣ�");
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		System.out.println("����������ʣ�");
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
			
	}
	
	

}
