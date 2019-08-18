package collections;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] temperatureArray = { 31.1, 30.0, 32.5, 34.9, 33.7, 27.8 };
		System.out.println("The original array is: " + Arrays.toString(temperatureArray));
		List<Double> temperatureList = Arrays.asList(temperatureArray);
		temperatureList.set(0, 35.2);
		// you cannot add --> java.lang.UnsupportedOperationException
		temperatureList.add(22.0); 
		System.out.println("The modified array is: " + Arrays.toString(temperatureArray));
	}

}
