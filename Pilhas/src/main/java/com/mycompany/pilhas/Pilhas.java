/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pilhas;

import java.util.Scanner;



/**
 *
 * @author Usuario
 */
public class Pilhas {

    public static void main(String[] args) {
      int topo = -1, valor;
      Scanner leitor = new Scanner(System.in);
        Pilha pilha1 = new Pilha();
       int a = 3;
       for(int num : pilha1.pilha ){
           System.out.println("Digite o valor que quer inserir");
           int temp = leitor.nextInt();
           pilha1.push(topo, num);
           
       }
        
        pilha1.Imprimir(topo);
        System.out.println("Tamanho da pilha: " +pilha1.tamanho());
        for (int num : pilha1.pilha){
            pilha1.Imprimir(num);1
                    
        }
        
        
    }
}
