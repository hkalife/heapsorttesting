package heapsorttesting;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Heap Sort Test.
 */
class HeapSortTest {

    private HeapSort heapSort = new HeapSort();

    @Test
    @Tag("testSortPositiveArray")
    void testSortPositiveArray() {
        final int[] testArray = {6, 3, 7, 1, 9, 5};
        final int[] expectedArray = {1, 3, 5, 6, 7, 9};
        heapSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    @Tag("testSortNegativeArray")
    void testSortNegativeArray() {
        final int[] testArray = {-6, -3, -7, -1, -9, -5};
        final int[] expectedArray = {-9, -7, -6, -5, -3, -1};
        heapSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    @Tag("testSortMixedArray")
    void testSortMixedArray() {
        final int[] testArray = {1, -5, 7, -4, -2, 10, 20, -32};
        final int[] expectedArray = {-32, -5, -4, -2, 1, 7, 10, 20};
        heapSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    @Tag("testEmptyArray")
    void testEmptyArray() {
        final int[] testArray = {};
        final int[] expectedArray = {};
        heapSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

    @Test
    @Tag("testNullArray")
    void testNullArray() {
        final int[] testArray = null;
        final int[] expectedArray = null;
        heapSort.sort(testArray);

        assertArrayEquals(testArray, expectedArray);
    }

}
