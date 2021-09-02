package ru.netology.box;

public class UselessBox {

    private volatile boolean boxActivate;
    private int counter;


    public void boxTumblerOn() {
        if (!boxActivate) {
            boxActivate = true;
            System.out.printf("Тумблер включен в %d раз \n", ++counter);
        }

    }

    public void boxTumblerOff() {

        if (boxActivate) {
            System.out.println("Руки прочь!");
            boxActivate = false;
            System.out.println("Тумблер выключен");
        }
    }

}
