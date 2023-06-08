package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro 
{
 private String titulo;
 private String autor;
 private String categoria;
 private boolean disponibilidad;


 
public Libro(String titulo, String autor, String categoria, boolean disponibilidad) {
	this.titulo = titulo;
	this.autor = autor;
	this.categoria = categoria;
	this.disponibilidad = disponibilidad;
	
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public String getCategoria() {
	return categoria;
}
public void setCategoria(String categoria) {
	this.categoria = categoria;
}
public boolean isDisponibilidad() {
	return disponibilidad;
}
public void setDisponibilidad(boolean disponibilidad) {
	this.disponibilidad = disponibilidad;
}

 
}

