package project4;

public class StringFunction {
	

	public void StringSort(String s1) {//将字符串按Unicode字典顺序排序
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
		
		System.out.println("排序后的字符串为："+ buf1);
	}
	
	public void Countchar(String s1) {//统计每个字符出现的次数和位置
		StringBuffer[] buf1=new StringBuffer[s1.length()];
		
		int bufnum=1,i,j;
		int flag=0;
		buf1[0]=new StringBuffer();
		buf1[0].append(s1.charAt(0));//字符
		buf1[0].append(0);//位置
		
		
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
			System.out.print("字符："+buf1[i].charAt(0)+"一共出现了 "+(buf1[i].length()-1)+" 次  出现在位置:");
			for(j=1;j<buf1[i].length();j++) {
		        System.out.print(" "+buf1[i].charAt(j));
			}
			System.out.println();
		}
			
	}

	public void WordinString(String s1) {//单词个数，正逆序输出
		String [] words;
		words=s1.split("\\t|\\r| ");
		System.out.println("单词个数："+words.length);
		
		System.out.println("正向输出单词：");
		for(int i=0;i<s1.length();i++) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
		System.out.println("逆向输出单词：");
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i));
		}
			
	}
	
	

}
