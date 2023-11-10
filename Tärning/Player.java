public class Player {
    
    private String name;
    private int point = 0;
    private Die playerDie;
    private int guess = 0;
    

    Player(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getPoint()   {
        return point;
    }
    public void setPoint()   {
        point = 0;
    }
    public int getGuess()   {
        return guess;
    }
    public void setGuess(int guess)   {
        this.guess = guess;
    }
    public void addDie(int sides)   {
        playerDie = new Die(sides);
    }
    public void rollDice()  {
        playerDie.roll();
    }
    public int getDieValue()   {
        return playerDie.getCurrentValue();
    }
    public void increaseScore() {
        point++;
    }
}
