import java.util.*;

public class sahaj2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.nextLine();
        String[] arr_words = scanner.nextLine().split(" ");
        String req = scanner.nextLine().trim();
        Set<String> word_set = new HashSet<>(Arrays.asList(arr_words));

        if (solve(req, word_set)) {
            System.out.println("Harry");
        } else {
            System.out.println("Voldemort");
        }
    }

    public static boolean solve(String word, Set<String> word_set) {
        if (word.length() == 0) {
            return true;
        }
        for (int i = 1; i <= word.length(); i++) {
            String pre = word.substring(0, i);
            if (word_set.contains(pre) && solve(word.substring(i), word_set)) {
                return true;
            }
        }
        return false;
    }
}