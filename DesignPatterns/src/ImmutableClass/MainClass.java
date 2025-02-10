package ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {
		List<Object> petName = new ArrayList<>();
		petName.add("CJ");
		petName.add("muku");
		
		MyImmutableClass imClass = new MyImmutableClass("MyName", petName);
		imClass.getName();
		System.out.println(imClass.getPetName());
		imClass.getPetName().add("Shishimaru");
		System.out.println(imClass.getPetName());
	}

}
