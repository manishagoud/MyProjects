
public class HelloWorld {

	private String message;
	private String message1;
	
	   /*public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }   
	      public void init()
	      {
	          System.out.println("Bean is going through init.");
	       }
	       public void destroy() 
	       {
	          System.out.println("Bean will destroy now.");
	       }*/
	       
	       public void setMessage(String message){
	    	      this.message = message;
	    	   }
	    	   public void setMessage1(String message){
	    	      this.message1 = message;
	    	   }
	    	   public void getMessage(){
	    	      System.out.println("World Message : " + message);
	    	   }
	    	   public void getMessage1(){
	    	      System.out.println("World Message1 : " + message1);
	    	   }
	       
}
