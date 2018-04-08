package de.university.gui.score;

import de.university.data.Data;
import de.university.data.professors.Prof;
import de.university.gui.GUI;
import de.university.gui.personal.HireDialog;
import de.university.gui.personal.PersonalDialog;
import de.university.gui.personal.PersonalTableRow;

import javax.swing.*;
import javax.swing.plaf.TableHeaderUI;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Score extends JDialog {
    //----variables----
    private Score me;
    private GUI gui;
    private JPanel pane;
    private JScrollPane sPane;
    private Font font = new Font("Monospace", Font.BOLD, 25);
    private Data data;

    private String[] columnNames = {"Username", "Score",};

    private Object[] scoreData;
            /*{
            {"Kathy", "30"},
            {"John", "20"},

    };*/

    private DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

    //----methods----

    public void setScoreData(ArrayList<UserScore> userScore){

        for (UserScore user: userScore) {
            Object[] temp = {user.getName(), ""+user.getScore()};
            this.tableModel.addRow(temp);
        }


    }

    /**
     * inits the personal dialog
     */
    private void init(){

        //main pane
        JTable table = new JTable(this.tableModel);
        table.setRowHeight(50);
        table.setFont(font);
        JTableHeader header = table.getTableHeader();
        header.setFont(font);
        header.setBackground(Color.GRAY);
        header.setForeground(Color.WHITE);
        sPane = new JScrollPane(table);
        this.add(sPane);

    }

    //----constructor----
    public Score(GUI gui){
        super();
        me = this;
        this.gui = gui;
        this.data = this.gui.getData();
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
