package socket;

public class GroundingSocket extends SimpleSocket{
    private boolean ground;

    public GroundingSocket(boolean ground, boolean phase, boolean zero) {
        super(phase, zero);
        this.ground = ground;
    }

    public boolean getGround(){
        return ground;
    }

}
