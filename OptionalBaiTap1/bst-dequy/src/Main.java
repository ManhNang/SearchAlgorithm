import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(array));

        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();

        int result = binarySearch(array, 0, array.length - 1, value);

        if (result == -1) {
            System.out.println("Không tìm thấy phần tử " + value + " trong mảng.");
        } else {
            System.out.println("Phần tử " + value + " được tìm thấy tại chỉ số: " + result);
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (array[middle] == value) {
            return middle;
        }

        if (value > array[middle]) {
            return binarySearch(array, middle + 1, right, value);
        }

        return binarySearch(array, left, middle - 1, value);
    }
}