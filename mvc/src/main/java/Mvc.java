/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
/**
 *
 * @author Chintamani Bhat
 * SRN : PES2UG19CS099
 */
public class Mvc {
    public static void main(String[] args) {
    Model m = new Model(" ", " "," "," "," "," ");
    View v = new View("Society Tracker");
    Controller c = new Controller(m, v);
    c.initController();
 }
}
