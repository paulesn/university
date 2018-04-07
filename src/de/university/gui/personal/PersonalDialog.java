package de.university.gui.personal;

import com.sun.xml.internal.ws.wsdl.writer.document.soap.Body;
import de.university.data.professors.Prof;
import de.university.gui.GUI;
import de.university.data.Data;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PersonalDialog extends JDialog {
    //----variables----
    private PersonalDialog me;
    private GUI gui;
    private JPanel colums;
    private JLabel[] titles = new JLabel[6];
    private JPanel pane;
    private JPanel pane1;
    private JPanel pane2;
    private JScrollPane sPane;
    private Font font = new Font("Monospace", Font.BOLD, 25);
    private Data data;
    private ArrayList<Prof> profs;

    private ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new HireDialog(gui,me);
        }
    };
    //----methods----
    public void profDisplay(){
        //TODO get profs out of data
        if(!this.data.getProfs().isEmpty()){
            profs = this.data.getProfs();

            for(Prof prof: profs){
                pane2.add(new PersonalTableRow(prof, gui));
            }
        }
        this.repaint();

    }

    /**
     * inits the personal dialog
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
        hireProf.setActionCommand("hireProf");
        hireProf.addActionListener(listener);
        hireProf.setFont(font);
        hireProf.setPreferredSize(new Dimension(150,50));
        pane1.add(hireProf);
        pane.add(pane1,BorderLayout.NORTH);



        pane2 = new JPanel(new GridLayout(0,1));
        colums = new JPanel();
        pane2.add(colums);
        colums.setLayout(new FlowLayout());
        //the datas
        titles[0] = new JLabel("Name");
        titles[0].setFont(font);
        colums.add(titles[0]);
        titles[1] = new JLabel("Costs");
        titles[1].setFont(font);
        colums.add(titles[1]);
        titles[2] = new JLabel("WellBeing");
        titles[2].setFont(font);
        colums.add(titles[2]);
        titles[3] = new JLabel("Knowledge");
        titles[3].setFont(font);
        colums.add(titles[3]);
        titles[4] = new JLabel("Benefits");
        titles[4].setFont(font);
        colums.add(titles[4]);
        titles[5] = new JLabel("Info");
        titles[5].setFont(font);
        colums.add(titles[5]);

        sPane = new JScrollPane(pane2);
        pane.add(sPane,BorderLayout.CENTER);

        this.add(pane);

        profDisplay();
    }

    //----constructor----
    public PersonalDialog(GUI gui){
        super();
        this.gui = gui;
        this.data = this.gui.getData();
        this.setMinimumSize(new Dimension(700,800));
        this.setPreferredSize(new Dimension(700,800));
        this.setLocationRelativeTo(this.gui);
        //this.setLayout(new GridLayout(0,1));
        init();
        me = this;
        this.setVisible(true);

        /*
        in the build mode the build dialog will be closed and the buttens will be colored:
        red cant click here
        green can click here
        blue: this buttons will be the room if you click on that below you're cursor XD
         */
    }

}
