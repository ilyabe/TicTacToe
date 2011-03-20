package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board
{
     static JFrame boardFrame = new JFrame("Tic Tac Toe");
     static Container pane    = boardFrame.getContentPane();
     static JButton[] buttons = new JButton[9];         
     private SquareHandler showXO = new SquareHandler();

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
          int moves = 0;
          
          public void actionPerformed(ActionEvent e)
          {
               String buttonClicked     = e.getActionCommand();
               String playerSymbol      = "";
               int turns                = findWhoseTurnItIs();

               if (turns % 2 == 0) 
                    playerSymbol = "O";
               else
                    playerSymbol = "X";
               
               if (buttonClicked.equals("Button0"))
                    buttons[0].setText(playerSymbol);
               else if (buttonClicked.equals("Button1")) 
                    buttons[1].setText(playerSymbol);
               else if (buttonClicked.equals("Button2"))
                    buttons[2].setText(playerSymbol);
               else if (buttonClicked.equals("Button3"))
                    buttons[3].setText(playerSymbol);
               else if (buttonClicked.equals("Button4"))
                    buttons[4].setText(playerSymbol);
               else if (buttonClicked.equals("Button5"))
                    buttons[5].setText(playerSymbol);
               else if (buttonClicked.equals("Button6"))
                    buttons[6].setText(playerSymbol);
               else if (buttonClicked.equals("Button7"))
                    buttons[7].setText(playerSymbol);
               else if (buttonClicked.equals("Button8"))
                    buttons[8].setText(playerSymbol);
          }

          public int findWhoseTurnItIs()
          {
               moves += 1;
               return moves;
          }
     }
}
