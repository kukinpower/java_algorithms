import java.util.ArrayList;
import java.util.List;

public class LinearSearch {

    public static int search(List<Integer> arr, int n) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == n) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            arr.add(i);
        }

        System.out.println(search(arr, 10)); // -1
        System.out.println(search(arr, 5)); // 4
        System.out.println(search(arr, 7)); // 6

    }
}
