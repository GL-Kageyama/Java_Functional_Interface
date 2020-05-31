import java.util.function.Supplier;

public class SupplierInterface {

	public static void main(String[] args) {

		Supplier <Integer> one   = () -> 10101010;
		Supplier <Integer> two   = () -> 20202020;
		Supplier <Integer> three = () -> 30303030;
		Supplier <Integer> four  = () -> 40404040;
		Supplier <Integer> five  = () -> 50505050;

		Integer num = one.get();
		System.out.println(num);

		num = two.get();
		System.out.println(num);

		num = three.get();
		System.out.println(num);		

		num = four.get();
		System.out.println(num);

		num = five.get();
		System.out.println(num);

	}

}

//============================================
//               Output Sample
//============================================

// $ javac SupplierInterface.java 
// $ java SupplierInterface
// 10101010
// 20202020
// 30303030
// 40404040
// 50505050

//============================================