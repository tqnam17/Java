
public class Main {
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 5.5, 4.4, 3.3, 2.2, 1.1 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		String[] stringArray = { "B", "Y", "E" };

		displayArray(intArray);
		displayArray(doubleArray);
		displayArray(charArray);
		displayArray(stringArray);
		
		System.out.println(getFrist(intArray));
		System.out.println(getFrist(doubleArray));
		System.out.println(getFrist(charArray));
		System.out.println(getFrist(stringArray));

	}

	public static <Thing> void displayArray(Thing[] array) {
		for (Thing x : array) {
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static <Thing> Thing getFrist(Thing[] array) {
		return array[0];
	}
}
