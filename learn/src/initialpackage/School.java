package initialpackage;

public class School {

	public static void main(String[] args) {
		
		Students manisha = new Students();
		
		manisha.setStudentid(1);
		manisha.setStudentname("Maneesha");
		manisha.setStudentage(23);
		System.out.println(manisha.getStudentid() + manisha.getStudentname() + manisha.getStudentage());
	}

}
