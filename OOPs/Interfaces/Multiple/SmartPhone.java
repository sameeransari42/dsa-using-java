package OOPs.Interfaces.Multiple;

public class SmartPhone implements Phone, Music, Camera{
    @Override
    public void takePhoto() {
        System.out.println("Camera take phots");
    }

    @Override
    public void recordVideo() {
        System.out.println("Camera record videos");
    }

    @Override
    public void playMusic() {
        System.out.println("Music play");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stop");
    }

    @Override
    public void makeCall() {
        System.out.println("Phone is calling");
    }

    @Override
    public void endCall() {
        System.out.println("Phone is ending call");
    }
}
