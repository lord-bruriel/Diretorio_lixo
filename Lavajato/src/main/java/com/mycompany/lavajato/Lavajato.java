/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lavajato;

/**
 *
 * @author bruno gabriel
 */
public class Lavajato {

    public static void main(String[] args) {
        Listaligada lista = new Listaligada();
        Elemento lol = new Elemento();
        
        lista.adicionar("Fiat", "Uno", 200);
        lista.adicionar("Chevrolet", "Onix", 333);
        System.out.println("Tamanho: "+lista.getTamanho());
        System.out.println("Primeiro: "+lista.getPrimeiro());
        System.out.println("Ultimo: "+lista.getUltimo());
        System.out.println("Busca 200"+lista.busca(200));
    }
}
