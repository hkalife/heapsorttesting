package heapsorttesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Heap Sort Test.
 */
class HeapSortTest {

    private HeapSort heapSort = new HeapSort();

    @Test
    void testSortPositiveArray() {
        final int[] testArray = {6, 3, 7, 1, 9, 5};
        final int[] expectedArray = {1, 3, 5, 6, 7, 9};
        heapSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    void testSortNegativeArray() {
        final int[] testArray = {-6, -3, -7, -1, -9, -5};
        final int[] expectedArray = {-9, -7, -6, -5, -3, -1};
        heapSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    void testSortMixedArray() {
        final int[] testArray = {1, -5, 7, -4, -2, 10, 20, -32};
        final int[] expectedArray = {-32, -5, -4, -2, 1, 7, 10, 20};
        heapSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    void testEmptyArray() {
        final int[] testArray = {};
        final int[] expectedArray = {};
        heapSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    void testNullArray() {
        final int[] testArray = null;
        final int[] expectedArray = null;
        heapSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

}
