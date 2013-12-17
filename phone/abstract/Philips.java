package Boer;

public class Philips extends phone implements loud {

    @Override
    public void ring() {
        System.out.println("Philips music is playing");
    }

    @Override
    public void loudRing() {
        System.out.println("Loud song is playing");
    }
    
}
