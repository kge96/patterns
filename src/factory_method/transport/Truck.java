package factory_method.transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("delivery cargo by land");
    }
}
