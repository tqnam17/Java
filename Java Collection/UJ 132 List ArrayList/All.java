
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

record GroceryItem(String name, String type, int count) {

	public GroceryItem(String name) {
		this(name, "DAIRY", 1);
	}

	@Override
	public String toString() {
		return String.format("%d %s in %s", count, name.toUpperCase(), type);
	}
}

public class All {

	public static void main(String[] args) {

		GroceryItem[] groceryArray = new GroceryItem[3];
		groceryArray[0] = new GroceryItem("milk");
		groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
		groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 5);
		System.out.println(Arrays.toString(groceryArray));

		ArrayList objectList = new ArrayList();
		objectList.add(new GroceryItem("Butter"));
		objectList.add("Yogurt");
		System.out.println(objectList);

		ArrayList<GroceryItem> groceryList = new ArrayList<>();
		groceryList.add(new GroceryItem("Butter"));
		groceryList.add(new GroceryItem("milk"));
		groceryList.add(new GroceryItem("oranges", "PRODUCE", 5));
		groceryList.set(0, new GroceryItem("apples", "PRODUCE", 6));
		groceryList.remove(1);
		System.out.println(groceryList);
		System.out.println("\n2" + "-".repeat(20));

		// -------------
		String[] items = { "apples", "bananas", "milk", "eggs" };
		List<String> list = List.of(items); // Sử dụng List.of() để tạo danh sách không thay đổi:
		System.out.println(list);

		ArrayList<String> groceries = new ArrayList<>(list);
		groceries.add("yogurt");
		System.out.println(groceries);

		ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
		System.out.println(nextList);

		groceries.addAll(nextList);
		System.out.println(groceries);

		System.out.println("Third item = " + groceries.get(2));

		if (groceries.contains("mustard")) {
			System.out.println("List contains mustard");
		}

		groceries.add("yogurt");
		System.out.println("first = " + groceries.indexOf("yogurt"));
		System.out.println("last = " + groceries.lastIndexOf("yogurt"));

		System.out.println(groceries);
		groceries.remove(1);
		System.out.println(groceries);
		groceries.remove("yogurt");
		System.out.println(groceries);

		groceries.removeAll(List.of("apples", "eggs"));
		System.out.println(groceries);

		groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
		System.out.println(groceries);

		groceries.clear();
		System.out.println(groceries);
		System.out.println("isEmpty = " + groceries.isEmpty());

		groceries.addAll(List.of("apples", "milk", "mustard", "cheese"));
		groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

		System.out.println(groceries);
		groceries.sort(Comparator.naturalOrder());
		System.out.println(groceries);

		groceries.sort(Comparator.reverseOrder());
		System.out.println(groceries);
		System.out.println("----");
		var groceryArray1 = groceries.toArray(new String[groceries.size()]);
		System.out.println(Arrays.toString(groceryArray));
		System.out.println("\n3" + "-".repeat(20));
		// -----------

		ArrayList<String> arrayList = new ArrayList<>();  	// Sử dụng ArrayList
		arrayList.add("Apple");
		arrayList.add("Banana");
		arrayList.add("Cherry");
		System.out.println("ArrayList: " + arrayList);

		LinkedList<String> linkedList = new LinkedList<>();  	// Sử dụng LinkedList
		linkedList.add("Dog"); 
		linkedList.add("Cat");
		linkedList.add("Bird");
		System.out.println("LinkedList: " + linkedList);

		System.out.println("Duyệt qua ArrayList bằng Iterator:");  		// Ví dụ về Iterators
		var iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}
