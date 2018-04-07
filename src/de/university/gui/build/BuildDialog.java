package de.university.gui.build;

import de.university.gui.GUI;

import javax.swing.*;
import java.awt.*;

public class BuildDialog extends JDialog {
    //----variables----
    private GUI gui;
    private static JDialog d;

    //----methods----

    /**
     * inits the dialog
     */
    private void init(){
        JFrame f= new JFrame();
        d = new JDialog(f , "Build", true);
        d.setLocationRelativeTo(gui);
        d.setLocation(150, 160);

        String[] columnNames = {"Picture",
                "Name",
                "Costs",
                "Benefits",
                "Info",
                "Build"};
        Object[][] data = {
                {"Test", "Test1",
                        "Test2", "Test3", "Test4", new Button()}

        };
        //TODO have fun Kevin
        d.setSize(900,940);
        d.setVisible(true);

    }

    //----constructor----
    public BuildDialog(GUI gui){
        super();
        this.gui = gui;
        init();
        //TODO a button will be selected and starts the build mode or the info dialog of the building will be shown
        /*
        in the build mode the build dialog will be closed and the buttens will be colored:
        red cant click here
        green can click here
        blue: this buttons will be the room if you click on that below you're cursor XD
         */
    }

}
