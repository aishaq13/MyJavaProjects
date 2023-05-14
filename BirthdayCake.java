package FinalProject;

public class BirthdayCake extends Cake{
    private int numCandles;

    public BirthdayCake(String flavor, int numCandles) throws IllegalArgumentException {
        super (flavor);
        setNumCandles(numCandles);

    }

    public int getNumCandles (){
        return numCandles;
    }

    public void setNumCandles (int numCandles) throws IllegalArgumentException {
        if (numCandles <0) {
            throw new IllegalArgumentException("Error: Number of candles cannot be negative. ");
        }

        this.numCandles = numCandles;

    }

    public String toString () {
        return super.toString () + "It has " + numCandles + "candles. ";
    }
}
