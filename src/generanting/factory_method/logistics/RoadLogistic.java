package generanting.factory_method.logistics;

import generanting.factory_method.transport.Transport;
import generanting.factory_method.transport.Truck;

public class RoadLogistic extends Logistic {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
