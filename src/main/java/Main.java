import adapters.AdapterSimpleForkToGroundingSocket;
import fork.SimpleFork;
import socket.GroundingSocket;
import socket.SimpleSocket;

public class Main {
    public static void main(String[] args) {
        SimpleFork simpleFork = new SimpleFork(); // створив виделку
        SimpleSocket simpleSocket = new SimpleSocket(true, true); // створив справну просту розетку


        simpleFork.OnInstrument(); // ввімкнув прилад до того як запихнув виделку в розетку
        simpleFork.PlugIntoSocket(simpleSocket); // запихнув виделку в розетку
        simpleFork.OnInstrument(); // ввімкнув прилад після того як запихнув виделку в розетку
        simpleFork.PlugOutSocket(); // витягнув виделку з розетки

        AdapterSimpleForkToGroundingSocket adapter = new AdapterSimpleForkToGroundingSocket(); // створив адаптер
        GroundingSocket groundingSocket = new GroundingSocket(true, true, true ); // створив справну розетку з заземленням

        adapter.PlugIntoGroundingSocket(groundingSocket); // запихнув адаптер у розетку з заземленням
        adapter.OnInstrument(); // попробував увімкнути прилад
        adapter.PlugOutSocket(); // витягнув адаптер з розетку з заземленням
        adapter.OnInstrument(); // попробував увімкнути прилад




    }
}
