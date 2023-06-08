package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	 private List<Libro> libros;

	    public Biblioteca() {
	        libros = new ArrayList<>();
	    }

	    public void agregarLibro(Libro libro) {
	        libros.add(libro);
	    }

	    public Libro buscarLibroPorTítulo(String título) {
	        for (Libro libro : libros) {
	            if (libro.getTitulo().equals(título)) {
	                return libro;
	            }
	        }
	        return null;
	    }

	    public List<Libro> buscarLibroPorAutor(String autor) {
	        List<Libro> librosPorAutor = new ArrayList<>();
	        for (Libro libro : libros) {
	            if (libro.getAutor().equals(autor)) {
	                librosPorAutor.add(libro);
	            }
	        }
	        return librosPorAutor;
	    }

	    public void realizarPréstamo(Libro libro, Usuario usuario) {
	        if (libro.isDisponibilidad()) {
	            libro.setDisponibilidad(false);
	            usuario.agregarLibroPrestado(libro);
	        } else {
	            System.out.println("El libro no está disponible para préstamo.");
	        }
	    }

	    public void realizarDevolución(Libro libro, Usuario usuario) {
	        libro.setDisponibilidad(true);
	        usuario.agregarLibroPrestado(libro);
	    }
}
