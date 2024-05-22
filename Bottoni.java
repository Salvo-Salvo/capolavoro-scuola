package finestrasaluti;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Bottoni extends JPanel {
    private JButton buongiorno; // Bottone per il saluto "Buongiorno"
    private JButton buonasera; // Bottone per il saluto "Buonasera"

    private ModelNome nome; // Modello per il nome

    // Costruttore
    public Bottoni(ModelNome nome) {
        this.nome = nome; // Inizializza il modello per il nome
        setLayout(new FlowLayout(FlowLayout.CENTER)); // Utilizza un layout a flusso centrato

        buongiorno = new JButton("Buongiorno"); // Crea il bottone "Buongiorno"
        buonasera = new JButton("Buonasera"); // Crea il bottone "Buonasera"

        // Aggiunge i bottoni al pannello
        add(buongiorno);
        add(buonasera);

        // Aggiunge azioni ai bottoni
        buongiorno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.saluta("Buongiorno " + nome.getNome()); // Saluta con "Buongiorno" e il nome inserito
            }
        });

        buonasera.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame.saluta("Buonasera " + nome.getNome()); // Saluta con "Buonasera" e il nome inserito
            }
        });
    }
}