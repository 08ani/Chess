////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

package chess;

/*************************************************************************************************************************************** 
 * @author Ayush Munjial
 * @author Hein Min Thu
***************************************************************************************************************************************/

public class Bishop extends Piece { public Bishop(ReturnPiece returnPiece) { super(returnPiece); }
    
    /**---------------------------------------------------------------------------------------------------------------------------------
	 * This method implements bishop-specific move validation logic.
	 * @return A boolean instance that has the result of the move.
	---------------------------------------------------------------------------------------------------------------------------------**/

    public boolean isValidMove(int X1, int Y1, int X2, int Y2, boolean isEmpty, Chess.Player player) { 

        int moveX, moveY; boolean isValid = false; moveX = Math.abs(X2 - X1); moveY = Math.abs(Y2 - Y1);
		if (moveX == moveY) { isValid = true; }

		return isValid;
    } 
}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////