/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implantacaoreinaldo;

import java.util.Date;

/**
 *
 * @author SESI_SENAI
 */
public class Games {

    String Nome;
    String Genero;
    Date Data;
    String Publicadora;
    Float avaliacao;
    

    public Games() {

    }

    public Games(String nome, String Genero, Date Data, String Publicadora, float Avaliacao) {
        this.Nome = Nome;
        this.Genero = Genero;
        this.Data = Data;
        this.Publicadora = Publicadora;
        this.avaliacao = Avaliacao;

    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public void setPublicadora(String Publicadora) {
        this.Publicadora = Publicadora;
    }

    public void setAvaliacao(Float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getNome() {
        return Nome;
    }

    public String getGenero() {
        return Genero;
    }

    public Date getData() {
        return Data;
    }

    public String getPublicadora() {
        return Publicadora;
    }

    public Float getAvaliacao() {
        return avaliacao;
    }
}
