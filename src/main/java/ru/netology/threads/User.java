package ru.netology.threads;

import java.util.Random;

public class User extends Thread {

    private int counter;
    private final int MAX_ITERATION_VALUE = 10;
    private final int WAIT_TIME;

    public User(Runnable runnable) {
        super(runnable);
        Random random = new Random();
        int randomTime = random.nextInt(10);
        this.WAIT_TIME = randomTime * 100;
    }

    @Override
    public void run() {

        while (!isInterrupted()) {
            try {
                sleep(WAIT_TIME);
            } catch (InterruptedException ignore) {
            }
            super.run();
            counter++;
            if (counter == MAX_ITERATION_VALUE) {
                interrupt();
            }

        }

    }
}
