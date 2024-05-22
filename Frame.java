package finestrasaluti;

import javax.swing.*;
import java.awt.*;

// Estende JFrame per creare la finestra principale dell'applicazione
public class Frame extends JFrame {
    private Panel panel; // Pannello per l'inserimento del nome
    private Bottoni bottoni; // Pannello per i bottoni
    private static TextArea textArea; // Area di testo per visualizzare i saluti

    ModelNome nome; // Modello per memorizzare il nome

    // Costruttore
    public Frame() {
        super("Finestra saluti personalizzata"); // Imposta il titolo della finestra
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Chiude l'applicazione quando la finestra viene chiusa
        setSize(400, 300); // Imposta le dimensioni della finestra
        setLocationRelativeTo(null); // Centra la finestra nello schermo
        setLayout(new GridLayout(3, 1)); // Utilizza un layout a griglia con 3 righe e 1 colonna
        setResizable(true); // Permette il ridimensionamento della finestra

        nome = new ModelNome(); // Inizializza il modello per il nome

        panel = new Panel(nome); // Crea il pannello per l'inserimento del nome
        bottoni = new Bottoni(nome); // Crea il pannello per i bottoni
        textArea = new TextArea(); // Crea l'area di testo per i saluti

        // Aggiunge i componenti al frame
        add(panel);
        add(bottoni);
        add(textArea);

        setVisible(true); // Rende il frame visibile
    }

    // Metodo per visualizzare un saluto nell'area di testo
    public static void saluta(String saluto) {
        textArea.appendiTesto(saluto + "\n"); // Aggiunge il saluto all'area di testo
    }
}
