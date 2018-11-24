package com.commit.kata;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlayerTest {

    Player player;

    @Before
    public void setUp(){
        player = new Player();
    }

    @Test
    public void Given_AMockedBoard_When_PlayerIsCheckingCells_Then_ACell_IsAlive(){
        List<Board> boardList = new ArrayList<>();


        // given
        int width = 3;
        int height = 3;
        Board mockedBoard = new Board(4, 4);
        Board board = new Board(width, height);
        board.setValue(1, 1,1);

        for (int firstOne = 1; firstOne <= 9; firstOne++){
            int row = firstOne % width;
            int column = (firstOne/width ) -1;

            board.setValue(1,row, column);
            for ( int secondOne = 0; secondOne < 3; secondOne++ ){
                int row2 = secondOne % width;
                int column2 = (secondOne/width ) -1;

                if(board.getValue(row2,column2) != 1){
                    board.setValue(1,row2, column2);
                }
                boardList.add(board.copy());
            }
        }


        boardList.forEach(board -> assertTrue(player.surviveCell(1,1)));
    }

}
