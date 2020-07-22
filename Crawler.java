package pachong;


import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler {
 
	//ѡ�����ҳ��/���
    private final static String theURL = "https://movie.douban.com/";
    //��ȡ�ĳ����Ӵ��·��
    private final static String theFILE = "D:/pachong/"+ "/URL.txt";
    //��ȡ����ҳ���ݴ��·��
    private final static String thePATH = "D:/pachong/"+ "/code";
    //������ʽ�������ж��Ƿ��Ƕ����Ӱ��ص���ַ
    private final static String theREGEX="https://movie.douban.com/[^\"]+";
    //ҳ�������
    private static int count=0;
   

    public static void main(String[] args) {
        PrintWriter urlwriter = null;
        try{
            //�����ļ����Ŀ¼
            File fileDir = new File(thePATH);
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }
 
            //����url.txt
            urlwriter = new PrintWriter(new FileWriter(theFILE),true);
            urlwriter.println(theURL);
 
            //��ʼ�ݹ�ץȡ��ҳ����ҳ����
            URLcrawler(theURL, urlwriter);
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(urlwriter != null) {
                    urlwriter.close();
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("��վ��ȡ���");
        System.out.println("һ����ȡ��"+count+"��ҳ��");
    }
 
 
    public static void URLcrawler(String URL, PrintWriter pw){
        URL url1=null;
        URLConnection urlconn=null;
        BufferedReader br=null;
        PrintWriter connwriter=null;
        
        Pattern pattern=Pattern.compile(theREGEX);
        try{
        	
        	String str=null;
        	url1=new URL(URL); 
        	urlconn=url1.openConnection();
        	urlconn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
        	Pattern pa = Pattern.compile("<title>.*?</title>");//Դ���б���������ʽ
        	Matcher ma = pa.matcher(URL);
        	while (ma.find())
             {
                 str=ma.group();
             }

            //����Դ�����ļ�
            count++;
            br=new BufferedReader(new InputStreamReader(urlconn.getInputStream(),"utf-8"));
            String line=null;
            connwriter = new PrintWriter(new FileWriter(thePATH +str+".txt"),true);
            	
            
            //��ȡ��ҳ�ļ� 
            while((line=br.readLine())!=null){
                //����ȡ��Դ��д���ļ�
                connwriter.println(line);
                Matcher matcher=pattern.matcher(line);
                //�ж��Ƿ���һ����ַ
                while(matcher.find()){
                   	if(check(matcher.group())){
                   		if(count==10000)
                         	break;
                        //����ȡ����ַд���ļ�
                    	System.out.println(matcher.group());
                        pw.println(matcher.group());
                        URLcrawler(matcher.group(), pw);
                    }
                }
            }
            System.out.println("��ȡ��ҳ" + URL + "�ɹ�");
            System.out.println("��ҳ" + URL + "��������ȡ���");
    }catch(Exception e){
        e.printStackTrace();
    }finally {
            try {
                if(br != null) {
                    br.close();
                }
                if(connwriter != null) {
                    connwriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
 
    public static boolean check(String url) {
        BufferedReader br = null;
        String str1;
        try {
            br = new BufferedReader(new FileReader(theFILE));          
            //�ж���վ�Ƿ��Ѿ����ʹ�
            while((str1 = br.readLine()) != null) {
                if(url.equals(str1)) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;
    }
}