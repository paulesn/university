package de.university.control;

import de.university.data.Data;
import de.university.gui.build.Builder;
import de.university.introduction.Introduction;
/**
 * initalisiesd the whole gui and data.
 *
 */
public class Control {

    public static void main(String[] args){
        //TODO init stuff
        Data data = new Data(100);
        new de.university.gui.GUI(data);
        Introduction intro = new Introduction();
        intro.start();
    }
}
