package SavingResults;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CollectorsToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frenchCounting = "un:deux:trois:quatre";
		List gmailList = Pattern.compile(":").splitAsStream(frenchCounting)
				.collect(Collectors.toList());
		gmailList.forEach(System.out::println);
	}

}
