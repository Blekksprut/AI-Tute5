/**
 * A game State contains information pertaining to the state of the Tic Tac Toe board at any given move.
 * 
 * @author Steven Morris
 * @version 23/02/2016
 */
public class State
{    
    //What cell was clicked to make this state, listed from 0 - 8
    //This is used by the GUI, but you could also use it for your search
    private int fMoveMade;
    /**
     * Find out in which cell the last move was made
     * 
     * @return - Represents where in the array the cell is
     */

    public int getfMoveMade() {
        return fMoveMade;
    }

}
