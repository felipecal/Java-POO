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
        int resposta = 0;
        int respost = 0;
        int menu;
        String k;
        Metodos objLista;
        
        String idt, tipo, cor, numero, tecido, estado;
        float preco;
        do {            
            exibirMenu();
            menu = entrada.nextInt();
            
            switch(menu){
                case 0: 
                    System.out.println("Fechando sistema!");
                    System.exit(0);
                case 1:
                    System.out.println("Deseja cadastrar em qual das opções: "
                            + "\n1 - Lavanderia"
                            + "\n2 - Em Uso"
                            + "\n3 - GuardaRoupas");
                    respost = entrada.nextInt();
                    if (respost <1 || respost>3){System.out.println("Erro!!");
                    }
                    else if (respost ==1){
                        System.out.println("Digite o identificador da roupa:");
                        idt = entradaString.nextLine();
                        System.out.println("Escreva alguns dos tipos de roupas:"
                                + "\nSocial"
                                + "\nEsporte"
                                + "\nEsporte Fino"
                                + "\nTrabalho ");
                        tipo = entradaString.nextLine();
                        System.out.println("Cor: ");
                        cor = entradaString.nextLine();
                        System.out.println("Numero do manequim: ");
                        numero = entradaString.nextLine();
                        System.out.println("Tecido com o qual é feito: ");
                        tecido = entradaString.nextLine();
                        System.out.println("Preço: ");
                        preco = entrada.nextFloat();
                        System.out.println("Estado da roupa:"
                                + "\nEscreva *Lavanderia* nessa opção");
                        estado = entradaString.nextLine();
                        objLista = new  Metodos(idt,tipo, cor, numero, tecido, preco, estado);
                        Lista.adicionarLavanderia(objLista);
                        System.out.println(Lista.listarLavanderia());
                    }
                    else if (respost ==2){
                        System.out.println("Digite o identificador da roupa:");
                        idt = entradaString.nextLine();
                        System.out.println("Escreva alguns dos tipos de roupas:"
                                + "\nSocial"
                                + "\nEsporte"
                                + "\nEsporte Fino"
                                + "\nTrabalho ");
                        tipo = entradaString.nextLine();
                        System.out.println("Cor: ");
                        cor = entradaString.nextLine();
                        System.out.println("Numero do manequim:");
                        numero = entradaString.nextLine();
                        System.out.println("Tecido com o qual é feito: ");
                        tecido = entradaString.nextLine();
                        System.out.println("Preço: ");
                        preco = entrada.nextFloat();
                        System.out.println("Estado da roupa:"
                                + "\nEscreva *Em uso* nessa opção");
                        estado = entradaString.nextLine();
                        objLista = new  Metodos(idt,tipo, cor, numero, tecido, preco, estado);
                        Lista.adicionarEmUso(objLista);
                        System.out.println(Lista.listarEmUso());
                    }
                    else if (respost ==3){
                        System.out.println("Digite o identificador da roupa:");
                        idt = entradaString.nextLine();
                        System.out.println("Escreva alguns dos tipos de roupas:"
                                + "\nSocial"
                                + "\nEsporte"
                                + "\nEsporte Fino"
                                + "\nTrabalho ");
                        tipo = entradaString.nextLine();
                        System.out.println("Cor: ");
                        cor = entradaString.nextLine();
                        System.out.println("Numero do manequim:");
                        numero = entradaString.nextLine();
                        System.out.println("Tecido com o qual é feito: ");
                        tecido = entradaString.nextLine();
                        System.out.println("Preço: ");
                        preco = entrada.nextFloat();
                        System.out.println("Estado da roupa:"
                                + "\nEscreva *Guarda-roupas* nessa opção");
                        estado = entradaString.nextLine();
                        objLista = new  Metodos(idt,tipo, cor, numero, tecido, preco, estado);
                        Lista.adicionarGuardaRoupas(objLista);
                        System.out.println(Lista.listarGuardaRoupas());
                    }
                    break;
                case 2:
                    System.out.println("Deseja excluir de qual das opções: "
                            + "\n1 - Lavanderia"
                            + "\n2 - Em Uso"
                            + "\n3 - GuardaRoupas");
                    respost = entrada.nextInt();
                    if (respost <1 || respost>3){System.out.println("Erro!!");
                    }
                    else if (respost ==1){
                        if ( ! (Lista.getLavanderia().isEmpty())){
                            System.out.println(Lista.listarLavanderia());
                            System.out.println("\n Digite o identificador da roupa que deseja exlcuir\n");
                            idt = entradaString.nextLine();
                            if (Lista.removerLavanderia(idt)){
                                System.out.println("Roupa removida com sucesso!\n");
                           }else{System.out.println("Roupa não encontrada!\n");}
                        }else{
                            System.out.println("\nNão existem roupas na lavanderia.\n");}
                    }
                    else if (respost ==2){
                        if ( ! (Lista.getEmUso().isEmpty())){
                            System.out.println(Lista.listarEmUso());
                            System.out.println("\n Digite o identificador da roupa que deseja exlcuir\n");
                            idt = entradaString.nextLine();
                            if (Lista.removerEmUso(idt)){
                                System.out.println("Roupa removida com sucesso!\n");
                           }else{System.out.println("Roupa não encontrada!\n");}
                        }else{
                            System.out.println("\nNão existem roupas em uso.\n");}
                    }
                    else if (respost ==3){
                        if ( ! (Lista.getGuardaRoupas().isEmpty())){
                            System.out.println(Lista.listarGuardaRoupas());
                            System.out.println("\n Digite o identificador da roupa que deseja exlcuir\n");
                            idt = entradaString.nextLine();
                            if (Lista.removerGuardaRoupas(idt)){
                                System.out.println("Roupa removida com sucesso!\n");
                           }else{System.out.println("Roupa não encontrada!\n");}
                        }else{
                            System.out.println("\nNão existem roupas no guarda-roupas.\n");}
                    }
                    break;
                case 3:
                    System.out.println("Listagem de roupas na lavanderia");
                    System.out.println(Lista.listarLavanderia());
                    break;
                case 4:
                    System.out.println("Listagem de roupas em uso");
                    System.out.println(Lista.listarEmUso());
                    break;
                case 5:
                    System.out.println("Listagem de roupas no guarda roupas");
                    System.out.println(Lista.listarGuardaRoupas());
                    break;
                case 6:
                    break;
                default:
                    System.out.println("\nOpção de menu inválida!\n");
            }
        } 
        while (menu!=0);
    }
    
    static void exibirMenu(){
        System.out.println("0 - Fechar sistema");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Remover");
        System.out.println("3 - Listar lavanderia");
        System.out.println("4 - Listar em Uso");
        System.out.println("5 - Listar guarda-roupas");
        System.out.println("6 - Cor predominante");
        
    }
    
}
