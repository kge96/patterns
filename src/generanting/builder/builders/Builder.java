package generanting.builder.builders;

import generanting.builder.components.Engine;
import generanting.builder.components.GPSNavigator;
import generanting.builder.components.Transmission;
import generanting.builder.components.TripComputer;
import generanting.builder.cars.Type;

/**
 * Интерфейс Строителя объявляет все возможные этапы и шаги конфигурации
 * продукта.
 */

public interface Builder {
    void setType(Type type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
