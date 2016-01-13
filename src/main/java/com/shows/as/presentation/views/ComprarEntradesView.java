package com.shows.as.presentation.views;

import com.shows.as.domain.enums.TipusSessio;
import com.shows.as.domain.tupleTypes.TupleTypeRepresentacio;
import com.shows.as.domain.utils.ComboItem;
import com.shows.as.presentation.controllers.ComprarEntradesController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
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
    private JLabel local;
    private JLabel sessio;
    private JLabel entrades;
    private ComprarEntradesController controller;

    public ComprarEntradesView(ComprarEntradesController controller) {
        this.controller = controller;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int)screenSize.getWidth();
        int height = (int)screenSize.getHeight();
        setBounds((width / 2) - 225, (height / 2) - 150, 450, 300);
        setResizable(false);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        //posem com a invisible tot lo de representació
        comboBox5.setVisible(false);
        comboBox6.setVisible(false);
        comboBox7.setVisible(false);
        local.setVisible(false);
        sessio.setVisible(false);
        entrades.setVisible(false);

        //inicialitzem dates i entrades
        espectaclesComboBox.addItem("-");
        comboBox2.addItem("-");
        comboBox3.addItem("-");
        comboBox4.addItem("-");
        comboBox5.addItem("-");
        comboBox7.addItem("-");
        for(int i = 1; i <= 31;++i){
            comboBox2.addItem(i);
            if(i < 13) comboBox3.addItem(i);
            if(i < 10) comboBox6.addItem(i);
        }
        comboBox4.addItem(2016);

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
        comboBox2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comprobaQualitatDades();
            }
        });
        comboBox3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comprobaQualitatDades();
            }
        });
        comboBox4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comprobaQualitatDades();
            }
        });
        espectaclesComboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comprobaQualitatDades();
            }
        });
    }

    private void comprobaQualitatDades(){
        //todo afegir tambe espectacle seleccionat
        if(comboBox2.getSelectedIndex() != 0 && comboBox3.getSelectedIndex()!= 0
                && comboBox4.getSelectedIndex() != 0){
            comboBox5.setVisible(true);
            comboBox6.setVisible(true);
            comboBox7.setVisible(true);
            local.setVisible(true);
            sessio.setVisible(true);
            entrades.setVisible(true);
            //controller.prOkConsultaRepresentacions();
        }
    }

    private void onOK() {
// add your code here
        //todo afegir filtre per no fer ok si combos buits
        controller.prOkConsultaOcupacio((String)comboBox5.getSelectedItem(),
                (TipusSessio)comboBox7.getSelectedItem(),(Integer)comboBox6.getSelectedItem());
        //controller.prOkSeleccionarSeients();
        dispose();
    }

    private void onCancel() {
// add your code here if necessary
        controller.prCancel();
        dispose();
    }

    public static void main(String[] args) {
        //ComprarEntradesView dialog = new ComprarEntradesView();
        //dialog.pack();
        //dialog.setVisible(true);
        //System.exit(0);
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
