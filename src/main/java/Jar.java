import java.util.Random;

class Jar{
  private String item;
  private int maxNumber;
  private int someNumber;
  private int tries;
  
  public Jar(String item, int maxNumber){
    this.item = item;
    this.maxNumber = maxNumber;
    someNumber = 0;
    tries = 0;
     
  }
  public int fill(){
    Random random = new Random();
    someNumber = random.nextInt(maxNumber)+1;
    return someNumber;
  }
  public String getItem(){
    return item;
  }
  
  public int getMaxNumber(){
    return maxNumber;
  }

  public int checkGuess(int guessInput){
    if(guessInput > maxNumber){
      throw new IllegalArgumentException("Your guess must be less than " + maxNumber);
    }
    return guessInput;
  }
  
  public boolean applyGuess(int guessInput){
    int guess = checkGuess(guessInput);
    boolean isCorrect = someNumber == guessInput;
    if (isCorrect == false){
      if(guessInput < someNumber){
        System.out.println("Your guess is too low");
       }else{
        System.out.println("Your guess is too high");
      }
      tries ++;   
    }
    return isCorrect;
  }
public int getTries(){
  return tries + 1;
}
  
}