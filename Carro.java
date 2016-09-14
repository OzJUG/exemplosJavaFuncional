/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author isidro
 */
public class Carro {
    
    private String nome;
    private int    potencia;

    public Carro(String nome, int potencia) {
        this.nome = nome;
        this.potencia = potencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public String toString(){
        return nome + "("+potencia+")";
    }
    
}
