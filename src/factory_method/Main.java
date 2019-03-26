package factory_method;

import factory_method.logistics.Logistic;
import factory_method.logistics.RoadLogistic;
import factory_method.logistics.SeaLogistic;

public class Main {
    public static void main(String[] args) {
        Logistic roadLogistic = new RoadLogistic();
        Logistic seaLogistic = new SeaLogistic();

        roadLogistic.start();
        seaLogistic.start();
    }
}
