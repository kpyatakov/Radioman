import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void setCurrentVolumeUp() {
        Radio rad = new Radio(9);

        rad.currentVolume = 7;
        rad.increaseVolume();

        Assertions.assertEquals(8, rad.getCurrentVolume());
    }

    @Test
    public void setCurrentVolumeDown() {
        Radio rad = new Radio(9);

        rad.currentVolume = 7;
        rad.reduceVolume();

        Assertions.assertEquals(6, rad.getCurrentVolume());
    }

    @Test
    public void setNextVolume() {
        Radio rad = new Radio(9);

        rad.currentVolume = 100;
        rad.increaseVolume();

        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void setPrevVolume() {
        Radio rad = new Radio(9);

        rad.currentVolume = 0;
        rad.reduceVolume();

        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void setNextStation() {
        Radio rad = new Radio(9);

        rad.currentStation = 1;
        rad.next();

        Assertions.assertEquals(2, rad.getCurrentStation());
    }

    @Test
    public void setPrevStation() {
        Radio rad = new Radio(9);

        rad.currentStation = 5;
        rad.prev();

        Assertions.assertEquals(4, rad.getCurrentStation());
    }

    @Test
    public void setStAfter9() {
        Radio rad = new Radio(9);

        rad.currentStation = 9;
        rad.next();

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void setStPrev0() {
        Radio rad = new Radio(9);

        rad.currentStation = 0;
        rad.prev();

        Assertions.assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void playPrevStation() {
        Radio rad = new Radio();

        rad.currentStation = 2;
        rad.prev();

        Assertions.assertEquals(1, rad.getCurrentStation());
    }

    @Test
    public void playNextStation() {
        Radio rad = new Radio();

        rad.currentStation = 2;
        rad.next();

        Assertions.assertEquals(3, rad.getCurrentStation());
    }

    @Test
    public void playAfterMax() {
        Radio rad = new Radio();

        rad.currentStation = 9;
        rad.next();

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void playPrevMin() {
        Radio rad = new Radio();

        rad.currentStation = 0;
        rad.prev();

        Assertions.assertEquals(9, rad.getCurrentStation());
    }
}
