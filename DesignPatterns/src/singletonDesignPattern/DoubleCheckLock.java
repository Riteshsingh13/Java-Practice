package singletonDesignPattern;

public class DoubleCheckLock {
	
//	Issue with this approach 
//	it has memory issue which is resolve throw volatile instance variable.
	
	private static volatile DoubleCheckLock singleObject;

	private DoubleCheckLock() {

	}
	
	public static DoubleCheckLock getInstance() {
		if(singleObject == null) {
			synchronized (DoubleCheckLock.class) {
				if(singleObject == null) {
					singleObject = new DoubleCheckLock();
				}
			}
		}
		return singleObject;
	}
}
