package Models;

import Interface.State;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private State state;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;
    private boolean isPlaying;

    public Player() {
        this.state = new ReadyState(this);
        populatePlaylist();
        this.isPlaying = false;
    }

    private void populatePlaylist() {
        playlist.add("Avenged Sevenfold - Hail to the King");
        playlist.add("Eminem - Lose Yourself");
        playlist.add("Flávio José - Filho do Dono");
        playlist.add("Queen - Bohemian Rhapsody");
        playlist.add("Led Zeppelin - Stairway to Heaven");
        playlist.add("The Beatles - Hey Jude");
        playlist.add("Pink Floyd - Wish You Were Here");
        playlist.add("Metallica - Nothing Else Matters");
        playlist.add("Nirvana - Smells Like Teen Spirit");
        playlist.add("Red Hot Chili Peppers - Californication");
        playlist.add("Beyoncé - Halo");
        playlist.add("Drake - God's Plan");
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setPlaying(boolean isPlaying) {
        this.isPlaying = isPlaying;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public String startPlayback() {
        return "Reproduzindo: " + playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack = (currentTrack + 1) % playlist.size();
        return "Reproduzindo: " + playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack = (currentTrack - 1 + playlist.size()) % playlist.size();
        return "Reproduzindo: " + playlist.get(currentTrack);
    }

    public void play() {
        state.play();
    }

    public void stop() {
        state.stop();
    }

    public void next() {
        state.next();
    }

    public void prev() {
        state.prev();
    }
}
