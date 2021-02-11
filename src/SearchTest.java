import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SearchTest {

    @Test
    void    simpleAssertions() {
        List<Integer> arr = new ArrayList<>();

        for (int i = 1; i < 10; i++) {
            arr.add(i);
        }

        Assertions.assertEquals(LinearSearch.search(arr, 10), -1);
        Assertions.assertEquals(LinearSearch.search(arr, 5), 4);
        Assertions.assertEquals(LinearSearch.search(arr, 8), 7);
    }
}