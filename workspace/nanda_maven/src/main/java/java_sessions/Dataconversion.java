package java_sessions;

public class Dataconversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="100";
System.out.println(a+20);


int i=Integer.parseInt(a);
System.out.println(i+20);

String Total="1000";
int k=Integer.parseInt(Total)+20;
System.out.println(k);

String b="200";
double d=Double.parseDouble(b);
System.out.println(d+200);

//String p = "100a";
//int q = Integer.parseInt(p);//NumberFormatException
//System.out.println(q+20);

//int to String:
int x=20;
System.out.println(x+20);
String y=String.valueOf(x);
System.out.println(y+60);

	}

}
