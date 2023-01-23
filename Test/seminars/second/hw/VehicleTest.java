package seminars.second.hw;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VehicleTest {
    //проверка того, что экземпляр объекта Car также является экземпляром транспортного средства; (instanceof)
    @Test
    public void testCarIsInstanceOfVehicle() {
        Car car = new Car("Dodge", "Ram", 2010);
        assertTrue(car instanceof Vehicle);
    }

    //проверка того, объект Car создается с 4-мя колесами
    @Test
    public void CarWithFourWheels(){
        Car car = new Car("Dodge", "Ram", 2010);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    //проверка того, объект Motorcycle создается с 2-мя колесами
    @Test
    public void MotorcycleWith2Wheels(){
        Motorcycle motorcycle=new Motorcycle("BMW", "R-1200", 2016);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    //проверка того, объект Car развивает скорость 60 в режиме тестового вождения (testDrive())
    @Test
    public void CarSpeedTestDriveMode(){
        Car car = new Car("Dodge", "Ram", 2010);
        assertThat(car.testDrive()).isEqualTo(60);
    }

    //проверка того, объект Motorcycle развивает скорость 75 в режиме тестового вождения (testDrive())
    @Test
    public void MotorcycleSpeedTestDriveMode(){
        Motorcycle motorcycle1=new Motorcycle("BMW", "R-1200", 2016);
        assertThat(motorcycle1.testDrive()).isEqualTo(75);
    }

    //проверить, что в режиме парковки(сначала testDrive, потом park, т.е эмуляция движения транспорта)
    // машина останавливается (speed = 0)
    @Test
    public void CarParkingEmulation(){
        Car car = new Car("Dodge", "Ram", 2010);
        assertThat(car.testDrive()).isEqualTo(60);
        assertThat(car.park()).isEqualTo(0);
    }

    //- проверить, что в режиме парковки (сначала testDrive, потом park
    // т.е эмуляция движения транспорта) мотоцикл останавливается (speed = 0)
    @Test
    public  void MotorcycleParkingEmulation(){
        Motorcycle motorcycle=new Motorcycle("BMW", "R-1200", 2016);
        assertThat(motorcycle.testDrive()).isEqualTo(75);
        assertThat(motorcycle.park()).isEqualTo(0);
    }
}