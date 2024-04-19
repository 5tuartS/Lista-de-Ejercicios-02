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

class CrearCuenta extends JFrame {
    private JTextField usernameField; // Aquí es donde el usuario escribe su nombre
    private JPasswordField passwordField; // Y aquí es donde escribe su contraseña

    public CrearCuenta() {
        setTitle("PeruBank - Crear Cuenta"); // Ponemos un título a la ventana
        setSize(300, 200); // Tamaño de la ventana
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Se cierra solo esta ventana, no toda la aplicación
        setLocationRelativeTo(null); // Centrar en la pantalla
        setLayout(new GridLayout(4, 2)); // Organizamos los elementos en filas y columnas

        JLabel usernameLabel = new JLabel("Usuario:"); // Etiqueta para el nombre de usuario
        usernameField = new JTextField(20); // Espacio donde el usuario escribe su nombre

        JLabel passwordLabel = new JLabel("Contraseña:"); // Etiqueta para la contraseña
        passwordField = new JPasswordField(15); // Espacio donde el usuario escribe su contraseña

        JButton crearCuentaButton = new JButton("Crear Cuenta"); // Botón para crear la cuenta
        crearCuentaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearCuenta(); // Cuando el usuario hace clic, llamamos al método crearCuenta
            }
        });

        // Añadimos los componentes a la ventana
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel()); // Espacio vacío para mantener el diseño
        add(new JLabel()); // Otro espacio vacío para mantener el diseño
        add(new JLabel()); // Otro espacio vacío para mantener el diseño
        add(crearCuentaButton);

        setVisible(true); // Hacemos visible la ventana
    }

    // Método para manejar la creación de cuenta
    public void crearCuenta() {
        String username = usernameField.getText(); // Obtenemos el nombre de usuario que el usuario ha escrito
        String password = new String(passwordField.getPassword()); // Y también la contraseña

        // Aquí iría la lógica para crear la cuenta en realidad
        JOptionPane.showMessageDialog(this, "¡Oops! Esta función todavía no está implementada."); // Pero por ahora, mostramos un mensaje de que no está implementada
    }
}