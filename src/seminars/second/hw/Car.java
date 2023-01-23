package seminars.second.hw;

public class Car extends Vehicle {
    private static String company;
    private static String model;
    private static int yearRelease;
    private int numWheels;
    private int speed;
    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = 4;
        this.speed = 0;
    }
    public int testDrive() {
        this.speed = 60;
        return this.speed;
    }
    public int park() {
        this.speed = 0;
        return 0;
    }
    public static String getCompany() {
        return company; }
    public static String getModel() {
        return model; }
    public static int getYearRelease() {
        return yearRelease; }
    public int getNumWheels() {
        return numWheels; }
    public int getSpeed() {
        return speed; }
    public String toString() {
        return "This car is a "+company+", "+" year " +yearRelease+ " make, "+ model + " model,";}
}