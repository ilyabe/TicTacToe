package gui;

import javax.swing.*;

public class Board 
{
     public static void createAndShowBoard()
     {
          JFrame boardFrame = new JFrame("Tic Tac Toe");
          boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          JLabel boardLabel = new JLabel("Tic Tac Toe");
          boardFrame.getContentPane().add(boardLabel);

          boardFrame.pack();
          boardFrame.setVisible(true);
     }
}
