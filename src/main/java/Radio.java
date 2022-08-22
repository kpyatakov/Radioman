public class Radio {

    public int minStation = 0;
    public int maxStation = 9;
    public int currentStation;
    public int currentVolume;
    public int maxVolume = 100;
    public int minVolume = 0;

    public Radio() {
    }

    public Radio(int maxStation) {
        this.maxStation = maxStation;
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