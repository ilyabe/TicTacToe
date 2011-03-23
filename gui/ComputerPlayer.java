package gui;
import java.util.*;

public class ComputerPlayer 
{
     static int randomMove              = 0;
     static Vector<String> takenSquares = new Vector<String>();
     
     public int move(boolean[] board)
     {
          randomMove = (int)(9 * Math.random());
          vectorizeBoardArray(board);
          generateRandomMove();
          takenSquares.clear();
          return randomMove;
     }

     public static Vector<String> vectorizeBoardArray(boolean[] board)
     {
          for (int i = 0; i < board.length; i++) 
          {
               if (board[i] == true)
                    takenSquares.addElement("true");
               if (board[i] == false)
                    takenSquares.addElement("false");
          }

          return takenSquares; 
     }

     public static int generateRandomMove()
     {
          while (takenSquares.elementAt(randomMove) == "true") 
               randomMove = (int)(9 * Math.random());

          return randomMove;
     }
}
