public class Radio {

    public int minStation = 0, maxStation = 9, currentStation, currentVolume, maxVolume = 100, minVolume = 0;

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

    public Radio(int minStation, int maxStation, int currentVolume) {
        this.minStation = minStation;
        this.maxStation = maxStation;
        this.currentVolume = currentVolume;
    }

    public int prev() {
        currentStation = currentStation <= minStation ? maxStation : --currentStation;
        return currentStation;
    }

    public int next() {
        currentStation = currentStation >= maxStation ? minStation : ++currentStation;
        return currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public Radio() {
    }

}