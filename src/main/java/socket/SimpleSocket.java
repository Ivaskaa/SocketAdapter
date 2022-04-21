package socket;

public class SimpleSocket {
    private boolean phase;
    private boolean zero;

    public SimpleSocket(boolean phase, boolean zero){
        this.phase = phase;
        this.zero = zero;
    }

    public boolean getZero(){
        return zero;
    }

    public boolean getPhase(){
        return phase;
    }


}
