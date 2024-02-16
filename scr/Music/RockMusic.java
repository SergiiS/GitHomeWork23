package Music;

public class RockMusic implements Service.MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing rock music...");
    }
}