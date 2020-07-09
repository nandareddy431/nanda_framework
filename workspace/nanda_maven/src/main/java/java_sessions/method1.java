package java_sessions;

public class method1 {
String header;
String Title;
String url;
static String logo="http://www.aws3.amazon.com/images/logo.png";
	public static void main(String[] args) {
		method1 m1= new method1();
		method1 m2= new method1();
		method1 m3= new method1();
		
		m1.Title="login page";
		m1.header="login to app";
		m1.url="http://abc.com/login";
		
		m2.Title="home page";
		m2.header="welcome to homepage";
		m2.url="http://abc.com/login";
		
System.out.println(m1.Title+ ":" +m1.header+ ":"+m1.url);
       m1.toppanel();
       System.out.println(m3.header);
       
	}
	
	
	
public void toppanel()
{
	System.out.println("toppanel");
	System.out.println("leftpanel");
}
public void leftpanel()
{
	System.out.println("leftpanel");
}
public void footerlinks()
{
	System.out.println("footerlinks");
	
}
public void privacy()
{
	System.out.println("privacy");
	
}
}
