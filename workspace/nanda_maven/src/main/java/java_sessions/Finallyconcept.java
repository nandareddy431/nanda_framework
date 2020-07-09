package java_sessions;

public class Finallyconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int p= getnumber ();
System.out.println(p);

	
}
public static int  getnumber(){
	int a=10;
	int b=20;
	try{
	int c=a/0;
	return c;
	}
	catch(Exception e){
		return -1;
	}
	/*finally{
	System.out.println("bye!!!");
	int age=100;
	return age;
	}*/
}
}
