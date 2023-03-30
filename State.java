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
    private int fCurrentTurn;
    private int[] fGameState;
    /**
     * Find out in which cell the last move was made
     * 
     * @return - Represents where in the array the cell is
     */
    private State fParent;

    public State(int moveMade, int currentTurn, int[] gameState, State parent)
    {
        fMoveMade = moveMade;
        fCurrentTurn = currentTurn;
        fGameState = gameState;
        fParent = parent;
    }





    public int getfMoveMade() {
        return fMoveMade;
    }

    public int getfCurrentTurn() {
        return fCurrentTurn;
    }

    public int[] getfGameState() {
        return fGameState;
    }

    public State getfParent() {
        return fParent;
    }
}
