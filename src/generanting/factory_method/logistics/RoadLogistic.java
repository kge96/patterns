package generanting.factory_method.logistics;

import generanting.factory_method.transport.Transport;
import generanting.factory_method.transport.Truck;

/**
 * Конкретная реализация логистики, доставка по суше.
 * Создаёт и возвращает объект класса Truck.
 *
 * */

public class RoadLogistic extends Logistic {
    @Override
    Transport createTransport() {
        return new Truck();
    }
}
