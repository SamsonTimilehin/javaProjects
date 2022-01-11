package solidLiskovSubstitutionPrinciple;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Truck truck = new Truck();

        OperateVehicle operateVehicle = new OperateVehicle();
        operateVehicle.driveVehicle(car);

        operateVehicle.driveVehicle(truck);
    }
}
