package initialpackage;

public class MainConsEx {

	public static void main(String[] args) {
		
		Rectangle area =new Rectangle();
		
		System.out.println(area.areaofrectangle());  //constructor overloading

		Rectangle area1= new Rectangle(100,60);
		
		System.out.println(area1.areaofrectangle());
	}

}
