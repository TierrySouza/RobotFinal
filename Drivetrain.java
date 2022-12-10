package Robot;

public class Drivetrain extends Subsystem {
    MotorController motorOneLeft;
    MotorController motorTwoLeft;
    MotorController motorOneRight;
    MotorController motorTwoRight;
    Double wheelDiameterInches;
    
    public Drivetrain(MotorController motorOneLeft, MotorController motorTwoLeft, MotorController motorOneRight,
            MotorController motorTwoRight, Double wheelDiameterInches, String name) {
        this.motorOneLeft = motorOneLeft;
        this.motorTwoLeft = motorTwoLeft;
        this.motorOneRight = motorOneRight;
        this.motorTwoRight = motorTwoRight;
        this.wheelDiameterInches = wheelDiameterInches;
        super.name = name;
    }

    public MotorController getMotorOneLeft() {
        return motorOneLeft;
    }

    public void setMotorOneLeft(MotorController motorOneLeft) {
        this.motorOneLeft = motorOneLeft;
    }

    public MotorController getMotorTwoLeft() {
        return motorTwoLeft;
    }

    public void setMotorTwoLeft(MotorController motorTwoLeft) {
        this.motorTwoLeft = motorTwoLeft;
    }

    public MotorController getMotorOneRight() {
        return motorOneRight;
    }

    public void setMotorOneRight(MotorController motorOneRight) {
        this.motorOneRight = motorOneRight;
    }

    public MotorController getMotorTwoRight() {
        return motorTwoRight;
    }

    public void setMotorTwoRight(MotorController motorTwoRight) {
        this.motorTwoRight = motorTwoRight;
    }

    public Double getWheelDiameterInches() {
        return wheelDiameterInches;
    }

    public void setWheelDiameterInches(Double wheelDiameterInches) {
        this.wheelDiameterInches = wheelDiameterInches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}
