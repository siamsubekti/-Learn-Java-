import com.enigma.bootcamp.service.CarParkingService;
import org.junit.Assert;
import org.junit.Test;

public class CarParkingTest {

    @Test
    public void calculatedPrice_whenTheCarhasBeenParkedForOneHour(){
        CarParkingService carParkingService = new CarParkingService(5);
        Double expected = 10d;
        Double actual = carParkingService.calculatedPrice(1);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void calculatedPrice_whenCarHasBeenParkedForThreeHour() {
        CarParkingService carParkingService = new CarParkingService(5);
        Double expected = 20d;
        Double actual =carParkingService.calculatedPrice(3);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void calculatedPrice_whenCarHasBeenParkedForFiveHour() {
        CarParkingService carParkingService = new CarParkingService(5);
        Double expected = 40d;
        Double actual = carParkingService.calculatedPrice(5);
        Assert.assertEquals(expected,actual);
    }
}
