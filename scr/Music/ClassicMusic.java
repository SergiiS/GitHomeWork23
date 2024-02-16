package Music;

public class ClassicMusic implements Service.MusicStyles {
    @Override
    public void playMusic() {
        System.out.println("Playing classical music...");
    }
}
