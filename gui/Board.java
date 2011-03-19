package gui;

import javax.swing.*;

public class Board 
{
     public static void createAndShowBoard()
     {
          // Creates a window
          JFrame boardFrame = new JFrame("Tic Tac Toe");
          boardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          // Sets size of the window
          boardFrame.setSize(400, 400);

          boardFrame.setVisible(true);
     }
}
