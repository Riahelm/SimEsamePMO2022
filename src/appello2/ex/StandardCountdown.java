package appello2.ex;

public class StandardCountdown implements Countdown{

    int counterValue;

    public StandardCountdown(int initialValue){
        this.counterValue = initialValue;
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
        return counterValue <= 0;
    }
    
}
