package com.commit.kata;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class BoardTest {

    @Test
    public void Given_AValidHeightAndWith_When_ABoardIsCreated_Then_AValidBoardIsCreated() {
        // given
        int width = 5;
        int height = 2;

        // when
        Board board = new Board(width, height);

        // then
        assertNotNull(board);
        assertEquals(height, board.getHeight());
        assertEquals(width, board.getWidth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void Given_ASmallBoard_When_ABoardIsCreated_Then_AExceptionShouldBeThrown() {
        // given
        int width = 3;
        int height = 1;

        // when
        Board wrongBoard = new Board(width, height);

    }

    @Test(expected = IllegalArgumentException.class)
    public void Given_AZeroSizeBoard_When_ABoardIsCreated_Then_AExceptionShouldBeThrown() {
// given
        int width = 0;
        int height = 0;

        // when
        Board wrongBoard = new Board(width, height);
    }


    @Test(expected = IllegalArgumentException.class)
    public void Given_ANegativeHeightAndWidth_When_ABoardIsCreated_Then_AExceptionShouldBeThrown() {
// given
        int width = -3;
        int height = -1;

        // when
        Board wrongBoard = new Board(width, height);
    }

}