package examples;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierUse {

	public static void main(String[] args) {

		Supplier<String> currentDateTime = 
				() -> LocalDateTime.now().toString();
		System.out.println(currentDateTime.get());
	}

}
