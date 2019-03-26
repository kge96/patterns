package generanting.factory_method.transport;

public class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("delivery cargo by sea");
    }
}
