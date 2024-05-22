package finestrasaluti;

import javax.swing.*;
import java.awt.*;

class TextArea extends JPanel {
    private JTextArea textArea; // Area di testo

    // Costruttore
    public TextArea() {
        setLayout(new BorderLayout()); // Utilizza un layout di bordo

        textArea = new JTextArea(); // Crea l'area di testo
        add(new JScrollPane(textArea), BorderLayout.CENTER); // Aggiunge l'area di testo all'interno di uno scroll pane
    }

    // Metodo per aggiungere testo all'area di testo
    public void appendiTesto(String testo) {
        textArea.append(testo); // Aggiunge il testo all'area di testo
    }
}