﻿# CS232Final

I created this program for my final project in my java class using the NetBeans IDE. It is a very simple program that runs a gui (graphical user interface) that allows you to play tic tac toe. Tic tac toe is a game where you have nine blank spaces, or in this case buttons. You have two players, one that will mark "X" into the empty spaces, and the other will mark "O". The goal of the game is to get your letter ("X" or "O") horizontally, vertically, or diagonally on the board three times in a row. The first thing I had to do was make the gui. I made a public class named "gui" where I created the frame, grid with six buttons by using a for loop, and the start button. I also set the turn to initially be "X" and the spaces left to be nine. Next, I made a function called launchFrame which is what you use to make the gui actually come to life. In this function I set up the button listener, layouts, added buttons to the gui, and added the button you see that says “Turn: X” or “Turn: O” depending on whose turn it is. At the bottom of this file I made functions that either returned or set values so that I could use them in the next class that I made, ButtonListener. This is the file that tells the buttons what to do when a user clicks on them. The first button I implemented was the start button, which when pressed, enables all of the buttons on the grid, sets the text on the nine buttons to be blank, sets the turn to “X”, and sets the turn button to display “Turn: X”. So, essentially, this button starts the first game and resets the grid after a game is finished and you would like to play again. After this, I set the turn system up so that the gui knows when to use “X” and when to use “O”. And then I check for the winner by using a function I created in my next class called win. In this class I made a function that will check for diagonal, horizontal, vertical, and inverse diagonal wins and return the result. The next function I made was called whoWon and it finds out wether player “X” or “O” won. ShowWinner is the function that enables and sets the dialog box that will come up when the game is over and tell you who won and display a button that says ok. Tie is a function I made to display a dialog box to tell the players that nobody won. The last class was called TicTacToe which contains the main. The main simply creates a new gui and launches the game. Once the game appears on the screen the first player, which will be “X”, will select the first button he would like to place his mark. Then “O” will do the same. This will go back and forth until a winner is declared or the game is declared a tie. When this happens a dialog box will pop up and tell you who won or that the game is a tie. You should press the ok button and if you want to play again simply press the start button. 







