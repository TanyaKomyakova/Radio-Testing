package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void testSwitchingTheRadioStationToTheNext(){ //Переключение радиостанции на следующую и проверка границы
        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        radio.switchingTheRadioStationToTheNext();
        radio.switchingTheRadioStationToTheNext();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void testSwitchingTheRadioStationToThePreviousOne(){ //Переключение радиостанции на предыдущую и проверка границы
        Radio radio = new Radio();
        radio.setCurrentRadioStation(1);
        radio.switchingTheRadioStationToThePreviousOne();
        radio.switchingTheRadioStationToThePreviousOne();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void radioStationSelection(){ // Выбор радиостанции
        Radio radio = new Radio();
        radio.setCurrentRadioStation(7);
        radio.setCurrentRadioStation(11);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void radioStationSelection2() {// Выбор радиостанции
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume() { // Увеличение громкости
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(9);
        radio.increaseSoundVolume();
        radio.increaseSoundVolume();
        int expected = 10;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void decreaseSoundVolume(){ // Уменьшение громкости
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(1);
        radio.decreaseSoundVolume();
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void soundVolumeSelection() { // Выбор громкости звука
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(7);
        radio.setCurrentSoundVolume(13);
        int expected = 7;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void soundVolumeSelection2() { // Выбор громкости звука
        Radio radio = new Radio();
        radio.setCurrentSoundVolume(4);
        radio.setCurrentSoundVolume(-12);
        int expected = 4;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

}