package ru.netology.javaqa;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;

//    public Radio() {
//        maxStation = 9;
//    }
//
//    public Radio(int countStations) {
//        maxStation = countStations - 1;
//    }
//
//    public int getCurrentStation() {
//        return currentStation;
//    }
//
//    public void setCurrentStation(int currentStation) {
//        if (currentStation < 0) {
//            return;
//        }
//        if (currentStation > maxStation) {
//            return;
//        }
//        this.currentStation = currentStation;
//    }
//
//    public int getCurrentVolume() {
//        return currentVolume;
//    }
//
//    public void setCurrentVolume(int currentVolume) {
//        if (currentVolume < 0) {
//            return;
//        }
//        if (currentVolume > 100) {
//            return;
//        }
//        this.currentVolume = currentVolume;
//    }
//
//    public void next() {
//        if (currentStation < maxStation) {
//            currentStation++;
//        } else {
//            currentStation = 0;
//        }
//    }
//
//    public void prev() {
//        if (currentStation > 0) {
//            currentStation = currentStation - 1;
//        } else {
//            currentStation = maxStation;
//        }
//    }
//
//    public void volumeUp() {
//        if (currentVolume < 100) {
//            currentVolume = currentVolume + 1;
//        } else {
//            currentVolume = 100;
//        }
//    }
//
//    public void volumeDown() {
//        if (currentVolume > 0) {
//            currentVolume = currentVolume - 1;
//        } else {
//            currentVolume = 0;
//        }
//    }
}