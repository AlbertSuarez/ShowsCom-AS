package com.shows.as.presentation.views;

import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;
import com.shows.as.domain.utils.ComboItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Set;

public class ComprarEntradesView extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox espectaclesComboBox;
    private JComboBox comboBox2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JComboBox comboBox5;
    private JComboBox comboBox6;
    private JComboBox comboBox7;

    public ComprarEntradesView() {
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

    private void onOK() {
// add your code here
        dispose();
    }

    private void onCancel() {
// add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        ComprarEntradesView dialog = new ComprarEntradesView();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public void mostraEspectacles(Set<String> espectacles) {
        if (espectacles.isEmpty()) {
            // TODO Mostrar Error View
            return;
        }
        int i = 1;
        for (String s : espectacles) {
            espectaclesComboBox.addItem(new ComboItem(s, "Value " + i));
            ++i;
        }
    }

    public void mostraRepresentacions(Set<TupleTypeRepresentacio> tupleTypeRepresentacios) {
        if (tupleTypeRepresentacios.isEmpty()) {
            // TODO Mostrar Error View
            return;
        }
    }
}
