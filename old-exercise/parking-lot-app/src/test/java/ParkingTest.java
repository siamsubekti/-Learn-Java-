import com.enigma.bootcamp.exception.CarNotFoundException;
import com.enigma.bootcamp.model.Car;
import com.enigma.bootcamp.service.CarParkingService;
import org.junit.Assert;
import org.junit.Test;

public class ParkingTest {
/*
    @Test
    public void*/


//    for test method leave when succes leave and return available slot :
    @Test
    public void leaveTest_shouldReclaimAvailableSlot_whenSuccesFullyLeave() {
        CarParkingService carParkingService = new CarParkingService(6);
        carParkingService.park(new Car("B1793EOG"));
        carParkingService.leave(new Car("B1793EOG"));

        Integer expected = 6;
        Integer actual = carParkingService.getNumOfAvailableSlots();
        Assert.assertEquals(expected, actual);
    }

    //for negative test method leave :
    @Test(expected = CarNotFoundException.class)
    public void leaveTest_shouldThrowException_whenTheRegNumberIsNotFound() {
        CarParkingService carParkingService = new CarParkingService(7);
        carParkingService.leave(new Car("B12343TH"));
    }
}
