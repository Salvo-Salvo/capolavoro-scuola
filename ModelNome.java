package finestrasaluti;

public class ModelNome {
    String nome; // Variabile per memorizzare il nome

    // Costruttore
    public ModelNome() {
        this.nome = null; // Inizializza il nome a null
    }

    // Metodo per ottenere il nome
    public String getNome() {
        return nome; // Restituisce il nome
    }

    // Metodo per impostare il nome
    public void setNome(String nome) {
        this.nome = nome; // Imposta il nome
    }
}