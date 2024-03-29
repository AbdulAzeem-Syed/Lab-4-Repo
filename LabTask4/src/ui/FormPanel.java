/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Patient;

/**
 *
 * @author Abdul
 */
public class FormPanel extends javax.swing.JPanel {

    /**
     * Creates new form FormPanel
     */
    private JPanel bottomPanel;
    private Patient patient = new Patient();
    public FormPanel(JPanel bottomPanel) {
        initComponents();
        imageNameLabel.setVisible(false);
        this.bottomPanel = bottomPanel;
    }
    
    public int tryParseInt(String value) 
    {
        try 
        {
            return Integer.parseInt(value);
        } 
        catch (NumberFormatException e) 
        {
            return -1;
        }
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
        mainTitle = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameText = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        ageText = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        emailText = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        messageScrollPane = new javax.swing.JScrollPane();
        messageTextArea = new javax.swing.JTextArea();
        uploadImage = new javax.swing.JButton();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        genderLabel = new javax.swing.JLabel();
        imageNameLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        typeLabel = new javax.swing.JLabel();
        typeComboBox = new javax.swing.JComboBox<>();

        mainTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        mainTitle.setText("Patient Registration");

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        ageLabel.setText("Age");

        emailLabel.setText("Email");

        messageLabel.setText("Message");

        messageTextArea.setColumns(20);
        messageTextArea.setRows(5);
        messageScrollPane.setViewportView(messageTextArea);

        uploadImage.setText("Upload image");
        uploadImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadImageActionPerformed(evt);
            }
        });

        genderRadioGroup.add(maleRadio);
        maleRadio.setText("Male");
        maleRadio.setActionCommand("MALE");

        genderRadioGroup.add(femaleRadio);
        femaleRadio.setText("Female");
        femaleRadio.setActionCommand("FEMALE");

        genderLabel.setText("Gender");

        imageNameLabel.setText("img");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        typeLabel.setText("Type");

        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Emergency" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
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
                    .addComponent(imageNameLabel)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maleRadio)
                        .addGap(18, 18, 18)
                        .addComponent(femaleRadio))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(mainTitle)
                        .addComponent(firstNameText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lastNameText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ageText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(emailText, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(messageScrollPane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(uploadImage)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                            .addComponent(submitButton))))
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(mainTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastNameLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel)
                    .addComponent(messageScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio)
                    .addComponent(genderLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitButton)
                    .addComponent(uploadImage))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imageNameLabel)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        typeComboBox.getAccessibleContext().setAccessibleDescription("");
    }// </editor-fold>//GEN-END:initComponents

    private void uploadImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadImageActionPerformed
        // TODO add your handling code here:
        JFileChooser file = new JFileChooser(); 
        if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                System.out.println("Button clicked, file name: " + file.getSelectedFile().getName());
                BufferedImage img = ImageIO.read(file.getSelectedFile());
                var edited_image = img.getScaledInstance(120, 160, Image.SCALE_SMOOTH);
                if (edited_image != null) {
                patient.setImage(new ImageIcon(edited_image));
                imageNameLabel.setText(file.getSelectedFile().getName());
                imageNameLabel.setVisible(true);
                //imageNameLabel.setIcon(icon);
                } else {
                throw new Exception();
                }
            } catch (Exception ex) {
                
            }
        }
    }//GEN-LAST:event_uploadImageActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        boolean hasError = false;
        StringBuilder errorFields = new StringBuilder();
        
        
        if(firstNameText.getText().isEmpty())
        {
            errorFields.append("First name is empty. \n");
            hasError = true;
        }
        if(lastNameText.getText().isEmpty())
        {
            errorFields.append("Last name is empty. \n");
            hasError = true;
        }
        if(tryParseInt(ageText.getText()) == -1)
        {
            errorFields.append("Age is invalid. \n");
            hasError = true;
        }
        if(emailText.getText().isEmpty())
        {
            errorFields.append("Email is empty. \n");
            hasError = true;
        }
        else if(!emailText.getText().contains("@"))
        {
            errorFields.append("Email is invalid. \n");
            hasError = true;
        }
        if(messageTextArea.getText().isEmpty())
        {
            errorFields.append("Message is empty. \n");
            hasError = true;
        }
        if(imageNameLabel.getText() == "img" || imageNameLabel.getText() == "")
        {
            errorFields.append("Image is missing. \n");
            hasError = true;
        }
        

        if(hasError)
        {
            String errorMessage = "Invalid input, below are the invalid fields:\n" + errorFields;
            JOptionPane.showMessageDialog(this, errorMessage, "Customer information", HEIGHT);
        }
        else
        {
            patient.setFirstName(firstNameText.getText());
            patient.setLastName(lastNameText.getText());
            patient.setEmail(emailText.getText());
            patient.setAge(tryParseInt(ageText.getText())); //tryParseInt is a function I created to check the version. tryParseInt is actually a functionality in c# which I have experience in.
            patient.setMessage(messageTextArea.getText());
            patient.setGender(genderRadioGroup.getSelection());
            patient.setType(typeComboBox.getSelectedItem().toString());
            
            ViewPanel newViewPanel = new ViewPanel(patient);
            bottomPanel.add(newViewPanel);
            CardLayout layout = (CardLayout) bottomPanel.getLayout();
            layout.next(bottomPanel);
            
            //String outputMessage = "Name: " + patient.getFirstName() + " " + patient.getLastName() + "\n" + "Age: " + patient.getAge() + "\n" + "Gender: " + genderRadioGroup.getSelection().getActionCommand() + "\n" + "Email: " + patient.getEmail() + "\n" + "Message: " + patient.getMessage() + "\n";
            //JOptionPane.showMessageDialog(this, outputMessage, "Customer information", HEIGHT);
        }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageText;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailText;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JLabel genderLabel;
    private javax.swing.ButtonGroup genderRadioGroup;
    private javax.swing.JLabel imageNameLabel;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameText;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JScrollPane messageScrollPane;
    private javax.swing.JTextArea messageTextArea;
    private javax.swing.JButton submitButton;
    private javax.swing.JComboBox<String> typeComboBox;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JButton uploadImage;
    // End of variables declaration//GEN-END:variables
}
