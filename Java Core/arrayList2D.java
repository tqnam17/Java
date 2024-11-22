import java.util.ArrayList;

public class arrayList2D {
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> numbersList = new ArrayList();

		ArrayList<String> nb = new ArrayList();
		nb.add("1");
		nb.add("2");
		nb.add("3");
		System.out.println(nb);

		ArrayList<String> nb1 = new ArrayList();
		nb1.add("5");
		nb1.add("6");
		nb1.add("7");

		ArrayList<String> nb2 = new ArrayList();
		nb2.add("8");
		nb2.add("9");
		nb2.add("10");

		numbersList.add(nb);
		numbersList.add(nb1);
		numbersList.add(nb2);

		System.out.println(numbersList.get(2).get(2));
	}
}
