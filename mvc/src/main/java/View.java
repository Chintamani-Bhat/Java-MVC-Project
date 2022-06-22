/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class View {
    private JFrame frame;
    private JLabel nameLabel;
    private JLabel GenderLabel;
    private JLabel phnoLabel;
    private JLabel IntimeLabel;
    private JLabel OuttimeLabel;
    private JLabel addressLabel;
            
    private JTextField nameTextfield;
    private JTextField GenderTextfield;
    private JTextField phnoTextfield;
    private JTextField IntimeTextfield;
    private JTextField OuttimeTextfield;
    private JTextField addressTextfield;
    
    private JButton submit;

    /**
     *
     * @param title
     */
    public View(String title) {
        frame = new JFrame(title);
        frame.getContentPane().setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 250);
        frame.getContentPane().setBackground(Color.lightGray);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        // Create UI elements
        nameLabel = new JLabel("NAME :");
        GenderLabel = new JLabel("GENDER :");
        phnoLabel = new JLabel("PHONENO :");
        IntimeLabel = new JLabel("INTIME :");
        OuttimeLabel = new JLabel("OUTTIME :");
        addressLabel = new JLabel("ADDRESS :");
        
        nameTextfield = new JTextField();
        GenderTextfield = new JTextField();
        phnoTextfield = new JTextField();
        IntimeTextfield = new JTextField();
        OuttimeTextfield = new JTextField();
        addressTextfield = new JTextField();
        
        submit=new JButton("Submit");
        // Add UI element to frame
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nameLabel)
                        .addComponent(GenderLabel).addComponent(phnoLabel).addComponent(IntimeLabel).addComponent(OuttimeLabel).addComponent(addressLabel))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(nameTextfield).addComponent(GenderTextfield)
                        .addComponent(phnoTextfield).addComponent(IntimeTextfield).addComponent(OuttimeTextfield).addComponent(addressTextfield).addComponent(submit))
                );
        
        
        layout.setVerticalGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(nameLabel)
                        .addComponent(nameTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(GenderLabel)
                        .addComponent(GenderTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(phnoLabel)
                        .addComponent(phnoTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(IntimeLabel)
                        .addComponent(IntimeTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(OuttimeLabel)
                        .addComponent(OuttimeTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(addressLabel)
                        .addComponent(addressTextfield))
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(submit)));
        

        frame.getContentPane().setLayout(layout);
    }

    public JFrame getFrame() {
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }

    public JLabel getGenderLabel() {
        return GenderLabel;
    }

    public void setAgeLabel(JLabel GenderLabel) {
        this.GenderLabel = GenderLabel;
    }
    
    public JLabel getPhnoLabel() {
        return phnoLabel;
    }

    public void setPhnoLabel(JLabel phnoLabel) {
        this.phnoLabel = phnoLabel;
    }


    public JLabel getIntimeLabel() {
        return IntimeLabel;
    }

    public void setIntimeLabel(JLabel IntimeLabel) {
        this.IntimeLabel = IntimeLabel;
    }
    
    public JLabel getOuttimeLabel() {
        return OuttimeLabel;
    }

    public void setOuttimeLabel(JLabel OuttimeLabel) {
        this.OuttimeLabel = OuttimeLabel;
    }
  
    public JLabel getAddressLabel() {
        return addressLabel;
    }

    public void setAddressLabel(JLabel addressLabel) {
        this.addressLabel = addressLabel;
    }

    public JTextField getNameTextfield() {
        return nameTextfield;
    }

    public void setNameTextfield(JTextField nameTextfield) {
        this.nameTextfield = nameTextfield;
    }

    public JTextField getGenderTextfield() {
        return GenderTextfield;
    }

    public void setGenderTextfield(JTextField GenderTextfield) {
        this.GenderTextfield = GenderTextfield;
    }

    public JTextField getPhnoTextfield() {
        return phnoTextfield;
    }

    public void setPhnoTextfield(JTextField phnoTextfield) {
        this.phnoTextfield = phnoTextfield;
    }
    
    public JTextField getIntimeTextfield() {
        return IntimeTextfield;
    }

    public void setIntimeTextfield(JTextField IntimeTextfield) {
        this.IntimeTextfield = IntimeTextfield;
    }
    
    public JTextField getOuttimeTextfield() {
        return OuttimeTextfield;
    }

    public void setOuttimeTextfield(JTextField OuttimeTextfield) {
        this.OuttimeTextfield = OuttimeTextfield;
    }
    
    
    public JTextField getAddressTextfield() {
        return addressTextfield;
    }

    public void setAddressTextfield(JTextField addressTextfield) {
        this.addressTextfield = addressTextfield;
    }

    public JButton getSubmit() {
        return submit;
    }

    public void setSubmit(JButton submit) {
        this.submit = submit;
    }
    
    
}