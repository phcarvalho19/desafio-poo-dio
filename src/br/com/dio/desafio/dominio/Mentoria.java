package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria {

    private String descrição;
    private String titulo;
    private  int cargaHoraria;

    LocalDate data;

    public Mentoria() {
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "descrição='" + descrição + '\'' +
                ", titulo='" + titulo + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", data=" + data +
                '}';
    }
}
