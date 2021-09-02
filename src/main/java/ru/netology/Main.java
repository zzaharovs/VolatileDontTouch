package ru.netology;

import ru.netology.box.UselessBox;
import ru.netology.threads.User;
import ru.netology.threads.BoxSecurity;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
         UselessBox box = new UselessBox();

         Thread t1 = new User(box::boxTumblerOn);
         Thread t2 = new BoxSecurity(box::boxTumblerOff);

         t1.start();
         t2.start();

         t1.join();
         t2.interrupt();




    }

}
