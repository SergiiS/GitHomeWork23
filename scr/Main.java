import Service.MusicStyles;

public class Main {
    public static void main(String[] args) {

        MusicStyles popMusicGroup = new Music.PopMusic();
        System.out.println(popMusicGroup);

        MusicStyles rockMusicGroup = new Music.RockMusic();
        System.out.println(rockMusicGroup);

        MusicStyles classicMusicGroup = new Music.ClassicMusic();
        System.out.println(classicMusicGroup);

        MusicStyles[] musicGroups = {popMusicGroup, rockMusicGroup, classicMusicGroup};

        for (MusicStyles musicGroup : musicGroups) {
            musicGroup.playMusic();
        }
    }
}
