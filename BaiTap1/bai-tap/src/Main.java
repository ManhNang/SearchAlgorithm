import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        LinkedList<Character> max = new LinkedList<>();
        max.add(string.charAt(0));
        // Độ phức tạp O(N)
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) > max.getLast()) {
                max.add(string.charAt(i));
            }
        }

        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}