package application.model;

import jakarta.persistence.Entity;

@Entity
@Table(name="livros")
public class Livro {
    @Id
    private int id;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    private String titulo;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

  
}
