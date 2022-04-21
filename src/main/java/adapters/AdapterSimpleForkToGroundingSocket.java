package adapters;

import fork.SimpleFork;
import socket.GroundingSocket;

public class AdapterSimpleForkToGroundingSocket extends SimpleFork {
    private boolean ground;

    public AdapterSimpleForkToGroundingSocket(){
        ground = false;
    }

    public void PlugIntoGroundingSocket(GroundingSocket socket){
        this.ground = socket.getGround();
        PlugIntoSocket(socket.getPhase(), socket.getZero());
    }

    @Override
    public void PlugOutSocket(){
        super.phase = false;
        super.zero = false;
        this.ground = false;
    }


}
