package solidLiskovSubstitutionPrinciple;

public class OperateVehicle {

    public void driveVehicle(Vehicle vehicle){
        vehicle.start();
        vehicle.stop();
    }
}
