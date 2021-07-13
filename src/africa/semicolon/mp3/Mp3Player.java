package africa.semicolon.mp3;

import java.util.ArrayList;

public class Mp3Player{

    private boolean musicIsOn;
    private boolean isOn;
    private int volume;
    private ArrayList<Music> songs = new ArrayList<>();
    private Music currentPlayingMusic;

    public void turnOn() {
        isOn = true;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOff() {
        isOn = false;
    }

    public void flipButton() {
        if(isOn)
            turnOff();
        else
            turnOn();
    }


    public void increaseVolume() {
    volume++;
    }

    public int getVolume() {
        return volume;
    }

    public void decreaseVolume() {
        volume--;
    }


    public void download(Music music) {
        songs.add(music);
    }

    public int getTotalNumberOfMusic() {

        return songs.size();
    }


    public void deleteSongs(Music music) {
        songs.remove(music);
    }
    public Music getCurrentPlayingMusic() {
        return currentPlayingMusic;
    }

    public void playMusic(Music music) {
        currentPlayingMusic = music;
        musicIsOn = true;
    }

    public void pauseMusic() {
        musicIsOn = false;
    }


    public void playNextMusic() {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).equals(currentPlayingMusic)) {
                currentPlayingMusic = songs.get(i + 1);
                break;
            }
        }

    }
}
