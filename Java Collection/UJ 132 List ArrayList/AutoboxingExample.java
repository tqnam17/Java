import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoboxingExample {

	public static void main(String[] args) {
		Integer autoBoxed = 15; // Autoboxing
		int autoUnboxed = autoBoxed; // Unboxing

		System.out.println("autoBoxed class: " + autoBoxed.getClass().getName());
		// System.out.println("autoUnboxed class: " + autoUnboxed.getClass().getName());
		// // Lỗi: int không có phương thức getClass()

		// Gọi phương thức có boxing/unboxing tự động
		Double resultBoxed = getLiteralDoublePrimitive(); // Autoboxing
		double resultUnboxed = getDoubleObject(); // Unboxing

		System.out.println("resultBoxed: " + resultBoxed);
		System.out.println("resultUnboxed: " + resultUnboxed);

		Integer[] wrapperArray = new Integer[5];
		wrapperArray[0] = 50;
		System.out.println(Arrays.toString(wrapperArray));

		System.out.println(wrapperArray[0].getClass().getName());

		Character[] characterArray = { 'a', 'b', 'c', 'd' };
		System.out.println(Arrays.toString(characterArray));

		var ourList = List.of(1, 2, 3, 4, 5);
		System.out.println(ourList);
		var a = getList(1,2,3);
		System.out.println(a);

	}

	private static ArrayList<Integer> getList(Integer... varargs) {

		ArrayList<Integer> aList = new ArrayList<>();
		for (int i : varargs) {
			aList.add(i);
		}
		return aList;
	}

	private static int returnAnInt(Integer i) {

		return i;
	}

	private static Integer returnAnInteger(int i) {

		return i;
	}

	private static Double getDoubleObject() {
		return Double.valueOf(100.00); // Trả về đối tượng Double
	}

	private static double getLiteralDoublePrimitive() {
		return 100.0; // Trả về kiểu double
	}
}