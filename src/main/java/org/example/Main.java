package org.example;

import biblioteca.Biblioteca;
import biblioteca.Libro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca();

        Libro libro1 = new Libro("El capital", "Karrl Marx", 1867);
        biblio.agregarLibro(libro1);
        System.out.println(libro1);

        Libro libro2 = new Libro("Ruslan y Ludmila", " Alexander Pushkin", 1820);
        biblio.agregarLibro(libro2);
        System.out.println(libro2);

        Libro libro3 = new Libro("Cuento de la princesa muerta y de los siete caballeros", "Alexander Pushkin", 1833);
        System.out.println(biblio.agregarLibro(libro3));
        System.out.println(libro3);

        System.out.println(biblio.encuentaLibroPorAutor("Alexander Pushkin"));
        System.out.println(biblio.encuentraLibrosPorAutor("Alexander Pushkin"));

        System.out.println(biblio.getLibros());
        System.out.println(biblio.eliminarLibro(libro1));
        System.out.println(biblio.getLibros());

        System.out.println(biblio.encuentraLibroPorTitulo("Ruslan y Ludmila"));

        // Copia de la biblioteca
        Biblioteca biblio2 = new Biblioteca(biblio.getLibros());
        System.out.println(biblio2.getLibros());
    }
}