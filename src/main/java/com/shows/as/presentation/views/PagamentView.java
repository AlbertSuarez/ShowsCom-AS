package com.shows.as.presentation.views;

import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.utils.ComboItem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PagamentView extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;

    public PagamentView() {
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

        comboBox1.addItem(new ComboItem(Moneda.EUR.toString(), "Value 1"));
        comboBox1.addItem(new ComboItem(Moneda.USD.toString(), "Value 2"));
        comboBox1.addItem(new ComboItem(Moneda.GBP.toString(), "Value 3"));


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
        PagamentView dialog = new PagamentView();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public void mostraPreu(Double preu) {
        comboBox1.addItem(new ComboItem(preu.toString(), "Preu"));
    }
}
