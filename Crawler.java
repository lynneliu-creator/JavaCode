package pachong;


import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Crawler {
 
	//选择的主页面/入口
    private final static String theURL = "https://movie.douban.com/";
    //获取的超链接存放路径
    private final static String theFILE = "D:/pachong/"+ "/URL.txt";
    //获取的网页数据存放路径
    private final static String thePATH = "D:/pachong/"+ "/code";
    //正则表达式，用于判断是否是豆瓣电影相关的网址
    private final static String theREGEX="https://movie.douban.com/[^\"]+";
    //页面计数器
    private static int count=0;
   

    public static void main(String[] args) {
        PrintWriter urlwriter = null;
        try{
            //创建文件存放目录
            File fileDir = new File(thePATH);
            if (!fileDir.exists()) {
                fileDir.mkdirs();
            }
 
            //创建url.txt
            urlwriter = new PrintWriter(new FileWriter(theFILE),true);
            urlwriter.println(theURL);
 
            //开始递归抓取网页及网页数据
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
        System.out.println("网站爬取完成");
        System.out.println("一共爬取了"+count+"个页面");
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
        	Pattern pa = Pattern.compile("<title>.*?</title>");//源码中标题正则表达式
        	Matcher ma = pa.matcher(URL);
        	while (ma.find())
             {
                 str=ma.group();
             }

            //生成源代码文件
            count++;
            br=new BufferedReader(new InputStreamReader(urlconn.getInputStream(),"utf-8"));
            String line=null;
            connwriter = new PrintWriter(new FileWriter(thePATH +str+".txt"),true);
            	
            
            //爬取网页文件 
            while((line=br.readLine())!=null){
                //把爬取的源码写入文件
                connwriter.println(line);
                Matcher matcher=pattern.matcher(line);
                //判断是否是一个网址
                while(matcher.find()){
                   	if(check(matcher.group())){
                   		if(count==10000)
                         	break;
                        //把爬取的网址写入文件
                    	System.out.println(matcher.group());
                        pw.println(matcher.group());
                        URLcrawler(matcher.group(), pw);
                    }
                }
            }
            System.out.println("爬取网页" + URL + "成功");
            System.out.println("网页" + URL + "内链接爬取完成");
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
            //判断网站是否已经访问过
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