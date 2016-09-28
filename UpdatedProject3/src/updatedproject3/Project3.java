/**
 *
 * Authors: Clement Dikoko & Austin Anderson
 * Purpose: This program will run a separate window with a gui panel
 * that let's you play tic tac toe. 
 * Instructions: To start a game press the start button. Press on the box you
 * would like to claim as yours with an X or an O depending on player turn.
 * 
 */

package updatedproject3;


public class Project3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TicTacToe TTT = new TicTacToe();
        
        TTT.launchFrame();
    }
    
}
