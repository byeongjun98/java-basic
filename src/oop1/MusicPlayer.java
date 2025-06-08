package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn = false;

    void on() {
        isOn = true;
        volume = 1;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void off() {
        isOn = false;
        volume = 0;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void volumeUp() {
        if (isOn) {
            volume++;
            System.out.println("음악 플레이어 볼륨: "+ volume);
        } else {
            volume = 1;
            System.out.println("음악 플레이어 볼륨: "+ volume);
        }
    }

    void volumeDown() {
        if (isOn) {
            if (volume <= 1) {
                volume = 0;
                System.out.println("음소거 상태입니다.");
            } else {
                volume--;
                System.out.println("음악 플레이어 볼륨: "+ volume);
            }

        }else if (!isOn) {
            System.out.println("음소거 상태입니다.");
        }
    }

    void showStatus() {
        if (isOn) {
            System.out.println("뮤직 플레이어가 실행중입니다 볼륨: " + volume);
        } else {
            System.out.println("뮤직 플레이어가 중지상태입니다.");
        }
    }
}
