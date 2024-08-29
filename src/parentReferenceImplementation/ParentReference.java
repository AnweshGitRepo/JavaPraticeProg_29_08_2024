package parentReferenceImplementation;

public class ParentReference extends AB {
	
		   public void a()
		   {
		      System.out.println("Inside Overriding Method A");
		   }
		   public void b()
		   {
		      System.out.println("Inside Method B");
		   }
		   @SuppressWarnings("unused")
		   public static void main(String[] args) 
		   {
		      //AB obj=new AB();
		      //obj.a();
		      AB abc=new ParentReference();
		      abc.a();
		      ParentReference abx=new ParentReference();
		      abx.a();
		      abx.b();
		      //ParentReference ABy=new AB();
		   }
}
