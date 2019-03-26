package factory_method.logistics;

import factory_method.transport.Ship;
import factory_method.transport.Transport;

public class SeaLogistic extends Logistic {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
