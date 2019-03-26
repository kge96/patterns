package generanting.factory_method.logistics;
import generanting.factory_method.transport.Transport;

/**
 * Абстрактный метод для создания логистики.
 * Ничего не знает и не должен знать о реализациях.
 * start() - создаёт транспорт и запускает доставку.
 *
 * */

public abstract class Logistic {

    public void start() {
        Transport transport = createTransport();
        transport.deliver();
    }

    abstract Transport createTransport();
}
