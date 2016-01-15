package com.shows.as.presentation.views;

import com.shows.as.domain.enums.Moneda;
import com.shows.as.domain.tupleTypes.TupleTypeSeleccioSeients;
import com.shows.as.domain.utils.ComboItem;
import com.shows.as.presentation.controllers.ComprarEntradesController;

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
    private JLabel preu;
    private ComprarEntradesController controller;

    public PagamentView(final ComprarEntradesController controller) {
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

        comboBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                controller.prCanviMoneda((Moneda) comboBox1.getSelectedItem());
            }
        });

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    }

    private void onOK() {
        if (textField1.getText().isEmpty() || textField2.getText().isEmpty() || textField3.getText().isEmpty()) {
            controller.prMostraMissatgeError("Omple tots els camps");
            return;
        }
        controller.prOkPagament(textField1.getText(), Integer.parseInt(textField2.getText()), textField3.getText());
    }

    private void onCancel() {
        dispose();
    }

    public static void main(String[] args) {

    }

    public void seientsSeleccionats(TupleTypeSeleccioSeients tupleTypeSeleccioSeients) {
        preu.setText(tupleTypeSeleccioSeients.preu.toString());
        comboBox1.addItem(Moneda.EUR);
        for (Moneda m : tupleTypeSeleccioSeients.canvis) {
            comboBox1.addItem(m);
        }
    }

    public void mostraPreu(Double preuMoneda) {
        preu.setText(preuMoneda.toString());
    }
}
