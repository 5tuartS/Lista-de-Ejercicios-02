/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ameli
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AutenticacionPeruBank extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JCheckBox rememberPasswordCheckbox;

    public AutenticacionPeruBank() {
        setTitle("PeruBank - Autenticación");
        setSize(550, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en la pantalla
        setLayout(new GridLayout(5, 2));

        JLabel titleLabel = new JLabel("Inicio de Sesión :)", SwingConstants.CENTER);
        add(titleLabel); // Agregar el título a la ventana

        JLabel messageLabel = new JLabel("¿Qué tal? Iniciemos tu sesión", SwingConstants.CENTER);
        add(messageLabel); // Agregar el mensaje

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(15);

        rememberPasswordCheckbox = new JCheckBox("Recordar contraseña");

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login();
            }
        });

        JButton signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new CrearCuenta().setVisible(true);
            }
        });

        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(rememberPasswordCheckbox);
        add(new JLabel()); // Espacio vacío para mantener el diseño
        add(loginButton);
        add(signUpButton);

        setVisible(true);
    }

    public void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        // Simulación de autenticación (aquí iría la lógica real de autenticación)
        if (username.equals("usuario") && password.equals("contraseña")) {
            JOptionPane.showMessageDialog(this, "Cliente autenticado.");
            if (rememberPasswordCheckbox.isSelected()) {
                JOptionPane.showMessageDialog(this, "Contraseña almacenada en memoria.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas. Por favor, inténtelo de nuevo.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AutenticacionPeruBank();
            }
        });
    }
}
