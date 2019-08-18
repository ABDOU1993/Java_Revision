package genericsExample1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RawTest2 {
	public static void main(String[] args) {

		List list = new LinkedList();
		list.add("First");
		list.add("Second");
		List strList = list;
		strList.add(10); // compiles fine, results in runtime exception

		for (Iterator<String> itemItr = strList.iterator(); itemItr.hasNext();)
			System.out.println("Item : " + itemItr.next());
	}

}
