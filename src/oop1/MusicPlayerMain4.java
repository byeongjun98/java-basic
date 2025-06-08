package oop1;

public class MusicPlayerMain4 {
    public static void main(String[] args) {
        MusicPlayer p = new MusicPlayer();
        p.on();
        p.volumeUp();
        p.volumeUp();
        p.volumeDown();
        p.showStatus();
        p.off();
    }
}
