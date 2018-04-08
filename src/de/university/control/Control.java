package de.university.control;

import de.university.data.Data;
import de.university.gui.GUI;
/**
 * initalisiesd the whole gui and data.
 *
 */
public class Control {

    public static void main(String[] args){
        //TODO init stuff
        Data data = new Data(100);
        GUI gui = new de.university.gui.GUI(data);
        new Timer(gui).run();
    }
}
