package generanting.factory_method.logistics;

import generanting.factory_method.transport.Ship;
import generanting.factory_method.transport.Transport;

public class SeaLogistic extends Logistic {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
