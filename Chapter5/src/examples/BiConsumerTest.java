package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest {

	public static void main(String[] args) {

		BiConsumer<List<Integer>, Integer> listAddElement = List::add;
		List aList = new ArrayList();
		listAddElement.accept(aList, 10);
		listAddElement.accept(aList, 20);
		listAddElement.accept(aList, 30);
		System.out.println(aList);

	}

}
