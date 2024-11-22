
public class arrays2D {
	public static void main(String[] args) {
		String[][] number = new String[3][3];

		number[0][0] = "1";
		number[0][1] = "2";
		number[0][2] = "3";
		number[1][0] = "4";
		number[1][1] = "5";
		number[1][2] = "6";
		number[2][0] = "7";
		number[2][1] = "8";
		number[2][2] = "9";
		System.out.println(number.length);
		for (int i = 0; i < number.length; i++) {
			System.out.println();
			for (int j = 0; j < number[i].length; j++) {
				System.out.print(number[i][j]);
			}

		}

	}
}
