package com.myprograms.designpatterns.gangoffour.structural.bridge;

public class BridgeApp {

    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.joinWorkshop(new ProduceWorkshop());
        bike.joinWorkshop(new AssembleWorkshop());
        bike.joinWorkshop(new TestWorkshop());
        bike.manufacture();

        Vehicle car = new Car();
        car.joinWorkshop(new ProduceWorkshop());
        car.joinWorkshop(new AssembleWorkshop());
        car.joinWorkshop(new PaintWorkshop());
        car.joinWorkshop(new TestWorkshop());
        car.manufacture();

        Vehicle bus = new Bus();
        bus.joinWorkshop(new RepairWorkshop());
        bus.joinWorkshop(new AssembleWorkshop());
        bus.joinWorkshop(new TestWorkshop());
        bus.manufacture();
    }
}
