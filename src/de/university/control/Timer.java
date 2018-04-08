package de.university.control;

import de.university.gui.GUI;

public class Timer extends Thread{
    private GUI gui;

    public Timer(GUI gui){
        this.gui = gui;
    }

    public void run(){
        while(true){
            System.out.println("timer");
            gui.computeRound();

            try {
                Thread.sleep(6000);//wait one minute
            } catch (InterruptedException e) {
            }
        }
    }
}
