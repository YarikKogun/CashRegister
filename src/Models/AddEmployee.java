/*
 * Created by JFormDesigner on Fri Oct 26 11:29:32 CEST 2018
 */

package Models;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.util.Arrays;
import java.util.Properties;
import javax.swing.*;

import org.jdatepicker.impl.DateComponentFormatter;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.jdesktop.swingx.*;
import org.jdesktop.swingx.table.*;

/**
 * @author Yaroslav
 */
public class AddEmployee {
    private JDatePickerImpl dateOfCreatePicker;
    private Connection cn;
    public AddEmployee(Connection cn) {
        initComponents();
        this.cn = cn;
        addEmpDialog.setVisible(true);
        /*
        Properties p = new Properties();
        p.put("text.today", "Сегодня");
        p.put("text.month", "Месяц");
        p.put("text.year", "Год");
        dateOfCreatePicker = new JDatePickerImpl(new JDatePanelImpl(new UtilDateModel(), p), new DateComponentFormatter());

        firstpanel.add(dateOfCreatePicker, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
        */


    }

    private void button_addActionPerformed(ActionEvent e) {
        if(textField_id.getText().isEmpty()||textField_name.getText().isEmpty()||textField_surname.getText().isEmpty()||xDatePicker1.getDate().toString().isEmpty()){
            fillAllFieldsDialog.setVisible(true);
        }else if(passwordField1.getPassword().length==0 || passwordField2.getPassword().length==0 || !Arrays.equals(passwordField1.getPassword(),passwordField2.getPassword())){
            passwordIncorrectDialog.setVisible(true);
        }else {
            confirmDialog.setVisible(true);
        }
    }

    private void button_back2ActionPerformed(ActionEvent e) {
        fillAllFieldsDialog.dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Yaroslav
        addEmpDialog = new JFrame();
        panel1 = new JPanel();
        label_id = new JLabel();
        textField_id = new JTextField();
        label_name = new JLabel();
        textField_name = new JTextField();
        label_surname = new JLabel();
        textField_surname = new JTextField();
        label_birthday = new JLabel();
        xDatePicker1 = new JXDatePicker();
        label_pass = new JLabel();
        passwordField1 = new JPasswordField();
        label_pass2 = new JLabel();
        passwordField2 = new JPasswordField();
        panel2 = new JPanel();
        button_back = new JButton();
        button_add = new JButton();
        confirmDialog = new JDialog();
        label1 = new JLabel();
        panel3 = new JPanel();
        button_no = new JButton();
        button_yes = new JButton();
        fillAllFieldsDialog = new JDialog();
        label2 = new JLabel();
        button_back2 = new JButton();
        passwordIncorrectDialog = new JDialog();
        label3 = new JLabel();
        button_back3 = new JButton();

        //======== addEmpDialog ========
        {
            addEmpDialog.setTitle("\u0414\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0441\u043e\u0442\u0440\u0443\u0434\u043d\u0438\u043a\u0430");
            Container addEmpDialogContentPane = addEmpDialog.getContentPane();
            addEmpDialogContentPane.setLayout(new GridBagLayout());

            //======== panel1 ========
            {

                // JFormDesigner evaluation mark
                panel1.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), panel1.getBorder())); panel1.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

                panel1.setLayout(new GridBagLayout());
                ((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {145, 170, 0};
                ((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0};
                ((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

                //---- label_id ----
                label_id.setText("ID / \u041b\u043e\u0433\u0438\u043d");
                panel1.add(label_id, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 5, 5), 0, 0));
                panel1.add(textField_id, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- label_name ----
                label_name.setText("\u0418\u043c\u044f");
                panel1.add(label_name, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 5, 5), 0, 0));
                panel1.add(textField_name, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- label_surname ----
                label_surname.setText("\u0424\u0430\u043c\u0438\u043b\u0438\u044f");
                panel1.add(label_surname, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 5, 5), 0, 0));
                panel1.add(textField_surname, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- label_birthday ----
                label_birthday.setText("\u0414\u0430\u0442\u0430 \u0440\u043e\u0436\u0434\u0435\u043d\u0438\u044f");
                panel1.add(label_birthday, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 5, 5), 0, 0));
                panel1.add(xDatePicker1, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- label_pass ----
                label_pass.setText("\u041f\u0430\u0440\u043e\u043b\u044c");
                panel1.add(label_pass, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 5, 5), 0, 0));
                panel1.add(passwordField1, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- label_pass2 ----
                label_pass2.setText("\u041f\u043e\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u0435 \u043f\u0430\u0440\u043e\u043b\u044c");
                panel1.add(label_pass2, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                    GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
                    new Insets(0, 0, 0, 5), 0, 0));
                panel1.add(passwordField2, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            addEmpDialogContentPane.add(panel1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //======== panel2 ========
            {
                panel2.setLayout(new GridBagLayout());
                ((GridBagLayout)panel2.getLayout()).columnWidths = new int[] {105, 105, 100, 0};
                ((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {50, 0};
                ((GridBagLayout)panel2.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                //---- button_back ----
                button_back.setText("\u041d\u0430\u0437\u0430\u0434");
                panel2.add(button_back, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- button_add ----
                button_add.setText("\u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c");
                button_add.addActionListener(e -> button_addActionPerformed(e));
                panel2.add(button_add, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            addEmpDialogContentPane.add(panel2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            addEmpDialog.pack();
            addEmpDialog.setLocationRelativeTo(null);
        }

        //======== confirmDialog ========
        {
            Container confirmDialogContentPane = confirmDialog.getContentPane();
            confirmDialogContentPane.setLayout(new GridBagLayout());
            ((GridBagLayout)confirmDialogContentPane.getLayout()).columnWidths = new int[] {28, 182, 20, 0};
            ((GridBagLayout)confirmDialogContentPane.getLayout()).rowHeights = new int[] {12, 36, 0, 0, 0};
            ((GridBagLayout)confirmDialogContentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout)confirmDialogContentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- label1 ----
            label1.setText("\u041f\u043e\u0434\u0442\u0432\u0435\u0440\u0434\u0438\u0442\u0435 \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d\u0438\u0435 \u0441\u043e\u0442\u0440\u0443\u0434\u043d\u0438\u043a\u0430");
            confirmDialogContentPane.add(label1, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
                new Insets(0, 0, 5, 5), 0, 0));

            //======== panel3 ========
            {

                // JFormDesigner evaluation mark
                panel3.setBorder(new javax.swing.border.CompoundBorder(
                    new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                        "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                        javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                        java.awt.Color.red), panel3.getBorder())); panel3.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});

                panel3.setLayout(new GridBagLayout());
                ((GridBagLayout)panel3.getLayout()).columnWidths = new int[] {135, 130, 0};
                ((GridBagLayout)panel3.getLayout()).rowHeights = new int[] {40, 0};
                ((GridBagLayout)panel3.getLayout()).columnWeights = new double[] {0.0, 0.0, 1.0E-4};
                ((GridBagLayout)panel3.getLayout()).rowWeights = new double[] {0.0, 1.0E-4};

                //---- button_no ----
                button_no.setText("\u041e\u0442\u043c\u0435\u043d\u0430");
                panel3.add(button_no, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));

                //---- button_yes ----
                button_yes.setText("\u0414\u043e\u0431\u0430\u0432\u0438\u0442\u044c");
                panel3.add(button_yes, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            confirmDialogContentPane.add(panel3, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            confirmDialog.pack();
            confirmDialog.setLocationRelativeTo(null);
        }

        //======== fillAllFieldsDialog ========
        {
            Container fillAllFieldsDialogContentPane = fillAllFieldsDialog.getContentPane();
            fillAllFieldsDialogContentPane.setLayout(new GridBagLayout());
            ((GridBagLayout)fillAllFieldsDialogContentPane.getLayout()).columnWidths = new int[] {30, 0, 25};
            ((GridBagLayout)fillAllFieldsDialogContentPane.getLayout()).rowHeights = new int[] {30, 0, 45, 25};

            //---- label2 ----
            label2.setText("\u0417\u0430\u043f\u043e\u043b\u043d\u0438\u0442\u0435 \u0432\u0441\u0435 \u043f\u043e\u043b\u044f!");
            fillAllFieldsDialogContentPane.add(label2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button_back2 ----
            button_back2.setText("\u041d\u0430\u0437\u0430\u0434");
            button_back2.addActionListener(e -> button_back2ActionPerformed(e));
            fillAllFieldsDialogContentPane.add(button_back2, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            fillAllFieldsDialog.pack();
            fillAllFieldsDialog.setLocationRelativeTo(null);
        }

        //======== passwordIncorrectDialog ========
        {
            Container passwordIncorrectDialogContentPane = passwordIncorrectDialog.getContentPane();
            passwordIncorrectDialogContentPane.setLayout(new GridBagLayout());
            ((GridBagLayout)passwordIncorrectDialogContentPane.getLayout()).columnWidths = new int[] {24, 0, 20};
            ((GridBagLayout)passwordIncorrectDialogContentPane.getLayout()).rowHeights = new int[] {30, 0, 45, 25};

            //---- label3 ----
            label3.setText("\u041f\u0430\u0440\u043e\u043b\u0438 \u043d\u0435 \u0441\u043e\u0432\u043f\u0430\u0434\u0430\u044e\u0442!");
            passwordIncorrectDialogContentPane.add(label3, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button_back3 ----
            button_back3.setText("\u041d\u0430\u0437\u0430\u0434");
            passwordIncorrectDialogContentPane.add(button_back3, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            passwordIncorrectDialog.pack();
            passwordIncorrectDialog.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Yaroslav
    private JFrame addEmpDialog;
    private JPanel panel1;
    private JLabel label_id;
    private JTextField textField_id;
    private JLabel label_name;
    private JTextField textField_name;
    private JLabel label_surname;
    private JTextField textField_surname;
    private JLabel label_birthday;
    private JXDatePicker xDatePicker1;
    private JLabel label_pass;
    private JPasswordField passwordField1;
    private JLabel label_pass2;
    private JPasswordField passwordField2;
    private JPanel panel2;
    private JButton button_back;
    private JButton button_add;
    private JDialog confirmDialog;
    private JLabel label1;
    private JPanel panel3;
    private JButton button_no;
    private JButton button_yes;
    private JDialog fillAllFieldsDialog;
    private JLabel label2;
    private JButton button_back2;
    private JDialog passwordIncorrectDialog;
    private JLabel label3;
    private JButton button_back3;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}