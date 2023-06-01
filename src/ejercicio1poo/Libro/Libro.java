/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1poo.Libro;

import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;
    
    public Libro() {
        // Constructor vacío
    }
    
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }
    
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ISBN del libro: ");
        this.isbn = scanner.nextLine();
        System.out.print("Ingrese el título del libro: ");
        this.titulo = scanner.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        this.autor = scanner.nextLine();
        System.out.print("Ingrese el número de páginas del libro: ");
        this.numPaginas = scanner.nextInt();
    }
    
    public void mostrarLibro() {
        System.out.println("ISBN: " + this.isbn);
        System.out.println("Título: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Número de páginas: " + this.numPaginas);
    }
}

