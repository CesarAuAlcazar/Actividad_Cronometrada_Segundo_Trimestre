package biblioteca;

/**
 * Clase que representa un Libro con sus atributos (título, autor y años de publicación)
 * y que serán usados porsteriormente por la clase Biblioteca
 * @see Biblioteca
 * @author César A. Alcázar Romero
 * @version 05-03-2025
 */

public class Libro {

    /**
     * Atributos de la clase Libro
     * String para el título del libro
     * String para el nombre del autor
     * y un Integer para el año de publicación
     */

    private String titulo;
    private String autor;
    private int anioPublicacion;

    /**
     * Constructor de la clase Libro
     * @param titulo el título del libro
     * @param autor el autor del libro
     * @param anioPublicacion el año de publicación del libro
     */

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Getter y setters de Autor
     * @return get obtiene el autor actual y set establece un nuevo autor
     */

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Getters y setters del año de publicación
     * @return get obtiene el año de publicación actual y set establece un nuevo año
     */

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
