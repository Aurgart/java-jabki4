import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void sumArray() {
        Assertions.assertEquals(13, Main.sumArray(new int[]{1, 5, 7}));
    }

    @Test
    void findMin() {
        Assertions.assertEquals(-5, Main.findMin(new int[]{1, -5, 7}));
    }

    @Test
    void invertArray() {
        Assertions.assertArrayEquals(new int[]{5, 6, 7}, Main.invertArray(new int[]{7, 6, 5}));
    }

    @Test
    void checkSameElems() {
        Assertions.assertTrue(Main.checkSameElems(new int[]{5, 6, 7, 13, 5}));
    }

    @Test
    void absArr() {
        Assertions.assertArrayEquals(new int[]{5, 6, 7}, Main.absArr(new int[]{-5, 6, -7}));
    }

    @Test
    void get2SidedArr() {
        Assertions.assertArrayEquals(new int[][]{{1, 0, 0}, {0, 1, 0}}, Main.get2SidedArr(2, 3));
    }

    @Test
    void testSumArray() {
        Assertions.assertEquals(19, Main.sumArray(new int[][]{{1, 5, 7}, {2, 8, -4}}));
    }

    @Test
    void getMaxElem() {
        Assertions.assertEquals(8, Main.getMaxElem(new int[][]{{1, 5, 7}, {2, 8, -4}}, 0));
    }

    @Test
    void getMinElem() {
        Assertions.assertEquals(-4, Main.getMinElem(new int[][]{{1, 5, 7}, {2, 8, -4}}));
    }

    @Test
    void isSquareArray() {
        Assertions.assertTrue(Main.isSquareArray(new int[][]{{1, 5, 7}, {2, 8, -4}, {278, -150, 0}}));
    }
}