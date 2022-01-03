// Program for vehicle class.
// Made by: Malcolm Tompkins
// Created on: 2021/12/29

/**
* Vehicle Class.
*/
public class Vehicle {
    /** License number field */
    private int licenseNum;
    /** Color field. */
    private String color = "red";
    /** Speed field. */
    private int speed;
    /** Max speed field. */
    private int maxSpeed;

    /**
    * Vehicle constructor.
    *
    * @param startLicenseNum starting license number
    *
    * @param startColor starting color
    *
    * @param newMaxSpeed starting max speed
    */

    Vehicle(int startLicenseNum, String startColor, int newMaxSpeed) {
        licenseNum = startLicenseNum;
        color = startColor;
        maxSpeed = newMaxSpeed;
    }

    /**
    * Getter for license number.
    *
    * @return return the license number of vehicle
    */

    public int getLicenseNum() {
        return this.licenseNum;
    }

    /**
    * Setter for license number.
    *
    * @param newLicense license to change to
    */

    public void setLicenseNum(int newLicense) {
        licenseNum = newLicense;
    }
    /**
    * Getter for color.
    *
    * @return return color of vehicle
    */

    public String getColor() {
        return this.color;
    }
    /**
    * Setter for color.
    *
    * @param newColor color to change to
    */

    public void setColor(String newColor) {
        color = newColor;
    }
    /**
    * Function for acceleration.
    */

    public void accelerate() {
        speed += 1;
        System.out.println(
                "Your vehicle has accelerated by 1 unit of speed");
    }
    /**
    * Function for braking.
    */

    public void brake() {
        speed -= 1;
        System.out.println(
                "Your vehicle has slowed down by 1 unit of speed");
    }

    /**
    * Function for printing fields.
    */
    public void printFields() {
        System.out.println("The license number is: " + licenseNum
                + "\nThe color is: " + color + "\nThe maximum speed is: "
                + maxSpeed + "\nYour current speed is: " + speed);
    }
}

