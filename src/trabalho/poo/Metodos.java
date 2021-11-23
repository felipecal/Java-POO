/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo;
/**
 *
 * @author caldas
 */
public class Metodos {
    private String idt;
    private String tipo;
    private String cor;
    private String numero;
    private String tecido;
    private Float preco;
    private String estado;
    

    public Metodos(String idt, String tipo, String cor, String numero, String tecido, Float preco, String estado) {
        this.idt = idt;
        this.tipo = tipo;
        this.cor = cor;
        this.numero = numero;
        this.tecido = tecido;
        this.preco = preco;
        this.estado = estado;
    }

    public String getIdt() {
        return idt;
    }

    public void setIdt(String idt) {
        this.idt = idt;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTecido() {
        return tecido;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String imprimir(){
        return  "\nIdentificador:" + idt + "\nTipo: " + tipo +"\nCor: " + cor + "\nNumero: " + numero + "\nTecido: " + tecido + "\nPreço: " + preco + "\nEstado: " + estado;
    }
}
