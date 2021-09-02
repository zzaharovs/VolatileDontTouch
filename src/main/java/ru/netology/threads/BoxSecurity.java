package ru.netology.threads;

import java.util.Random;

public class BoxSecurity extends Thread {

    private final int WAIT_TIME;

    public BoxSecurity(Runnable runnable) {

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
            } catch (InterruptedException ex) {
                interrupt();
            }
            super.run();

        }

    }
}
