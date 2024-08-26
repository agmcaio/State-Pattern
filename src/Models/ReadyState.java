package Models;

import Interface.State;

public class ReadyState implements State {
    private Player player;

    public ReadyState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.setState(new PlayingState(player));
        player.setPlaying(true);
        System.out.println(player.startPlayback());
    }

    @Override
    public void stop() {
        player.setState(new LockedState(player));
        System.out.println("Player locked!");
    }

    @Override
    public void next() {
        System.out.println("Nada acontece. O player está pronto, mas não reproduzindo.");
    }

    @Override
    public void prev() {
        System.out.println("Nada acontece. O player está pronto, mas não reproduzindo.");
    }
}
