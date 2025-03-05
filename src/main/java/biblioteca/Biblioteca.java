package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 *  Clase que contiene libros y que permite
 *  agregar, eliminar y consultar libros por título o autor
 * @version 05-03-2025
 * @author César A. Alcázar Romero
 * @see Libro
 */


public class Biblioteca {

    /**
     * Lista de libros que hay en la biblioteca
     */

    private final List<Libro> libros;

    /**
     * Constructor por defecto
     */

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    /**
     * Constructor con parámetros para inicializar una biblioteca con libros que ya existen
     * @param libros Lista de libros para inicializar la biblioteca
     */

    //  Test: NO HAY QUE TESTEAR ESTE METODO
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    /**
     * Devuelve todos los libros que están en la biblioteca
     * @return la Lista de libros de la biblioteca
     */

    public List<Libro> getLibros() {
        return libros;
    }

    /**
     * Devuelve el libro que se busca en la Biblioteca por su título
     * @param titulo
     * @return el libro encontrado o un null si no existe en la biblioteca
     */

    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * @deprecated Este metodo ha quedado obsoleto
     * Se recomienda usar {@link #encuentraLibrosPorAutor(String)} en su lugar
     * @param autor Nombre del autor para buscar todos sus libros
     * @return el libro buscado por el nombre del autor
     */

    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    /**
     * Busca todos los libros de un autor existentes en la biblioteca
     * @since V2.0
     * Sustituye a #encuentaLibroPorAutor(String autor)}
     * @param autor El nombre de un autor determinado cuyos libros se quieren buscar
     * @return el listado de los libros escritos por un autor o una lista vacia sin no
     * se encuetran libros
     */

    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
