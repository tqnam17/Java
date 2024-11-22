
public class Main2 {
	public static void main(String[] args) {
		MyGenericsClass<Integer,Integer> myInt = new MyGenericsClass<>(1,9);
		MyGenericsClass<Double, Double> myDouble = new MyGenericsClass<>(3.14,1.01);
	//	MyGenericsClass<Character,Character> myCharacter = new MyGenericsClass<>('@','$');
	//	MyGenericsClass<String, String> myString = new MyGenericsClass<>("Hello", "!");

		System.out.println(myInt.getVlue());
		System.out.println(myDouble.getVlue());
	//	System.out.println(myCharacter.getVlue());
	//	System.out.println(myString.getVlue());
	}
}
