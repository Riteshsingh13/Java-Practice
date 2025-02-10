package singletonDesignPattern;

//will make use of nested class because nested class will not loaded until it will be referred

public class BillPughSolution {

	private BillPughSolution() {
		
	}
	
	private static class nestedClass{
		private static final BillPughSolution signleObject = new BillPughSolution();
	}
	
	public static BillPughSolution getInstance() {
		return nestedClass.signleObject;
	}
}
