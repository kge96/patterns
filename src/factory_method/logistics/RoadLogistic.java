package factory_method.logistics;

import factory_method.transport.Transport;
import factory_method.transport.Truck;

public class RoadLogistic extends Logistic {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
