import org.example.MergeSort;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MergeSortTest {
    static MergeSort mergeSort;

    @BeforeAll
    static void createMergeSortTest() {
        mergeSort = new MergeSort();
    }

    @Test
    void first() {
        assertArrayEquals(new int[] {1, 2, 3}, mergeSort.sortArray(new int[] {3, 2, 1}));
    }
}
