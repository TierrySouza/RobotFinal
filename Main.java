package Robot;

public class Main {
    public static void main(String[] args) {
        MotorController motorOneLeft = new MotorController(0);
        MotorController motorTwoLeft = new MotorController(1);
        MotorController motorOneRight = new MotorController(2);
        MotorController motorTwoRight = new MotorController(3);
        Double wheelDiameterInchesDrivetrain = 4.0;
        String nameDrivetrain = "Wally";
        Drivetrain drivetrain = new Drivetrain(motorOneLeft, motorTwoLeft, motorOneRight, motorTwoRight, wheelDiameterInchesDrivetrain, nameDrivetrain);
        
        MotorController motorOneIntake = new MotorController(4);
        String nameIntake = "Eva";
        Intake intake = new Intake(motorOneIntake, nameIntake);

        MotorController motorOneShooter = new MotorController(5);
        String nameShooter = "Curry";
        Double wheelDiameterInchesShooter = 6.0;
        Shooter shooter = new Shooter(motorOneShooter, nameShooter, wheelDiameterInchesShooter);

        Robot robot = new Robot(drivetrain, intake, shooter);
    }
}
