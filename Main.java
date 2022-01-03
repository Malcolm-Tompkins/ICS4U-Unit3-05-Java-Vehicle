// Main program for vehicle class
// Made by: Malcolm Tompkins
// Created on: 2021/12/29

/**
* Main Class.
*/
final class Main {
    /**
    * Constant for first license number.
    */
    public static int licenseOne = 23456754;
    
    /**
    * Constant for second license number.
    */
    public static int licenseTwo = 45678906;
    
    /**
    * Constant for max speed of 20.
    */
    public static int magicTwenty = 20;
    
    /**
    * Constant for max speed 30.
    */
    public static int magicThirty = 30;

    /**
    * MagicNumber Constructor.
    *
    * @throws IllegalStateException throws Exception
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }
    /**
    * Main() Function.
    *
    * @param args Unused parameter
    */
    public static void main(String[] args) {
        final int newLicenseNum1 = LICENSE_ONE;
        final String newColor1 = "blue";
        final int newMaxSpeed1 = MAGIC_TWENTY;
        final int newLicenseNum2 = LICENSE_TWO;
        final String newColor2 = "Orange";
        final int newMaxSpeed2 = MAGIC_THIRTY;

        final Vehicle vehicle1 = new Vehicle(
            newLicenseNum1, newColor1, newMaxSpeed1);

        final Vehicle vehicle2 = new Vehicle(
            newLicenseNum2, newColor2, newMaxSpeed2);

        System.out.println("\nVehicle 1 changes: ");
        vehicle1.accelerate();
        vehicle1.brake();
        vehicle1.printFields();

        System.out.println("\nVehicle 2 changes: ");
        vehicle2.accelerate();
        vehicle2.brake();
        vehicle2.printFields();

        System.out.println("Done.");
    }
}

