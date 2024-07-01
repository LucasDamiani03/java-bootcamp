//Declaring vars and methods

public class SmartTv {
    boolean on = false;
    int channel = 1;
    int volume = 25;    


//TV status config:    
public void turnOn(){
    on = true;
}

public void turnOff(){
    on = false;
}


//TV volume config:
public void increaseVolume(){
    volume++;
    //line above the same as: "volume = volume + 1;"
    System.out.println("Increasing TV volume to: " + volume);
    }

public void decreaseVolume(){
    volume--;
    System.out.println("Decreasing TV volume to: " + volume);
}


//TV channel config:
public void nextChannel(){
    channel++;
}

public void previousChannel(){
    channel--;
}

public void setChannel (int newChannel){
    channel = newChannel;
}

}