package singletonDesignPattern;

public class LazyInitalization {
	
//	Issue with this approach 
//	it will be break in multithreaded environment
	
	private static LazyInitalization singleObject;
	
	private LazyInitalization() {
		
	}
	
	public static LazyInitalization getInstance() {
		if(singleObject == null) {
			singleObject = new LazyInitalization();
		}
		return singleObject;
	}

}
