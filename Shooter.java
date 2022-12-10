package Robot;

public class Shooter extends Subsystem{
    MotorController motorOne;
    Double wheelDiameterInches;
    
    public Shooter(MotorController motorOne, String name, Double wheelDiameterInches) {
        this.motorOne = motorOne;
        super.name = name;
        this.wheelDiameterInches = wheelDiameterInches;
    }
}
