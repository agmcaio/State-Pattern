package Models;

import Interface.State;

public class PlayingState implements State {
    private Player player;

    public PlayingState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.setState(new ReadyState(player));
        player.setPlaying(false);
        System.out.println("Playback pausado.");
    }

    @Override
    public void stop() {
        player.setState(new LockedState(player));
        player.setPlaying(false);
        System.out.println("Playback parado. Player locked!");
    }

    @Override
    public void next() {
        System.out.println(player.nextTrack());
    }

    @Override
    public void prev() {
        System.out.println(player.previousTrack());
    }
}
