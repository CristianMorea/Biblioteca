package Modelo;

import java.util.Date;
public class Main {
    public static void main(String[] args) {
        // Crear objetos de prueba
        Libro libro1 = new Libro("la diosa", "Ana sarmiento", "terror", true);
        libro1.setDisponibilidad(true);

        Libro libro2 = new Libro("La marejada","laura", "terror 2", true);
        libro2.setDisponibilidad(false);

        Usuario usuario1 = new Usuario();
        usuario1.setNombre("Usuario 1");
        usuario1.setDireccion("Dirección 1");

        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Usuario 2");
        usuario2.setDireccion("Dirección 2");

        // Crear una biblioteca y agregar libros
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        // Realizar un préstamo
        biblioteca.realizarPréstamo(libro1, usuario1);

        // Obtener información del préstamo
        Prestamo prestamo = new Prestamo();
        prestamo.setFechaInicio(new Date());
        prestamo.setFechaFin(new Date());
        prestamo.setEstado("En curso");

        // Realizar una devolución
        biblioteca.realizarDevolución(libro1, usuario1);

        // Mostrar información
        System.out.println("Información del libro 1:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Disponibilidad: " + libro1.isDisponibilidad());

        System.out.println("\nInformación del usuario 1:");
        System.out.println("Nombre: " + usuario1.getNombre());
        System.out.println("Dirección: " + usuario1.getDireccion());

        System.out.println("\nInformación del préstamo:");
        System.out.println("Fecha de inicio: " + prestamo.getFechaInicio());
        System.out.println("Fecha de fin: " + prestamo.getFechaFin());
        System.out.println("Estado: " + prestamo.getEstado());
        
        System.out.println("INFORMACION LIBRO 2");
        System.out.println("TITULO "+libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Disponibilidad: " + libro2.isDisponibilidad());
        
        System.out.println("\nInformación del usuario 2:");
        System.out.println("Nombre: " + usuario2.getNombre());
        System.out.println("Dirección: " + usuario2.getDireccion());

        System.out.println("\nInformación del préstamo:");
        System.out.println("Fecha de inicio: " + prestamo.getFechaInicio());
        System.out.println("Fecha de fin: " + prestamo.getFechaFin());
        System.out.println("Estado: " + prestamo.getEstado());
        
    }
}