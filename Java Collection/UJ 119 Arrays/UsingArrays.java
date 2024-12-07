import java.util.Arrays;
import java.util.Random;

public class UsingArrays {
    public static void main(String[] args) {
        // Tạo mảng ngẫu nhiên
        int[] firstArray = getRandomArray(10);
        System.out.println("Mảng ngẫu nhiên: " + Arrays.toString(firstArray));

        // Sắp xếp mảng
        Arrays.sort(firstArray);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(firstArray));

        // Điền giá trị vào mảng
        int[] secondArray = new int[10];
        Arrays.fill(secondArray, 5);
        System.out.println("Mảng sau khi điền giá trị 5: " + Arrays.toString(secondArray));

        // Sao chép mảng
        int[] thirdArray = getRandomArray(10);
        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println("Mảng sao chép: " + Arrays.toString(fourthArray));

        // Sao chép một phần mảng
        int[] smallerArray = Arrays.copyOf(thirdArray, 5);
        System.out.println("Mảng sao chép 5 phần tử: " + Arrays.toString(smallerArray));
    }

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newArray = new int[len];
        for (int i = 0; i < len; i++) {
            newArray[i] = random.nextInt(100); // Random number between 0 and 99
        }
        return newArray;
    }

	
}