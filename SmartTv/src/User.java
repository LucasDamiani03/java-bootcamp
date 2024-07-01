public class User {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

//Standard TV config        
        System.out.println("TV ON? " + smartTv.on);
        System.out.println("Current TV channel: " + smartTv.channel);
        System.out.println("Current TV volume: " + smartTv.volume);

//checking volume status:
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.decreaseVolume();
        smartTv.increaseVolume();
        System.out.println("Current TV volume is: " + smartTv.volume);

//checkin TV status
        smartTv.turnOn();
        System.out.println("New Status --> TV ON? " + smartTv.on);

        smartTv.turnOff();
        System.out.println("New Status --> TV ON? " + smartTv.on);

//setting TV channel
        smartTv.setChannel(13);
        System.out.println("Current TV channel is: " + smartTv.channel);
        smartTv.nextChannel();
        System.out.println("Current TV channel is: " + smartTv.channel);
        smartTv.previousChannel();
        System.out.println("Current TV channel is: " + smartTv.channel);

    }
}
