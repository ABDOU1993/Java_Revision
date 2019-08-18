package LambdaFunctions;

public class TestLambdaFunction  {
	public static void main(String[] args) {
		String word = "Hello";
		LambdaFunction2 lambdaFunction = ()->System.out.println(word+"ay");
		
		// word="aa"; this is error  ...
		// error: local variables referenced from a lambda expression must 
		// be final or effectively final
		
		lambdaFunction.call();
	}

}
