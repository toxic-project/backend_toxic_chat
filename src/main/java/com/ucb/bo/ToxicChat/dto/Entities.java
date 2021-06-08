package com.ucb.bo.ToxicChat.dto;

public class Entities {
    private Double puntaje;
    private String tipo;
    private String texto;

    public Entities() {
    }

    public Entities(Double puntaje, String tipo, String texto) {
        this.puntaje = puntaje;
        this.tipo = tipo;
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Entities{" +
                "score=" + puntaje +
                ", type='" + tipo + '\'' +
                ", text='" + texto + '\'' +
                '}';
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
