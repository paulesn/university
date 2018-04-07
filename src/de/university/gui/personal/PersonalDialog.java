package de.university.gui.personal;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;
import de.university.gui.GUI;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonalDialog extends JDialog {
    //----variables----
    private GUI gui;
    private JPanel colums;
    private JLabel[] titles = new JLabel[6];
    private JPanel pane;
    private JPanel pane1;
    private JPanel pane2;
    private JScrollPane sPane;
    private Font font = new Font("Monospace", Font.BOLD, 25);

    private ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new HireDialog(gui);
        }
    };
    //----methods----

    /**
     * inits the dialog
     */
    private void init(){
        //main pane
        pane = new JPanel();
        pane.setLayout(new BorderLayout());
        pane1 = new JPanel();
        pane1.setLayout(new GridLayout(3,3));
        JLabel labelStud = new JLabel("Stud.:", SwingConstants.CENTER);
        labelStud.setFont(font);
        pane1.add(labelStud);
        JLabel labelStudCount = new JLabel("4444", SwingConstants.CENTER);
        labelStudCount.setFont(font);
        pane1.add(labelStudCount);
        JLabel labelProf = new JLabel("Prof.:", SwingConstants.CENTER);
        labelProf.setFont(font);
        pane1.add(labelProf);
        JLabel labelProfCount = new JLabel("44444", SwingConstants.CENTER);
        labelProfCount.setFont(font);
        pane1.add(labelProfCount);
        JButton hireProf = new JButton("New Prof");
        hireProf.setBackground(Color.gray);
        hireProf.setForeground(Color.white);
        //menuButtons[i].setBorder(BorderFactory.createRaisedBevelBorder());
        hireProf.setActionCommand("hireProf");
        hireProf.addActionListener(listener);
        hireProf.setFont(font);
        hireProf.setPreferredSize(new Dimension(150,50));
        pane1.add(hireProf);
        pane.add(pane1,BorderLayout.NORTH);

        pane2 = new JPanel(new GridLayout(0,1));
        sPane = new JScrollPane(pane2);
        pane.add(sPane,BorderLayout.CENTER);

        this.add(pane);


    }

    //----constructor----
    public PersonalDialog(GUI gui){
        super();
        this.gui = gui;
        this.setMinimumSize(new Dimension(700,800));
        this.setPreferredSize(new Dimension(700,800));
        this.setLocationRelativeTo(this.gui);
        //this.setLayout(new GridLayout(0,1));
        init();
        this.setVisible(true);
        /*
        in the build mode the build dialog will be closed and the buttens will be colored:
        red cant click here
        green can click here
        blue: this buttons will be the room if you click on that below you're cursor XD
         */
    }

}