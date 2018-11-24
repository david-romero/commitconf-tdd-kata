package com.commit.kata;

public class Board {

    final int positions[][];
    final int width;
    final int height;
    static final int MINIMUN_WIDTH = 3;
    static final int MINIMUM_HEIGHT = 3;

    public Board(int width, int height) {
        if ( width < MINIMUN_WIDTH || height < MINIMUM_HEIGHT ){
            throw new IllegalArgumentException("Size is wrong");
        }
        this.width = width;
        this.height = height;
        this.positions = new int[width][height];
    }

    public int getHeight(){
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setValue(int value, int x, int y){
        this.positions[x][y] = value;
    }

    public int getValue(int x, int y){
        return this.positions[x][y];
    }

    public Board copy(){
        Board board =  new Board(this.width, this.height);
        for ( int x = 0; x < this.width; x ++ ){
            for ( int y = 0; y < this.height; y ++ ){
                board.setValue(this.getValue(x, y), x , y);
            }
        }
        return board;
    }
}
