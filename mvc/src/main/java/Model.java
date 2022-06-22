/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Model {
    private String name;
    private String Gender;
    private String Intime;
    private String Outtime;
    private String phno;
    private String address;

    public Model(String name, String Gender, String phno, String Intime, String Outtime, String address) {
        this.name = name;
        this.Gender = Gender;
        this.phno = phno;
        this.Intime = Intime;
        this.Outtime = Outtime;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getIntime() {
        return Intime;
    }

    public void setIntime(String Intime) {
        this.Intime = Intime;
    }
    
    public String getOuttime() {
        return Outtime;
    }

    public void setOuttime(String Outtime) {
        this.Outtime = Outtime;
    }

    public String getPhno() {
        return phno;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
