import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayListQuery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int d = scanner.nextInt(); // Number of integers on this line
            ArrayList<Integer> list = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                list.add(scanner.nextInt());
            }

            lists.add(list);
        }
        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int x = scanner.nextInt(); 
            int y = scanner.nextInt(); 

            if (x > 0 && x <= lists.size() && y > 0 && y <= lists.get(x - 1).size()) {
                System.out.println(lists.get(x - 1).get(y - 1));
            } else {
                System.out.println("ERROR!");
            }
        }

        scanner.close();
    }
}
