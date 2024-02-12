package poo.Model.Pieces;

import poo.Model.Piece;

public class Knight extends Piece {

    
    /** 
     * @param movX
     * @param movY
     * @param canMoveBack
     * @param x
     * @param y
     * @param color
     * @return 
     */
    public Knight(int movX, int movY, boolean canMoveBack, int x, int y, String color) {
        super(movX, movY, canMoveBack, x, y, color);
    }
    
}
