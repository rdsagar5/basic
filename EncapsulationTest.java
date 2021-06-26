package basic;


    class Bio{
    	
	private String name;
	private int age;
	
	public void setName(String name) {
		
		this.name  =	name ;
		
	}
	
	public void setAge(int age ) {
		
		this.age  =	age ;
	}

	public String getName() {
		
		return name;
	}
	
	public int getAge() {
		
		return age;
	}
	}
	
	public class EncapsulationTest {
		
	public static void main(String[] args) {
		
		Bio test = new Bio();
		
		test.setName("Sagar");
		test.setAge(23);
		
		
		System.out.println("Hello " +test.getName()+ " you are "+test.getAge()+" years old?");
	}
	
}
