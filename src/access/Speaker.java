package access;

public class Speaker {
    int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumeUp(){
        if(volume >= 100){
            System.out.println("Volume is lower than 100");
        }else {
            volume += 10;
            System.out.println("볼륨 업 호출 " + volume);
        }
    }

    void volumeDown(){
        volume -= 10;
        System.out.println("볼륨 다운 호출  " + volume);
    }

    void showVolume(){
        System.out.println("Volume is " + volume);
    }
}
