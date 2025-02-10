package singletonDesignPattern;

public class MainClass {

	public static void main(String[] args) {
		
		EagerInitalization obj1 = EagerInitalization.getInstance();
		EagerInitalization obj2 = EagerInitalization.getInstance();
		EagerInitalization obj3 = EagerInitalization.getInstance();
		
		LazyInitalization obj4 = LazyInitalization.getInstance();
		LazyInitalization obj5 = LazyInitalization.getInstance();
		LazyInitalization obj6 = LazyInitalization.getInstance();
		
		SyncronizationBlock obj7 = SyncronizationBlock.getInstance();
		SyncronizationBlock obj8 = SyncronizationBlock.getInstance();
		SyncronizationBlock obj9 = SyncronizationBlock.getInstance();
		
		DoubleCheckLock obj10 = DoubleCheckLock.getInstance();
		DoubleCheckLock obj11 = DoubleCheckLock.getInstance();
		DoubleCheckLock obj12 = DoubleCheckLock.getInstance();
		
		BillPughSolution obj13 = BillPughSolution.getInstance();
		BillPughSolution obj14 = BillPughSolution.getInstance();
		BillPughSolution obj15 = BillPughSolution.getInstance();
		
		SingleEnum objEnum = SingleEnum.INSTANCE;
		
		
		
		System.out.println(obj1 +"\n"+ obj2 +"\n"+ obj3);
		System.out.println(obj4 +"\n"+ obj5 +"\n"+ obj6);
		System.out.println(obj7 +"\n"+ obj8 +"\n"+ obj9);
		System.out.println(obj10 +"\n"+ obj11 +"\n"+ obj12);
		System.out.println(obj13 +"\n"+ obj14 +"\n"+ obj15);
		System.out.println(objEnum);

	}

}
