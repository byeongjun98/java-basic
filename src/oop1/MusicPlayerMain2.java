package oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);

        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        volumeDown(data);
        volumeDown(data);

        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        data.volume = 1;
        System.out.println("음악 플레이어를 시작합니다. 볼륨: " + data.volume);
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        data.volume = 0;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumeUp(MusicPlayerData data) {
        data.isOn = true;
        if (data.volume == 1) {
            data.volume = 2;
        } else if(data.volume <= 2) {
            data.volume++;
        }
        System.out.println("볼륨: " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        if (data.volume == 0) {
            data.isOn = false;
            System.out.println("음소거 상태, 볼륨: " + data.volume);
        } else {
            System.out.println("볼륨: " + data.volume);
        }
    }
}
