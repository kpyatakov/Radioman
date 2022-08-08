public class Radio {
    public int currentStation;
    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    private final int minStation, maxStation;

    public Radio(int currentStation, int minStation, int maxStation, int currentVolume) {
        this.currentStation = currentStation;
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

}