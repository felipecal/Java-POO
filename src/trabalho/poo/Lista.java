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
import java.util.ArrayList;

/**
 *
 * @author caldas
 */
public class Lista {
    public static ArrayList<Metodos> Lavanderia = new ArrayList<>();
    public static ArrayList<Metodos> Em_Uso = new ArrayList<>();
    public static ArrayList<Metodos> Guarda_Roupas = new ArrayList<>();

    public static ArrayList<Metodos> getVestimenta() {
        return Lavanderia;
    }

    public static ArrayList<Metodos> getEmUso() {
        return Em_Uso;
    }

    public static ArrayList<Metodos> getGuardaRoupas() {
        return Guarda_Roupas;
    }
    
    static public void adicionarLavanderia (Metodos l){
        Lavanderia.add(l);
    }
    static public void adicionarEmUso (Metodos l){
        Em_Uso.add(l);
    }
    static public void adicionarGuardaRoupas (Metodos l){
        Guarda_Roupas.add(l);
    }
    
    static public String listarLavanderia(){
        String saida = "";
        int i = 1;
        for (Metodos l : Lavanderia){
            saida += "\nLavanderia: \n" + (i++);
            saida += l.imprimir() + "\n";
        }
        return saida;
    }
    static public String listarEmUso(){
        String saida = "";
        int i = 1;
        for (Metodos l : Em_Uso){
            saida += "\nEm uso: " + (i++);
            saida += l.imprimir() + "\n";
        }
        return saida;
    }
    static public String listarGuardaRoupas(){
        String saida = "";
        int i = 1;
        for (Metodos l : Guarda_Roupas){
            saida += "\nGuarda-Roupas: " + (i++);
            saida += l.imprimir() + "\n";
        }
        return saida;
    }
    
    static public int pesquisarLavanderia (String tipo){
        int qtd = 0;
        
        for(Metodos l : Lavanderia){
            if (l.getTipo().equalsIgnoreCase(tipo)){
                qtd++;
            }
        }
        return qtd;
    }
    static public int pesquisarEmUso (String tipo){
        int qtd = 0;
        
        for(Metodos l : Em_Uso){
            if (l.getTipo().equalsIgnoreCase(tipo)){
                qtd++;
            }
        }
        return qtd;
    }
    static public int pesquisarGuardaRoupas (String tipo){
        int qtd = 0;
        
        for(Metodos l : Guarda_Roupas){
            if (l.getTipo().equalsIgnoreCase(tipo)){
                qtd++;
            }
        }
        return qtd;
    }
    
    static public boolean removerLavanderia (String tipo){
        for (Metodos l : Lavanderia){
            if(l.getTipo().equalsIgnoreCase(tipo)){
                Lavanderia.remove(l);
                return true;
            }
        }
        return false;
    }
    static public boolean removerEmUso (String tipo){
        for (Metodos l : Em_Uso){
            if(l.getTipo().equalsIgnoreCase(tipo)){
                Em_Uso.remove(l);
                return true;
            }
        }
        return false;
    }
    static public boolean removerGuardaRoupas (String tipo){
        for (Metodos l : Guarda_Roupas){
            if(l.getTipo().equalsIgnoreCase(tipo)){
                Guarda_Roupas.remove(l);
                return true;
            }
        }
        return false;
    }
    
    static double calcularTotalLista(){
        double total = 0;
        for (Metodos l : Lavanderia){
            total += l.getPreco();
        }
        return total;
    }
}

