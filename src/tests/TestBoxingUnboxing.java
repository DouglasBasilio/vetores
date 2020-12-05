package tests;

public class TestBoxingUnboxing {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;
		
		System.out.println("Boxing: " + obj);
		
		int y = (int) obj;
		
		System.out.println("Unboxing: " + obj);

	}

}
