package finestrasaluti;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Panel extends JPanel {
    private JTextField textField; // Campo di testo per l'inserimento del nome
    private JButton button; // Pulsante per confermare l'inserimento

    private ModelNome nome; // Modello per il nome

    // Costruttore
    public Panel(ModelNome nome) {
        this.nome = nome; // Inizializza il modello per il nome
        setLayout(new FlowLayout()); // Utilizza un layout a flusso

        textField = new JTextField(20); // Crea il campo di testo con larghezza predefinita
        button = new JButton("Inserisci"); // Crea il pulsante "Inserisci"

        // Aggiunge i componenti al pannello
        add(textField);
        add(button);

        // Aggiunge un'azione al pulsante
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tNome = textField.getText(); // Ottiene il testo inserito nel campo di testo
                nome.setNome(tNome); // Imposta il nome nel modello
            }
        });
    }
}