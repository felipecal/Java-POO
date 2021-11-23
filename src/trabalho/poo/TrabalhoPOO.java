/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.poo;

import java.util.Scanner;

/**
 *
 * @author caldas
 */
public class TrabalhoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Scanner entradaString = new Scanner(System.in);
        int submenu = 0;
        int respost = 0;
        int menu;
        Metodos objLista;
        
        String tipo, cor, numero, tecido, estado;
        float preco;
        
        do {            
            exibirMenu();
            menu = entrada.nextInt();
            
            switch(menu){
                case 1:
                    System.out.println("Deseja cadastrar em qual das opções: "
                            + "\n1 - Lavanderia"
                            + "\n2 - Em Uso"
                            + "\n3 - GuardaRoupas");
                    respost = entrada.nextInt();
                    if (respost ==1){
                        int z = 0;
                        System.out.println("Tipo: ");
                        tipo = entradaString.nextLine();
                        System.out.println("Cor: ");
                        cor = entradaString.nextLine();
                        System.out.println("Numero:");
                        numero = entradaString.nextLine();
                        System.out.println("Tecido: ");
                        tecido = entradaString.nextLine();
                        System.out.println("Preço: ");
                        preco = entrada.nextFloat();
                        System.out.println("Estado: ");
                        estado = entradaString.nextLine();
                        objLista = new  Metodos(tipo, cor, numero, tecido, preco, estado);
                        Lista.adicionarLavanderia(objLista);
                        System.out.println(Lista.listarLavanderia());
                        System.out.println("\n Menu de respostas"
                            + "\n1 - Adicionar mais roupas a lavanderia"
                            + "\n0 - Voltar ao menu");
                        submenu = entrada.nextInt();
                        if (submenu==0){
                            exibirMenu();
                        }
                    if (respost ==2){}
                        System.out.println("Tipo: ");
                        tipo = entradaString.nextLine();
                        System.out.println("Cor: ");
                        cor = entradaString.nextLine();
                        System.out.println("Numero:");
                        numero = entradaString.nextLine();
                        System.out.println("Tecido: ");
                        tecido = entradaString.nextLine();
                        System.out.println("Preço: ");
                        preco = entrada.nextFloat();
                        System.out.println("Estado: ");
                        estado = entradaString.nextLine();
                        objLista = new  Metodos(tipo, cor, numero, tecido, preco, estado);
                        Lista.adicionarLavanderia(objLista);
                        System.out.println(Lista.listarEmUso());
                        System.out.println("\n Menu de respostas"
                            + "\n1 - Adicionar mais roupas a lavanderia"
                            + "\n0 - Voltar ao menu");
                        submenu = entrada.nextInt();
                        if (submenu==0){
                            exibirMenu();
                        }
                    if (respost ==3){}
                        System.out.println("Tipo: ");
                        tipo = entradaString.nextLine();
                        System.out.println("Cor: ");
                        cor = entradaString.nextLine();
                        System.out.println("Numero:");
                        numero = entradaString.nextLine();
                        System.out.println("Tecido: ");
                        tecido = entradaString.nextLine();
                        System.out.println("Preço: ");
                        preco = entrada.nextFloat();
                        System.out.println("Estado: ");
                        estado = entradaString.nextLine();
                        objLista = new  Metodos(tipo, cor, numero, tecido, preco, estado);
                        Lista.adicionarLavanderia(objLista);
                        System.out.println(Lista.listarLavanderia());
                        System.out.println("\n Menu de respostas"
                            + "\n1 - Adicionar mais roupas a lavanderia"
                            + "\n0 - Voltar ao menu");
                        submenu = entrada.nextInt();
                        if (submenu==0){
                            exibirMenu();
                        }
                    if (respost==0){
                        exibirMenu();
                        }
                    }
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Listagem de roupas na lavanderia");
                    System.out.println(Lista.listarLavanderia());
                    break;
                case 4:
                    System.out.println("Listagem de roupas na lavanderia");
                    System.out.println(Lista.listarEmUso());
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    System.out.println("Opção de menu inválida!");
            }
        } while (menu!=4);
    }
    
    static void exibirMenu(){
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Remover");
        System.out.println("3 - Listar lavanderia");
        System.out.println("4 - Listar em Uso");
        System.out.println("4 - Listar guarda-roupas");
        System.out.println("5 - Cor predominante");
    }
    
}
