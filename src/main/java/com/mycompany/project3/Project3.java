/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.project3;
import javax.swing.JOptionPane;
public class Project3 {

    public static void main(String[] args) {
       String name = JOptionPane.showInputDialog("please enter your name");
       JOptionPane.showMessageDialog(null, "Hi "+name);
       
       int age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
       JOptionPane.showMessageDialog(null, "Hi "+age);
    }
}
