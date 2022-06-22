/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;


public class Controller {
    private Model model;
    private View view;
    static Connection con = null;
    static PreparedStatement patmt = null;
    
    public Controller(Model m, View v){
        model = m;
        view = v;
        
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","");
        }
        catch(SQLException e2){
            JOptionPane.showMessageDialog(null, e2);
        }
        initView();
    }
    
    public void initView(){
        view.getNameTextfield().setText(model.getName());
        view.getGenderTextfield().setText(model.getGender());
        view.getPhnoTextfield().setText(model.getPhno());
        view.getIntimeTextfield().setText(model.getIntime());
        view.getOuttimeTextfield().setText(model.getOuttime());
        view.getAddressTextfield().setText(model.getAddress());
    }
    
    public void initController(){
        view.getSubmit().addActionListener(e -> submit());
    }
    
    private void submit(){
        model.setName(view.getNameTextfield().getText());
        model.setGender(view.getGenderTextfield().getText());
        model.setPhno(view.getPhnoTextfield().getText());
        model.setIntime(view.getIntimeTextfield().getText());
        model.setOuttime(view.getOuttimeTextfield().getText());
        model.setAddress(view.getAddressTextfield().getText());
        
        try {
            String querys = "insert into mytable(name, Gender, Phno, Intime, Outtime, Address)"+ "values(?,?,?,?,?,?)";
            patmt=con.prepareStatement(querys);
            
            
            patmt.setString(1, model.getName());
            patmt.setString(2, model.getGender());
            patmt.setString(3, model.getPhno());
            patmt.setString(4, model.getIntime());
            patmt.setString(5, model.getOuttime());
            patmt.setString(6, model.getAddress());
            
            patmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Entry Created in DataBase");
            
            
        } catch (Exception ex) {
            
             JOptionPane.showMessageDialog(null, ex);
        }
    }
    
}
