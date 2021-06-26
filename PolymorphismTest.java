package basic;





class Australia{
	
	private int firstDose;
	private int secondDose;
	private int people;
	
	public void sum(int firstDose, int secondDose) {
		
		people = firstDose+ secondDose;
		
	}
	
	public int sum(int num, int num1, int num2) {
		
		people = firstDose;
		
		return people;
	}
	
}

public class PolymorphismTest {
	
	public static void main(String[] args) {
		
		Australia vaccine = new Australia();
		
	
		vaccine.sum(15,11,8);
		
		//System.out.printf("Total vaccinating prople: "+vaccine.sum(5, 11));
		
	}

	
	
}
