/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package una.lab2.swing;
import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class Lab2 extends JFrame{
    String[] formats = { "Hombre", "Mujer", "Indefinido" };
    JComboBox formatBox = new JComboBox(formats);
    JTextField name = new JTextField(15);
    JTextField phone = new JTextField(8); 
    
    JTextArea comments = new JTextArea(4, 15); //para comentarios
    JButton ok = new JButton("ok");
    JButton clean = new JButton("clean");
    
    public Lab2(){
        super("Account Information");
        setSize(300, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel usernameLabel = new JLabel("Name: ");
        JLabel phoneLabel = new JLabel("Phone number: ");
        JLabel commentsLabel = new JLabel("Comments: ");
        JLabel genderLabel = new JLabel("Gender: ");
       
       
        //set the name to components
        usernameLabel.setName("lblName");
        phoneLabel.setName("lblPhone");
        genderLabel.setName("lblGender");
        commentsLabel.setName("lblResult");
        
        
        name.setName("username");
        phone.setName("phone number");
        comments.setName("comments");
        ok.setName("ok");
        clean.setName("clean");
       
        comments.setLineWrap(true); //para no seguir escribiendo caracteres
        comments.setWrapStyleWord(true);
        
       
        panel.add(usernameLabel);
        panel.add(name);
        panel.add(phoneLabel);
        panel.add(phone);
        panel.add(genderLabel);
        panel.add(formatBox);
        panel.setName("Form");
        panel.add(commentsLabel);
        panel.add(comments);
        panel.add(ok);
        panel.add(clean);
        add(panel);
        setVisible(true);
    }
    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.out.println(exc.getMessage());
        }
    }
    public static void main(String[] arguments) {
        Lab2.setLookAndFeel();
        Lab2 aux = new Lab2();
    }
}
