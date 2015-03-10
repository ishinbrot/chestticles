package Implementation;

import java.awt.*;

/**
 * Created by ianshinbrot on 1/14/15.
 */
public class Queen extends ChessPiece {


    public Queen(Color color) {
        setColor(color);
        setPlayer(color);
        setName("Queen");
        if (getColor() == Color.white) {
            setImage("../Chess_Pictures/white/queen.png");
        }

        if (getColor() == Color.black) {
            setImage("../Chess_Pictures/black/queen.png");
        }
        setValue(10);
        setMoveLimit(8);
    }
    public boolean validMove(int[] initialPosition, int[] finalPosition, Square[] board, boolean lookForCheck){
        if (horizontal(initialPosition, finalPosition, board)||
                vertical(initialPosition, finalPosition, board)||
                diagonal(initialPosition, finalPosition, board)) {
            if (lookForCheck){
                if (check(initialPosition, finalPosition, board)){
                    return false;
                }

            }
            return true;
        }
        return false;
    }

}
