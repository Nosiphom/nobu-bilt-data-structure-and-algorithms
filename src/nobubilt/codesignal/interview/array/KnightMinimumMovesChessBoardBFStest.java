package nobubilt.codesignal.interview.array;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class KnightMinimumMovesChessBoardBFStest {


    @Test
    public void test1() {
        assertEquals(6, KnightMinimumMovesChessBoardBFS.knightMoves(new int[8][8], new int[]{0, 0}, new int[]{7, 7}));
    }

    @Test
    public void test2() {
        assertEquals(0, KnightMinimumMovesChessBoardBFS.knightMoves(new int[8][8], new int[]{0, 0}, new int[]{0, 0}));
    }

    @Test
    public void test3() {
        assertEquals(0, KnightMinimumMovesChessBoardBFS.knightMoves(new int[8][8], new int[]{7, 7}, new int[]{7, 7}));
    }

    @Test
    public void test4() {
        assertEquals(4, KnightMinimumMovesChessBoardBFS.knightMoves(new int[8][8], new int[]{4, 4}, new int[]{6, 6}));
    }

    @Test
    public void test5() {
        assertEquals(4, KnightMinimumMovesChessBoardBFS.knightMoves(new int[8][8], new int[]{4, 4}, new int[]{2, 2}));
    }

    @Test
    public void test6() {
        assertEquals(6, KnightMinimumMovesChessBoardBFS.knightMoves(new int[8][8], new int[]{7, 0}, new int[]{0, 7}));
    }

    @Test
    public void test7() {
        assertEquals(3, KnightMinimumMovesChessBoardBFS.knightMoves(new int[8][8], new int[]{3, 3}, new int[]{3, 6}));
    }

    @Test
    public void test8() {
        assertEquals(3, KnightMinimumMovesChessBoardBFS.knightMoves(new int[8][8], new int[]{2, 2}, new int[]{5, 2}));
    }

    @Test
    public void test9() {
        assertEquals(2, KnightMinimumMovesChessBoardBFS.knightMoves(new int[8][8], new int[]{4, 5}, new int[]{2, 1}));
    }

    @Test
    public void test10() {
        assertEquals(5, KnightMinimumMovesChessBoardBFS.knightMoves(new int[8][8], new int[]{7, 0}, new int[]{0, 0}));
    }

    @Test
    public void test11() {
        assertEquals(6, KnightMinimumMovesChessBoardBFS.knightMoves(new int[8][8], new int[]{7, 7}, new int[]{0, 0}));
    }
}
