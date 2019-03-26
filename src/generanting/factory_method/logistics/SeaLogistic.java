package generanting.factory_method.logistics;

import generanting.factory_method.transport.Ship;
import generanting.factory_method.transport.Transport;

/**
 * Конкретная реализация логистики, доставка морем.
 * Создаёт и возвращает объект класса Ship.
 *
 * */

public class SeaLogistic extends Logistic {
    @Override
    Transport createTransport() {
        return new Ship();
    }
}
