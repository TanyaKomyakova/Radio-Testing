package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio("LG",9,10,0,15,100,0);

    @Test
    public void testSwitchingTheRadioStationToTheNext(){ //Переключение радиостанции на следующую и проверка границы
        radio.setCurrentRadioStation(9);
        radio.switchingTheRadioStationToTheNext();
        radio.switchingTheRadioStationToTheNext();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void testSwitchingTheRadioStationToThePreviousOne(){ //Переключение радиостанции на предыдущую и проверка границы
        radio.setCurrentRadioStation(1);
        radio.switchingTheRadioStationToThePreviousOne();
        radio.switchingTheRadioStationToThePreviousOne();
        int expected = 10;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void radioStationSelection(){ // Выбор радиостанции
        radio.setCurrentRadioStation(7);
        radio.setCurrentRadioStation(11);
        int expected = 7;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected,actual);
    }

    @Test
    public void radioStationSelection2() {// Выбор радиостанции
        radio.setCurrentRadioStation(0);
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void increaseSoundVolume() { // Увеличение громкости
        radio.setCurrentSoundVolume(99);
        radio.increaseSoundVolume();
        radio.increaseSoundVolume();
        int expected = 100;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void decreaseSoundVolume(){ // Уменьшение громкости
        radio.setCurrentSoundVolume(1);
        radio.decreaseSoundVolume();
        radio.decreaseSoundVolume();
        int expected = 0;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void soundVolumeSelection() { // Выбор громкости звука
        radio.setCurrentSoundVolume(87);
        radio.setCurrentSoundVolume(113);
        int expected = 87;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

    @Test
    public void soundVolumeSelection2() { // Выбор громкости звука
        radio.setCurrentSoundVolume(4);
        radio.setCurrentSoundVolume(-12);
        int expected = 4;
        int actual = radio.getCurrentSoundVolume();
        assertEquals(expected,actual);
    }

}