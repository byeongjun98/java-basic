package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        System.out.println("볼륨 필드 직접 접근");
        // speaker.volume = 200; private 로 선언해둠
        speaker.showVolume();

    }
}
