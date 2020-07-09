package java_sessions;

public class static_and_nonstatic_concept {
String name;
static int age=25;
	public static void main(String[] args) {
		
		// 1. how to call static data members: variables and methods
				// no need to create the object
				// a. call them directly
		getstart();
		System.out.println(age);
		
		
		
		//b.call them by classname
		static_and_nonstatic_concept.getstart();
         System.out.println(static_and_nonstatic_concept.age);
         
         
      // 2. how to call non static data members: var and methods:
 		// you have to create the object
         static_and_nonstatic_concept obj= new static_and_nonstatic_concept();
         obj.getname();
         obj.name="nanda";
         System.out.println(obj.name);
         
     //can I create the object wihout any reference?
         
         new static_and_nonstatic_concept();
         
         static_and_nonstatic_concept obj4=new static_and_nonstatic_concept();
         obj4.getname();
         obj4=null;
         obj4.getname();// null pointer exception
	}
	
	public void getname()
	{
		System.out.println("getname");
	}
	public static void getstart()
	{
		System.out.println("getstart");
	}

}
