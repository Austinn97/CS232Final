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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener {
    private TicTacToe gameOn;
    
    public ButtonListener(TicTacToe getValues){
        gameOn = getValues;
    }
    
  
    public void actionPerformed(ActionEvent event){
        win action = new win(gameOn.getFinished(), gameOn.getButton1());
        
        //If user presses the start button
        if (event.getActionCommand() == "Start"){
            for (int i=1; i<10; i++){
                gameOn.getButton(i).setEnabled(true);
                gameOn.getButton(i).setText("");
                gameOn.setTurnX(true);
                gameOn.getButton(0).setText("Player 1 (X)");
                
            }
        
            gameOn.setFinished(false);
            action.setToFalse();
            gameOn.setSpacesLeft(9); }
            
            //Playing the game
            for (int i=1; i<10; i++){
                if (event.getSource().equals(gameOn.getButton(i))){
                if (gameOn.getTurnX()){
                    gameOn.getButton(i).setText("X");
                    gameOn.getButton(i).setEnabled(false);
                    gameOn.SubtractSpacesLeft();
                    gameOn.getButton(0).setText("Player 2 (O)");
                    gameOn.setTurnX(false);
                }
                else if (gameOn.getTurnX() == false) {
                            gameOn.getButton(i).setText("O");
                            gameOn.getButton(i).setEnabled(false);
                            gameOn.SubtractSpacesLeft();
                            gameOn.setTurnX(true);
                            gameOn.getButton(0).setText("Player 1 (X)");
            }
          }    
            
            //checking for win
            gameOn.setFinished(action.winner()); 

            //checking for tie
            if (gameOn.getSpacesLeft()== 0 && gameOn.getFinished()== false) { 
                action.tie();
            }
            
            }
        
    }
}
    

