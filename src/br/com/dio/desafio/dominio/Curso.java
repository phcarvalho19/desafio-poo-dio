package br.com.dio.desafio.dominio;

import java.time.LocalDate;

// A classe Curso herda de Conteudo, então deve estar no mesmo pacote.
// A classe LocalDate foi importada, mas não está sendo usada no código
// que você me enviou, então a removi para deixar o código mais limpo.

public class Curso extends Conteudo {

  private int cargaHoraria;

  // Construtor que recebe a carga horaria
  public Curso(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  // Construtor padrão (sem parâmetros)
  public Curso() {
  }

  @Override
  public double calcularXp() {
    return XP_PADRÃO * cargaHoraria;
  }

  // Método Getter para a carga horária
  public int getCargaHoraria() {
    return cargaHoraria;
  }

  // Método Setter para a carga horária
  public void setCargaHoraria(int cargaHoraria) {
    this.cargaHoraria = cargaHoraria;
  }

  @Override
  public String toString() {
    return "Curso{" +
            "descrição='" + getDescrição() + '\'' +
            ", titulo='" + getTitulo() + '\'' +
            ", cargaHoraria=" + cargaHoraria +
            '}';
  }
}



