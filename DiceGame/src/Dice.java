import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JOptionPane;

public class Dice {

  public int WINTOTAL = 0;

  public Dice() { // constructor

  }

  public int rollDice() { //calculate random value between 1 to 6
    Random randomNumber = new Random();
    int number = randomNumber.nextInt(6) + 1;
    return number;
  }

  public String getResult() {  //generate results
    WINTOTAL = 0;
    String result = "";
    for (int i = 0; i < 3; i++) {
      int gameRound = i+1;
      int value1 = rollDice();   //roll dice 1
      int value2 = rollDice();   //roll dice 2
      WINTOTAL = WINTOTAL + value1 + value2;  // calculate total value
      
      if (value1 == 1 && value2 == 1) {  //check both dices getting 1
        JOptionPane.showMessageDialog(null, "Game "+gameRound+": Won on Roll #1 with Die #1=1 and Die #2=1", "Result",
            JOptionPane.INFORMATION_MESSAGE);
        result = result + "Game "+gameRound+": Won on Roll #1 with Die #1=1 and Die #2=1 \n";
        
      } else if (value1 == 3 && value2 == 3) { //check both dices getting 3
        JOptionPane.showMessageDialog(null, "Game "+gameRound+": Won on Roll #1 with Die #1=3 and Die #2=3", "Result",
            JOptionPane.INFORMATION_MESSAGE);
        result = result + "Game "+gameRound+": Won on Roll #1 with Die #1=3 and Die #2=3 \n";
        
      } else if (i == 2 && WINTOTAL >= 30) { //check last round and total value is equal or greater than 30
        JOptionPane.showMessageDialog(null, "Game "+gameRound+": Won with a score of "+WINTOTAL, "Result",
            JOptionPane.INFORMATION_MESSAGE);
        result = result + "Game "+gameRound+": Won with a score of "+WINTOTAL +"\n";
        
      }else {
        JOptionPane.showMessageDialog(null,  "Game "+gameRound+": Lost", "Result",
            JOptionPane.INFORMATION_MESSAGE);
        result = result + "Game "+gameRound+": Lost \n";
      }

    }
    return result;
  }
  
  public void printResult(String result) throws FileNotFoundException {  //write results to a file
    PrintWriter writer =null;      
    writer = new PrintWriter(new File("Results.txt"));   //creates Results.txt file
    writer.write(result);           //write data to file                                        
    writer.flush();  
    writer.close();  
  }
  
  public void runGame() throws FileNotFoundException {  //game run method
    String result = getResult();
    printResult(result);
    int userData = JOptionPane.showConfirmDialog(null, "Game is over !!! Do you want to play again? ", "Confirmation", JOptionPane.YES_NO_OPTION);
    while(userData != 1) {
      result = getResult();
      printResult(result);
      userData = JOptionPane.showConfirmDialog(null, "Game is over !!! Do you want to play again? ", "Confirmation", JOptionPane.YES_NO_OPTION);
    }
  
  }
  
  public static void main(String[] args) throws FileNotFoundException {
    Dice dice = new Dice();
    dice.runGame();
    
  }

}
