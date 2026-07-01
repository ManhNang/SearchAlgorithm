import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();

        if (string == null || string.isEmpty()) {
            return;
        }

        StringBuilder max = new StringBuilder();
        StringBuilder current = new StringBuilder();

        current.append(string.charAt(0));
        max.append(string.charAt(0));

        // Độ phức tạp O(N)
        for (int i = 1; i < string.length(); i++) {
            char ch = string.charAt(i);

            if (ch > current.charAt(current.length() - 1)) {
                current.append(ch);
            } else {
                if (current.length() > max.length()) {
                    max.setLength(0);
                    max.append(current);
                }
                current.setLength(0);
                current.append(ch);
            }
        }

        if (current.length() > max.length()) {
            max.setLength(0);
            max.append(current);
        }

        System.out.println(max.toString());
    }
}