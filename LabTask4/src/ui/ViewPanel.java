/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.ButtonModel;
import model.Patient;

/**
 *
 * @author Abdul
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    public ViewPanel() {
        initComponents();
        setPatientData();
    }
    public ViewPanel(Patient patient) {
        initComponents();
        setPatientData(patient);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderRadioGroup = new javax.swing.ButtonGroup();
        emailLabel = new javax.swing.JLabel();
        messageLabel = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        mainTitle = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        firstNameText = new javax.swing.JLabel();
        lastNameText = new javax.swing.JLabel();
        ageText = new javax.swing.JLabel();
        emailText = new javax.swing.JLabel();
        messageText = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();

        emailLabel.setText("Email :");

        messageLabel.setText("Message :");

        imageLabel.setText("img");

        mainTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mainTitle.setText("Patient Registration");

        firstNameLabel.setText("First Name :");

        lastNameLabel.setText("Last Name :");

        ageLabel.setText("Age :");

        genderLabel.setText("Gender :");

        firstNameText.setText("firstName");

        lastNameText.setText("lastName");

        ageText.setText("age");

        emailText.setText("email");

        messageText.setText("message");

        typeLabel.setText("Type :");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Emergency" }));

        genderRadioGroup.add(maleRadio);
        maleRadio.setText("Male");
        maleRadio.setActionCommand("MALE");

        genderRadioGroup.add(femaleRadio);
        femaleRadio.setText("Female");
        femaleRadio.setActionCommand("FEMALE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(mainTitle)
                .addGap(249, 249, 249))
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imageLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ageLabel)
                            .addComponent(messageLabel)
                            .addComponent(firstNameLabel)
                            .addComponent(lastNameLabel)
                            .addComponent(emailLabel)
                            .addComponent(genderLabel)
                            .addComponent(typeLabel))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(maleRadio)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRadio)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lastNameText)
                                    .addComponent(ageText)
                                    .addComponent(emailText)
                                    .addComponent(messageText)
                                    .addComponent(firstNameText))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(mainTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageLabel)
                    .addComponent(messageText))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(imageLabel)
                .addContainerGap(240, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel ageText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel emailText;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JLabel firstNameText;
    private javax.swing.JLabel genderLabel;
    private javax.swing.ButtonGroup genderRadioGroup;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JLabel lastNameText;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel messageText;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel typeLabel;
    // End of variables declaration//GEN-END:variables

    private void setPatientData() {
        firstNameText.setText("");
        lastNameText.setText("");
        ageText.setText("");
        emailText.setText("");
        messageText.setText("");
        imageLabel.setText("");
    }
    
    private void setPatientData(Patient patient) {
        firstNameText.setText(patient.getFirstName());
        lastNameText.setText(patient.getLastName());
        genderRadioGroup.setSelected(getRadioSelection(patient.getGender()), true);
        maleRadio.setEnabled(false);
        femaleRadio.setEnabled(false);
        ageText.setText(String.valueOf(patient.getAge()));
        emailText.setText(patient.getEmail());
        messageText.setText(patient.getMessage());
        imageLabel.setText("");
        imageLabel.setIcon(patient.getImage());
        typeComboBox.setSelectedItem(patient.getType());
        typeComboBox.setEnabled(false);
    }

    private ButtonModel getRadioSelection(ButtonModel gender) {
        if(maleRadio.getActionCommand() == gender.getActionCommand())
            return maleRadio.getModel();
        else if(femaleRadio.getActionCommand() == gender.getActionCommand())
            return femaleRadio.getModel();
        else
            return null;
    }
}
