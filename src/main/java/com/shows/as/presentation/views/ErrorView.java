package com.shows.as.presentation.views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ErrorView extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel errorText;

    public ErrorView() {
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
        dispose();
    }

    private void onCancel() {
        dispose();
    }

    public static void main(String[] args) {
        ErrorView dialog = new ErrorView();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    public void mostraMissatgeError(String text) {
        errorText.setText(text);
    }
}
