import java.util.Scanner;
public class HangManTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Hangman! Choose whether you want to play solo or duo (let partner choose word):");
        String choice = input.nextLine();
        
        /**
        for solo game of hangman
        runs loop, if get it correct within 6 tries prints congradulations otherwhys loss
        */
        if(choice.equals("solo"))
        {   
            HangMan creation = new HangMan();
            
            while(true)
            {
                System.out.print("Guess:");
                String letter1 = input.nextLine();
                creation.underlineCorrect(letter1);
                creation.guessCorrect();
                creation.Drawing();
                System.out.println(creation.getUnderLine());

                if(creation.correctGuess())
                {
                    System.out.println("Congrats!! You got the word!");
                    
                    break;
                }
               
                
                if(creation.getWrongGuess() == 6)
                {
                    System.out.println("Sorry...you didn't get it. The word was " + creation.getWord());
                    break;
                }
              
                
            }
        }
        /**
        for duo game of hangman
        runs hangMan game using methods 
        */
        else if(choice.equals("duo"))
        {
            System.out.print("Person 1 enter the word to guess:");
            String word = input.nextLine();
            HangMan duo = new HangMan(word);
             for(int a = 0; a < 100; a++){
                System.out.println();
            }
            System.out.println("Switch to person 2:");
            
             while(true)
            {
                System.out.print("Guess: ");
                String letter2 = input.nextLine();
                duo.underlineCorrect(letter2);
                duo.guessCorrect();
                duo.Drawing();
                System.out.println(duo.getUnderLine());

                if(duo.correctGuess())
                {
                    System.out.println("Congrats!! You got the word!");
                    break;
                }
                
                if(duo.getWrongGuess() == 6)
                {
                    System.out.println("Sorry...you didn't get it. The word was " + duo.getWord());
                    break;
                }
            }    
        }
        else
        {
            System.out.println("Please select solo or duo...");
        
        }
    }
}
  
