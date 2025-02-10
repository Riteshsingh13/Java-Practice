package singletonDesignPattern;

public class SyncronizationBlock {

//	Issue with this approach 
//	it is slow
	private static SyncronizationBlock singleObject;

	private SyncronizationBlock() {

	}

	synchronized public static SyncronizationBlock getInstance() {
		if (singleObject == null) {
			singleObject = new SyncronizationBlock();
		}
		return singleObject;
	}

}
