package generanting.factory_method.logistics;

import generanting.factory_method.transport.Transport;

public abstract class Logistic {

    public void start() {
        Transport transport = createTransport();
        transport.deliver();
    }

    abstract Transport createTransport();
}
