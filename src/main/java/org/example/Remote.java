package org.example;

public class Remote {
    TV TV;

    public void volumeUp(TV tv){
        if (tv.on == false){
            System.out.println("TV is turned off");
        }
        else
        {
            if(tv.volume == 10) {
                System.out.println("Max volume");
            }
            else{
            tv.volume+=1;
            }
        }
    }
    public void volumeDown(TV tv){
        if (tv.on == false){
            System.out.println("TV is turned off");
        }
        else {
            if(tv.volume == 1) {
                System.out.println("Min volume");
            }
            else{
                tv.volume-=1;
            }

            }
        }
    public void channelUp(TV tv){
        if (tv.on == false){
            System.out.println("TV is turned off");
        }
        else {
            if (tv.channel == 20){
                System.out.println("No more channels than 20");
            }
            else {
                tv.channel+=1;
            }
        }
    }
    public void channelDown(TV tv){
        if (tv.on == false){
            System.out.println("TV is turned off");
        }
        else {
            if (tv.channel == 1){
                System.out.println("No less channels than 1");
            }
            else {
                tv.channel-=1;
            }
        }
    }
    public void turnTV(Boolean t, TV tv){
        tv.on = t;
    }
}

