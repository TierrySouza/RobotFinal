package Robot;

public class Intake extends Subsystem{
    MotorController motorOne;
    
    public Intake(MotorController motorOne, String name) {
        this.motorOne = motorOne;
        super.name = name;
    }
    
}
