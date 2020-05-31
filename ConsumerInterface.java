import java.util.function.Consumer;

public class ConsumerInterface {

	public static void main(String[] args) {

		Consumer <Integer> zero = b -> System.out.println("0" + b + "0" + b + "0" + b + "0" + b + "0" + b + "0");

		zero.accept(1);

		zero.accept(2);

		zero.accept(3);

		zero.accept(4);

		zero.accept(5);

	}

}

//============================================
//               Output Sample
//============================================

// $ javac ConsumerInterface.java 
// $ java ConsumerInterface
// 01010101010
// 02020202020
// 03030303030
// 04040404040
// 05050505050

//============================================