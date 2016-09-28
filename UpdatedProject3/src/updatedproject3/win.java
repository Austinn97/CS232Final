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

import javax.swing.JButton;
import javax.swing.JOptionPane;


public class win {
    public boolean ggwp;
    private JButton winButton[];
    
    public win(boolean finishHim, JButton getWinButton[]){
        winButton = getWinButton;
        ggwp = finishHim;
        
    }
    public boolean winner(){
    for(int i=1; i<=7; i++){
        if (ggwp == false){
            if (i == 1) {
                    // checking for diagonal win
                    whoWon(i, i + 4, i + 8);
                }
                if (i <= 3) {
                    // checking for column win
                    whoWon(i, i + 3, i + 6);
                }
                if (i == 1 || i == 4 || i == 7) {
                    // checking for row win
                    whoWon(i, i + 1, i + 2);
                }
                if (i == 3) {
                    // checking for inverse diagonal win
                    whoWon(i, i + 2, i + 4);
                }
        }
        }
    return ggwp;
    }
    
    //Finds winner
    public void whoWon(int a, int b, int c){
        // if X wins
        if (winButton[a].getText().equals("X")) {
            if (winButton[b].getText().equals("X")) {
                if (winButton[c].getText().equals("X")) {
                    showWinner("Player 1 (X) wins...maybe next time Player 2");
                }
            }
        }
        // if O wins
        if (winButton[a].getText().equals("O")) {
            if (winButton[b].getText().equals("O")) {
                if (winButton[c].getText().equals("O")) {
                    showWinner("Player 2 (O) wins!...Player 1 is a noob");
                }
            }
        }
    }
    //Displays pop-up with winner name
    public void showWinner(String xoWin){
        if (ggwp == false) {
            JOptionPane.showMessageDialog(null, xoWin);
            for (int k=1; k<10; k++) {
                winButton[k].setEnabled(false);
            }
            ggwp = true;

        }
 
   
}
    //Displays pop-up with "tie"
    public void tie(){
        JOptionPane.showMessageDialog(null, "IT'S A TIE!");
        ggwp = true;

    }
    
    public void setToFalse(){
        ggwp = false;
    }
    
   
    
    
}
  
    

