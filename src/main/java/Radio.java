public class Radio {

    protected int minStation = 0;
    protected int maxStation = 9;
    protected int currentStation;
    protected int currentVolume;
    protected int maxVolume = 100;
    protected int minVolume = 0;
    protected int stationAmount;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
    }

    public void reduceVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = minVolume;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int prev() {
        currentStation = currentStation <= minStation ? maxStation : --currentStation;
        return currentStation;
    }

    public int next() {
        currentStation = currentStation >= maxStation ? minStation : ++currentStation;
        return currentStation;
    }

}