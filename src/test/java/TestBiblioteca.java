
import biblioteca.Biblioteca;
import biblioteca.Libro;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestBiblioteca {

    Libro libro;
    Biblioteca biblioteca = new Biblioteca();

    @BeforeEach
    void setUp() {
        libro = new Libro("El capital", "Karl Marx", 1867);
    }

    @Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
        assertTrue(biblioteca.getLibros().contains(this.libro)); // Verifica que el libro esté en la lista
    }

    @Test
    void eliminarLibro() {
        biblioteca.agregarLibro(this.libro); //Agrega un libro
        assertTrue(biblioteca.eliminarLibro(this.libro)); //Verifica la correcta eliminación
        assertFalse(biblioteca.getLibros().contains(this.libro)); //Comprueba que ya no existe en la lista
    }

    @Test
    void encuentraLibroPorTitulo() {
        biblioteca.agregarLibro(this.libro); // Agregamos un libro
        Libro libroEncontrado = biblioteca.encuentraLibroPorTitulo("Ruslan y Ludmila"); // Buscamos un libro concreto
        assertNotNull(libroEncontrado); // Verificamos que se ha encontrado el libro
        assertEquals(this.libro.getTitulo(), libroEncontrado); //Nos aseguramos que es el libro que buscamos

        Libro libroNoEncontrado = biblioteca.encuentraLibroPorTitulo("Libro Inexistente");
        assertNull(libroNoEncontrado); // Verifica que el libro no se ha encontrado
    }


    @Test
    void encuentraLibrosPorAutor() {
        biblioteca.agregarLibro(this.libro);
        List<Libro> libro1 = biblioteca.encuentraLibrosPorAutor("Donald Knuth"); // Buscamos un autor
        assertNotNull(libro1); // Verificamos que la lista no sea nula
        assertEquals(1, libro1.size()); // Verificamos que haya un libro en la lista
        assertTrue(libro1.contains(this.libro)); // Verificamos que el libro está en la lista
    }
}