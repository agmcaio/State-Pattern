import Models.Player;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        player.play();
        player.next();
        player.next();
        player.stop();
        player.play();
        player.prev();
    }
}