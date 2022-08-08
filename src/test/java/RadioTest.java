import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentVolumeUp() {
        Radio rad = new Radio(1, 0, 9, 7);

        rad.increaseVolume();

        int expected = 8;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeDown() {
        Radio rad = new Radio(1, 0, 9, 7);

        rad.reduceVolume();

        int expected = 6;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextVolume() {
        Radio rad = new Radio(10, 0, 9, 10);

        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevVolume() {
        Radio rad = new Radio(0, 0, 9, 0);

        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStation() {
        Radio rad = new Radio(1, 0, 9, 7);

        rad.next();

        int expected = 2;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStation() {
        Radio rad = new Radio(5, 0, 9, 7);

        rad.prev();

        int expected = 4;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStAfter9() {
        Radio rad = new Radio(9, 0, 9, 7);

        rad.next();

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setStPrev0() {
        Radio rad = new Radio(0, 0, 9, 7);

        rad.prev();

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

}
