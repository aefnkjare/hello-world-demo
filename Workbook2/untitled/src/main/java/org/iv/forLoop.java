package org.iv;

public class forLoop {
    public static void main(String [] args) throws InterruptedException {
        ///////////////////////////
//        Inside the loop, use "Thread.sleep(1000) to pause 1 second

        String cdDone = "Launch!";

        for(int i = 5; i <= 0; i--){ // Must use i within for statments, convention is "i" = iterator
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
        System.out.println(cdDone);

        int i = 1;
        while (i <= 10) {
           System.out.println(i);
            Thread.sleep(1000);
            i++;
        }
//        for(;;){ // Dont use this, it is infinite for the for loop
//
//        }
    }
}
