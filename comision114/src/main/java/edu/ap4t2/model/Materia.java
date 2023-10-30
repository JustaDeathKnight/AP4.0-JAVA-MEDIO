package edu.ap4t2.model;

import java.util.ArrayList;

public class Materia {

  private static Long idGlobal = 0L;

  private Long id;

  private String nombre;

  // Lista de correlativas
  private ArrayList<Materia> correlativas;

  // Constructor vacio
  public Materia(String nombre) {
    this.nombre = nombre;
  }

  // Setters y Getters
  public static Long getIdGlobal() {
    return idGlobal;
  }

  public static void setIdGlobal(Long idGlobal) {
    Materia.idGlobal = idGlobal;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  // Metodos
  public void incrementIdGlobal() {
    idGlobal++;
  }

  public void agregarCorrelativa(Materia materia) {
    if (correlativas == null) {
      correlativas = new ArrayList<Materia>();
    }
    correlativas.add(materia);
  }

  public void mostrarCorrelativas() {
    if (correlativas != null) {
      for (Materia materia : correlativas) {
        System.out.println(materia.getNombre());
      }
    }
  }

  
}
