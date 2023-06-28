package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("1 i 2");
        System.out.println(compare(1,2));
        System.out.println("1 i 1");
        System.out.println(compare(1,1));
        System.out.println("2 i 1");
        System.out.println(compare(2,1));

        Dog dog = new Dog("Dog","Brown",2);
        dog.bark();
        dog.sleep();

        TV tv = new TV();
        Remote remote = new Remote();
        remote.turnTV(true,tv);
        remote.volumeUp(tv);
        System.out.println(tv.volume);
        remote.volumeDown(tv);
        remote.volumeDown(tv);
        for (int x = tv.volume;x<11;x++){
            remote.volumeUp(tv);
            System.out.println(tv.volume);
        }
        remote.channelDown(tv);
        for (int i = tv.channel;i<21;i++){
            remote.channelUp(tv);
            System.out.println(tv.channel);
        }
    }

public static int compare(int a,int b) {
    if (a == b) {
        return 0;
    } else if (a > b) {
        return -1;
    } else {
        return 1;
    }
}
}