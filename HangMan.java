import java.util.Random;
public class HangMan {
    
    //instance variables for hangman object
    private String word;
    private String letter;
    private int wrongGuess;
    private String underLine;
    
    
    /**
    Initializes a hangMan object
    Postcondition: Instance variables String name and int strength are initialized with 
    String theName, and int theStrength.
    
    @param theName -String to initialize instance variable name for Power object
    */
    public HangMan()
    {
        wrongGuess = 0;
        String[] cWord = {"enormity","jazz", "quizzed", "programming", "sphinx", "word", "story", "dynamite", "character", "string", "innovative", "basketball", "score", "Phenomenon", "onomatopoeia", "sabotaged", "quadruple", "dodge", "food", "epoxy", "depot", "aroma", "vivid", "allow", "vague"}; 
        word = cWord[new Random().nextInt(cWord.length)];
        underLine = "";
        for(int i = 0; i <= word.length(); i++) 
        {
            underLine += "?";
        }
    }
    
    /**
    Initializes a hangManDuo object
    Postcondition: Instance variables String word is initialized with 
    to this.word
    
    @param word -String to initialize instance variable name for HangManDuo object
    
    */
    public HangMan(String word)
    {
        wrongGuess = 0;
        this.word = word;
        underLine = "";
        for(int i = 0; i <= word.length(); i++) 
        {
            underLine += "?";
        }
    }
    /**
    Returns true or false based onw whether letter was guessed correctly.
    Precondition: hangMan object must be initialized.

    @return true/false - if letter was guessed correct/wrong
    */
    public boolean guessCorrect()
    {
       for(int i = 0; i < 8; i++)
        {
            if(word.contains(letter))
            {
                return true;
            }
            else
            {
                addWrongGuess();
                return false;
            }
        }
        return false;
    }
    
    /**
    returns true if word is guessed based on whether there are any question marks left
    Precondition: HangMan object must be initialized
    
    @return true/false - based on if word was guessed completely
    */
    public boolean correctGuess()
    {
        if(!underLine.contains("?"))
        {
            return true;
        }
        return false;
    }
    
    /**
    Prints out image of hangmen step by step with each incorrect answer
    Precondition: hangMan object must be initialized
    */
    public void Drawing()
    {
        if(wrongGuess == 0)
        {
            System.out.println(
              "\n   _______"
            + "\n   |     |"
            + "\n         |"
            + "\n         |"
            + "\n         |");
        }
        else if(wrongGuess == 1)
        {
             System.out.println(
              "\n   _______"
            + "\n   |     |"
            + "\n   o     |"
            + "\n         |"
            + "\n         |");
        }
        else if(wrongGuess == 2)
        {
             System.out.println(
              "\n   _______"
            + "\n   |     |"
            + "\n   o     |"
            + "\n   |     |"
            + "\n         |");
        }
        else if(wrongGuess == 3)
        {
              System.out.println(
              "\n   _______"
            + "\n   |     |"
            + "\n   o     |"
            + "\n   |\\    |"
            + "\n         |");
        }
         else if(wrongGuess == 4)
        {
              System.out.println(
              "\n   _______"
            + "\n   |     |"
            + "\n   o     |"
            + "\n  /|\\    |"
            + "\n         |");
        }
         else if(wrongGuess == 5)
        {
              System.out.println(
              "\n   _______"
            + "\n   |     |"
            + "\n   o     |"
            + "\n  /|\\    |"
            + "\n    \\    |");
        }
         else if(wrongGuess == 6)
        {
              System.out.println(
              "\n   _______"
            + "\n   |     |"
            + "\n   o     |"
            + "\n  /|\\    |"
            + "\n  / \\    |");
        }
        
    }
    /**
    Adds 1 to variable int wrongGuess
    Precondition: hangMan object must be initialized
    */
    public void addWrongGuess()
    {
        wrongGuess++;
    }
    
    public void underlineCorrect(String letter)
    {
        this.letter = letter;
        String newWord = "";

         for(int i  = 0; i < word.length(); i++)
            {
                if(word.charAt(i) == letter.charAt(0))
                {
                    newWord += letter.charAt(0);
                    
                }
                else
                {
                    newWord += underLine.charAt(i);
                }
            }
        underLine = newWord;
    }
    
    /**
    Returns the int wrongGuess of a given hangMan object.
    @return wrongGuess
    */
    public int getWrongGuess()
    {
        return wrongGuess;
    }
    
    /**
    Returns the String letter of a given hangMan object.
    @return letter 
    */
    public String getLetter()
    {
        return letter;
    }
    
    /**
    Returns the String word of a given hangMan object.
    @return underLine 
    */
    public String getUnderLine()
    {
        return underLine;
    }
    /**
    Returns the String word of a given hangMan object.
    @return word 
    */
    public String getWord()
    {
        return word;
    }   
}
