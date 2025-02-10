package singletonDesignPattern;

public class EagerInitalization {

//	Issue with this approach 
//	whenever this class will be loaded the object will be created
	
	private static EagerInitalization singleObject = new EagerInitalization();
	
	private EagerInitalization() {
		
	}
	
	public static EagerInitalization getInstance() {
		return singleObject;
	}
}
