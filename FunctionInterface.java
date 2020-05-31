import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {

		Function <Integer, String> zero = b -> "0" + b + "0" + b + "0" + b + "0" + b + "0" + b + "0";

		String one = zero.apply(1);
		System.out.println(one);

		String two = zero.apply(2);
		System.out.println(two);

		String three = zero.apply(3);
		System.out.println(three);

		String four = zero.apply(4);
		System.out.println(four);

		String five = zero.apply(5);
		System.out.println(five);			
	}

}

//============================================
//               Output Sample
//============================================

// $ javac FunctionInterface.java 
// $ java FunctionInterface
// 01010101010
// 02020202020
// 03030303030
// 04040404040
// 05050505050

//============================================