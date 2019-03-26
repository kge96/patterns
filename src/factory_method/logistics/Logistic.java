package factory_method.logistics;

import factory_method.transport.Transport;

public abstract class Logistic {

    public void start() {
        Transport transport = createTransport();
        transport.deliver();
    }

    abstract Transport createTransport();
}
