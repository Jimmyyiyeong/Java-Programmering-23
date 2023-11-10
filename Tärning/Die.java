import java.util.Random;

public class Die {

    private int currentValue;
    private int sides;

    Random random = new Random();

    Die(int sides)  {

        this.currentValue = 0;
        this.sides = sides;
    }
        public int getCurrentValue()    {
            return currentValue;
        }
        public int getSides()   {
            return sides;
        }

    public void roll()  {
        currentValue = random.nextInt(sides) + 1;
    }

}   