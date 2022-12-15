package appello2.ex;

public class PowerCountdownImpl extends StandardCountdown implements PowerCountdown{

    private final int stopValue;
    private int decrementDelta;

    public PowerCountdownImpl(final int initialValue, final int stopValue){
        super(initialValue);
        if(stopValue < initialValue && stopValue >= 0){
            this.stopValue = stopValue;
            this.decrementDelta = 1;
        }else{
            throw new IllegalStateException();
        }

    }

    @Override
    public void decrease(){
        if(!isOver()){
            super.setCounterValue(super.getCounterValue() - decrementDelta);
        }else{
            throw new IllegalStateException();
        }

    }

    @Override
    public void reset() {
        this.decrementDelta = 1;
        super.setCounterValue(super.getInitialValue());
    }

    @Override
    public void speedup() {
        this.decrementDelta++;
    }

    @Override
    public boolean isOver() {
        return super.getCounterValue() <= this.stopValue;
    }

    
}
