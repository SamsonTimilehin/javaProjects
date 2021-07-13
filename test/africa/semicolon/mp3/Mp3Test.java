package africa.semicolon.mp3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class Mp3Test {

    @Test
    void  Mp3Created(){
        Mp3Player mp3Player = new Mp3Player();
       assertNotNull(mp3Player);
    }
    @Test
  public void Mp3CanBeTurnedOn(){
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.turnOn();
        assertTrue(mp3Player.isOn());
    }
    @Test
    void Mp3CanBeTurnedOff(){
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.turnOff();
        assertFalse(mp3Player.isOn());
    }
    @Test
    void CreateFlipPowerButtonToTurnOnMp3Player(){
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.flipButton();
        assertTrue(mp3Player.isOn());

    }
    @Test
    void IncreaseMp3PlayerVolume(){
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.flipButton();
        assertEquals(0, mp3Player.getVolume());
        mp3Player.increaseVolume();
        assertEquals(1, mp3Player.getVolume());

    }
    @Test
    void  DecreaseMp3PlayerVolume(){
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.flipButton();
        assertEquals(0, mp3Player.getVolume());
        mp3Player.increaseVolume();
        assertEquals(1, mp3Player.getVolume());
        mp3Player.decreaseVolume();
        assertEquals(0, mp3Player.getVolume());
    }
    @Test
    void Mp3PlayerCanDownloadMusic(){
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.flipButton();
        Music music = new Music();
        Music music2 = new Music();

        mp3Player.download(music);
        mp3Player.download(music2);
        assertEquals(2, mp3Player.getTotalNumberOfMusic());

    }
    @Test
    void Mp3PlayerCanDeleteSongs(){
        Mp3Player mp3Player = new Mp3Player();
        mp3Player.flipButton();
        Music music = new Music();
        mp3Player.download(music);
        mp3Player.download(music);
        mp3Player.download(music);
        mp3Player.download(music);
        assertEquals(4, mp3Player.getTotalNumberOfMusic());
        mp3Player.deleteSongs(music);
        assertEquals(3, mp3Player.getTotalNumberOfMusic());
    }

//    @Test
//    void Mp3PlayerCanPlaySongs(){
//        Mp3Player mp3Player = new Mp3Player();
//        mp3Player.flipButton();
//        Music music = new Music();
//        mp3Player.download(music);
//        mp3Player.playMusic(music);
//        assertTrue( mp3Player.musicIsOn);
//    }
//    @Test
//    void Mp3PlayerCanPauseSong(){
//        Mp3Player mp3Player = new Mp3Player();
//        mp3Player.flipButton();
//        Music music = new Music();
//        mp3Player.download(music);
//        mp3Player.pauseMusic();
//        assertFalse(mp3Player.musicIsOn);
//
//    }
    @Test
    void Mp3PlayerCanNextMusic(){
        Mp3Player mp3Player = new Mp3Player();
        Music music = new Music();
        Music music2 = new Music();
        mp3Player.download(music);
        mp3Player.download(music2);
        mp3Player.playMusic(music);
        assertEquals(music, mp3Player.getCurrentPlayingMusic());
        mp3Player.playNextMusic();
       assertEquals(music2, mp3Player.getCurrentPlayingMusic());

    }



}
