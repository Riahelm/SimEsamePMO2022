package appello2.ex;

public class StandardCountdown implements Countdown{

    private final int initialValue;


    private int counterValue;

    public StandardCountdown(final int initialValue){
        if(initialValue >= 0){
            this.initialValue = initialValue;
            this.counterValue = initialValue;
        }else{
            throw new IllegalStateException();
        }
    }

    @Override
    public void decrease() throws IllegalStateException{
        if(this.counterValue > 0){
            this.counterValue--;
        }else{
            throw new IllegalStateException();
        }
    }

    @Override
    public int getValue() {
        return this.counterValue;
    }

    @Override
    public boolean isOver() {
        return this.counterValue <= 0;
    }

    public int getCounterValue() {
        return this.counterValue;
    }
    
    public int getInitialValue() {
        return initialValue;
    }

    public void setCounterValue(int counterValue) {
        this.counterValue = counterValue;
    }
    
}
