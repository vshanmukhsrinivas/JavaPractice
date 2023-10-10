import java.util.Scanner;
import java.util.ArrayList;

public class sahaj1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> heights = new ArrayList<Integer>(n);
        for (int i = 0; i < n; ++i) {
            heights.add(sc.nextInt());
        }
        int max_height = 0;
        long total_height = 0;
        for (int i = 0; i < n; ++i) {
            total_height += heights.get(i);
            if (heights.get(i) > max_height) {
                max_height = heights.get(i);
            }
        }
        long days_required = (long) max_height * n - total_height;
        System.out.println(days_required - 1);
    }
}
