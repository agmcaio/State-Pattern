package Models;

import Interface.State;

public class LockedState implements State {
    private Player player;

    public LockedState(Player player) {
        this.player = player;
    }

    @Override
    public void play() {
        player.setState(new ReadyState(player));
        System.out.println("Player desbloqueado.");
    }

    @Override
    public void stop() {
        if (player.isPlaying()) {
            player.setState(new ReadyState(player));
            player.setPlaying(false);
            System.out.println("Playback parado. Player desbloqueado.");
        } else {
            System.out.println("Player está travado.");
        }
    }

    @Override
    public void next() {
        System.out.println("Nada acontece. Player está travado.");
    }

    @Override
    public void prev() {
        System.out.println("Nada acontece. Player está travado.");
    }
}
