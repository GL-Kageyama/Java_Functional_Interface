import java.util.function.Predicate;

public class PredicateInterface {

	public static void main(String[] args) {

		Predicate <String> empCheck = b -> b.isEmpty();

		String number = "";

		boolean numFlg1 = empCheck.test(number);
		System.out.println(numFlg1);

		number = "01010101010";

		boolean numFlg2 = empCheck.test(number);
		System.out.println(numFlg2);

		number = "";

		boolean numFlg3 = empCheck.test(number);
		System.out.println(numFlg3);
		
	}

}

//============================================
//               Output Sample
//============================================

// $ javac PredicateInterface.java 
// $ java PredicateInterface
// true
// false
// true

//============================================