package br.com.dio.desafio.dominio;


import java.time.LocalDate;

public class Curso {


  private String descrição;
  private String titulo;
  private int cargaHoraria;


  public Curso() {
  }

  public int getCargaHoraria() {
    return cargaHoraria;
  }

  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescrição() {
    return descrição;
  }

  public void setDescrição(String descrição) {
    this.descrição = descrição;
  }

  @Override
  public String toString() {
    return "Curso{" +
            "descrição='" + descrição + '\'' +
            ", titulo='" + titulo + '\'' +
            ", cargaHoraria=" + cargaHoraria +
            '}';
  }
}








