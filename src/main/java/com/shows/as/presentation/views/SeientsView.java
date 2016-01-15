package com.shows.as.presentation.views;

import com.shows.as.domain.classes.Seient;
import com.shows.as.domain.tupleTypes.TupleTypeFilaColumna;
import com.shows.as.presentation.controllers.ComprarEntradesController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class SeientsView extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JCheckBox c00;
    private JCheckBox c01;
    private JCheckBox c02;
    private JCheckBox c03;
    private JCheckBox c04;
    private JCheckBox c05;
    private JCheckBox c06;
    private JCheckBox c07;
    private JCheckBox c10;
    private JCheckBox c11;
    private JCheckBox c12;
    private JCheckBox c13;
    private JCheckBox c14;
    private JCheckBox c15;
    private JCheckBox c16;
    private JCheckBox c17;
    private JCheckBox c20;
    private JCheckBox c21;
    private JCheckBox c22;
    private JCheckBox c23;
    private JCheckBox c24;
    private JCheckBox c25;
    private JCheckBox c26;
    private JCheckBox c27;
    private JCheckBox c30;
    private JCheckBox c31;
    private JCheckBox c32;
    private JCheckBox c33;
    private JCheckBox c34;
    private JCheckBox c35;
    private JCheckBox c36;
    private JCheckBox c37;

    private JCheckBox[][] buttons = {{c00, c01, c02, c03, c04, c05, c06, c07}, {c10, c11, c12, c13, c14, c15, c16, c17}, {c20, c21, c22, c23, c24, c25, c26, c27}, {c30, c31, c32, c33, c34, c35, c36, c37}};
    private int nEspectadors;
    private String nomlocal;
    private ComprarEntradesController controller;

    public SeientsView(ComprarEntradesController controller) {
        this.controller = controller;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)screenSize.getWidth();
        int height = (int)screenSize.getHeight();
        setBounds((width/2)-225,(height/2)-150,450,300);
        setResizable(false);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

// call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

// call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    public void repInfo(int nEspectadors, String nomlocal) {
        this.nEspectadors = nEspectadors;
        this.nomlocal = nomlocal;
    }

    private void onOK() {
        Set<Seient> seients = new LinkedHashSet<Seient>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (buttons[i][j].isSelected()) seients.add(new Seient(i, j, this.nomlocal));
            }
        }

        if (seients.size() != this.nEspectadors) {
            controller.prMostraMissatgeError("Has de seleccionar " + this.nEspectadors + " seients");
            return;
        }
        controller.prOkSeleccionarSeients(seients);
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public static void main(String[] args) {

    }

    public void mostraSeients(Set<TupleTypeFilaColumna> tupleTypeFilaColumnas) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                buttons[i][j].setEnabled(false);
            }
        }
        for (TupleTypeFilaColumna t : tupleTypeFilaColumnas) {
            buttons[t.fila][t.columna].setEnabled(true);
        }
    }
}
