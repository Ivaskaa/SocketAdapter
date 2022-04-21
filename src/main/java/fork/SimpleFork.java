package fork;

import socket.SimpleSocket;

public class SimpleFork {
    protected boolean phase;
    protected boolean zero;

    public SimpleFork(){
        this.phase = false;
        this.zero = false;
    }

    public void PlugIntoSocket(SimpleSocket socket){
        this.phase = socket.getPhase();
        this.zero = socket.getZero();
    }

    public void PlugIntoSocket(boolean phase, boolean zero){
        this.phase = phase;
        this.zero = zero;
    }

    public void PlugOutSocket(){
        this.phase = false;
        this.zero = false;
    }

    public void OnInstrument(){
        if(phase && zero){
            System.out.println("Instrument is working");
        } else {
            System.out.println("Something happened, Instrument isn`t working");
        }
    }
}
