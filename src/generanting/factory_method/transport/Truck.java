package generanting.factory_method.transport;

/**
 * Реализация транспортного средства - грузовик.
 *
 * */

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("delivery cargo by land");
    }
}
