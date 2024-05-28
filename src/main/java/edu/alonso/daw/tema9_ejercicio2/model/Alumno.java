package edu.alonso.daw.tema9_ejercicio2.model;

import java.time.LocalDate;

import lombok.Data;


@Data
public class Alumno {
	
	private int codigoAlumno;
	private String nombre;
	private String apellidos;
	private String telefono;
	private LocalDate fechaNacimiento;
	

}
