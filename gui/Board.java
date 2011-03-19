package gui;

import javax.swing.*;
import java.awt.*;

public class Board
{
     // Creates a window
     static JFrame boardFrame = new JFrame("Tic Tac Toe");
     static Container pane    = boardFrame.getContentPane();
     static JButton[] buttons = new JButton[9];         

     public static void createAndShowBoard()
     {
          boardFrame.setSize(400, 400);
          boardFrame.setLocation(450, 300);
          boardFrame.setVisible(true);
          boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }

     public static void ticTacToeSquares()
     {
          pane.setLayout(new GridLayout(3, 3));
          for (int i = 0; i < buttons.length; i++)
          {
               buttons[i] = new JButton();
               pane.add(buttons[i]);
          }
     }
}
