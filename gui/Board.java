package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board
{
     static JFrame boardFrame      = new JFrame("Tic Tac Toe");
     static Container pane         = boardFrame.getContentPane();
     static JButton[] buttons      = new JButton[9];         
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

          for (int i = 0; i < buttons.length; i++)
          {
               buttons[i] = new JButton();
               pane.add(buttons[i]);
               buttons[i].addActionListener(showXO);
               buttons[i].setActionCommand("Button" + i);
          }
     }

     private class SquareHandler implements ActionListener
     {
          int moves                = 0;
          String playerSymbol      = "";
          String buttonClicked     = "";
          boolean[] clickedSquares = new boolean[9];
          
          public void actionPerformed(ActionEvent e)
          {
               buttonClicked  = e.getActionCommand();
               playerSymbol   = getPlayerSymbol();
               
               if (clickedSquares[0] == false && buttonClicked.equals("Button0"))
               {
                    increaseTurnCountByOne();
                    buttons[0].setText(playerSymbol);
                    clickedSquares[0] = true;
               }
               if (clickedSquares[1] == false && buttonClicked.equals("Button1"))
               {
                    increaseTurnCountByOne();
                    buttons[1].setText(playerSymbol);
                    clickedSquares[1] = true;
               }
               if (clickedSquares[2] == false && buttonClicked.equals("Button2"))
               {
                    increaseTurnCountByOne();
                    buttons[2].setText(playerSymbol);
                    clickedSquares[2] = true;
               }
               if (clickedSquares[3] == false && buttonClicked.equals("Button3"))
               {
                    increaseTurnCountByOne();
                    buttons[3].setText(playerSymbol);
                    clickedSquares[3] = true;
               }
               if (clickedSquares[4] == false && buttonClicked.equals("Button4"))
               {
                    increaseTurnCountByOne();
                    buttons[4].setText(playerSymbol);
                    clickedSquares[4] = true;
               }
               if (clickedSquares[5] == false && buttonClicked.equals("Button5"))
               {
                    increaseTurnCountByOne();
                    buttons[5].setText(playerSymbol);
                    clickedSquares[5] = true;
               }
               if (clickedSquares[6] == false && buttonClicked.equals("Button6"))
               {
                    increaseTurnCountByOne();
                    buttons[6].setText(playerSymbol);
                    clickedSquares[6] = true;
               }
               if (clickedSquares[7] == false && buttonClicked.equals("Button7"))
               {
                    increaseTurnCountByOne();
                    buttons[7].setText(playerSymbol);
                    clickedSquares[7] = true;
               }
               if (clickedSquares[8] == false && buttonClicked.equals("Button8"))
               {
                    increaseTurnCountByOne();
                    buttons[8].setText(playerSymbol);
                    clickedSquares[8] = true;
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
