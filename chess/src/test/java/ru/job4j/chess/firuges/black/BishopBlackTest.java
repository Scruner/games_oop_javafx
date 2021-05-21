package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import static org.junit.Assert.*;

public class BishopBlackTest {

    @Test
    public void whenPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.position();
    }

    @Test
    public void whenWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] expected = {Cell.C1, Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertEquals(expected, bishopBlack.way(Cell.G5));
    }

    @Test
    public void isDiagonal() {
    }

    @Test
    public void whenCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        bishopBlack.copy(Cell.G5);
    }
}