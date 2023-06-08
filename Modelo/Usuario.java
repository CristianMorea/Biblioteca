package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario 
{
 private String nombre;
 private String direccion;
 private List<Libro> librosPrestados;

 public Usuario(String nombre, String direccion, List<Libro> librosPrestados) {
	this.nombre = nombre;
	this.direccion = direccion;
	this.librosPrestados = librosPrestados;
}
 public Usuario() {
	    librosPrestados = new ArrayList<>();
	}
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public List<Libro> getLibrosPrestados() {
	return librosPrestados;
}

public void setLibrosPrestados(List<Libro> librosPrestados) {
	this.librosPrestados = librosPrestados;
}

//METODOS DE LA CLASE USUARIO
public List<Libro> obtenerLibrosPrestados() {
    return librosPrestados;
}

public void agregarLibroPrestado(Libro libro) {
    librosPrestados.add(libro);
}

public void eliminarLibroPrestado(Libro libro) {
    librosPrestados.remove(libro);
}



}
