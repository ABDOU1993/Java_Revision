package LambdaFunctions;

public class BlockLambda {

	interface LambdaFunction {
		String intKind(int i);
	}

	public static void main(String[] args) {
		LambdaFunction lambdaFunction = (a) -> {
			if (a % 2 == 0)
				return "even";
			else
				return "odd";
		};

		System.out.println(lambdaFunction.intKind(5));

	}

}
