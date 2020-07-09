package java_sessions;
class Test
{
	@Override
	public void finalize(){
		System.out.println("this is test--finalize method");
		
	}
	}
public class Finalizeconcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalizeconcept fc= new Finalizeconcept();
		fc=null;
		Test t =new Test();
		t=null;
		System.gc();//will call GC
		//System.out.println("GC is done.....");

	}
	@Override
	public void finalize()
	{
		System.out.println("this is finalize method......");
	}
}
