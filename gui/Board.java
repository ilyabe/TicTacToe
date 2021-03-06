package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board
{
     static JFrame boardFrame      = new JFrame("Tic Tac Toe");
     static Container pane         = boardFrame.getContentPane();
     static JButton[] squares      = new JButton[9];         
     private SquareHandler showXO  = new SquareHandler();

     public static void createAndShowBoard()
     {
          boardFrame.setSize(400, 400);
          boardFrame.setLocation(450, 300);
          boardFrame.setVisible(true);
          boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     public void ticTacToeSquares()
     {
          pane.setLayout(new GridLayout(3, 3));

          for (int i = 0; i < squares.length; i++)
          {
               squares[i] = new JButton();
               pane.add(squares[i]);
               squares[i].addActionListener(showXO);
               squares[i].setActionCommand("" + i);
          }
     }

     private class SquareHandler implements ActionListener
     {
          int moves                     = 0;
          int squareNumber              = 0;
          String squareClicked          = "";
          String playerSymbol           = "";
          boolean[] clickedSquares      = new boolean[9];
          int computerMove              = 0;
          final int MAX_NUMBER_OF_MOVES = 9; 

          // Computer player
          ComputerPlayer computer = new ComputerPlayer();
          
          public void actionPerformed(ActionEvent e)
          {
               squareClicked  = e.getActionCommand();            
               squareNumber   = Integer.parseInt(squareClicked); 
               playerSymbol   = getPlayerSymbol();              
               
               if (clickedSquares[squareNumber] == false)
               {
                    // Player's move
                    increaseTurnCountByOne();
                    squares[squareNumber].setText(playerSymbol);
                    clickedSquares[squareNumber] = true;

                    // Computer's response
                    if (moves < MAX_NUMBER_OF_MOVES) 
                    {
                         computerMove   = computer.move(clickedSquares);
                         playerSymbol   = getPlayerSymbol();
                         squares[computerMove].setText(playerSymbol);
                         increaseTurnCountByOne();
                         clickedSquares[computerMove] = true;
                    }
               }
          }

          public int increaseTurnCountByOne()
          {
               moves += 1;
               return moves;
          }

          public String getPlayerSymbol()
          {
               if (moves % 2 == 0) 
                    playerSymbol = "X";
               else
                    playerSymbol = "O";
               return playerSymbol;
          }
     }
}
