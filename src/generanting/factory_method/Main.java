package generanting.factory_method;

import generanting.factory_method.logistics.Logistic;
import generanting.factory_method.logistics.RoadLogistic;
import generanting.factory_method.logistics.SeaLogistic;

public class Main {
    public static void main(String[] args) {
        Logistic roadLogistic = new RoadLogistic();
        Logistic seaLogistic = new SeaLogistic();

        roadLogistic.start();
        seaLogistic.start();
    }
}
