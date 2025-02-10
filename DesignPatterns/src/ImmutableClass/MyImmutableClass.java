package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

// Object state cann't be change once created
final class MyImmutableClass {

//	Declare class as final
//	All class members should be private
//	Class members are initialized only once using constructor
//	Should not be any setter methods
//	getter methods only And return copy of the member variable
//	Example: String, Wrapper Classes etc.
	
	private final String name;
	private final List<Object> petName;
	
	MyImmutableClass(String name, List<Object> petName) {
		this.name = name;
		this.petName = petName;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Object> getPetName(){
//		this is required, because making list final.
//		means you can not point it to new list, but still can add, delete values in it.
//		so that's why we send the copy of it.
		return new ArrayList<>(petName);
	}
	
	
}
