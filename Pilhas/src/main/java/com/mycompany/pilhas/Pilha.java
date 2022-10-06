/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhas;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Pilha{
    int[] pilha = new int[10];
    int topolinha = -1; // indica onde está o topo da pilha
    
    //metodos
    void esvazie_pilha(){
    this.topolinha = -1;
    }
    int tamanho(){
        return(this.topolinha + 1);
    }
    void Imprimir(int topo){
        
        for(int i=topo ;i>-1;i--){
            
            System.out.println("O valo na pilha eh: "+this.pilha[i]);
        }
    }
    int push(int topo, int num){ // Inserindo Elemento
        this.topolinha = topo;
        this.topolinha ++;
        
        if(this.topolinha < 0){
            this.topolinha = 0;
        }
        
        if(this.topolinha > 9){
            JOptionPane.showMessageDialog(null,"Ta achando que aki e teu cu nao cabe mais arrombado");
            return(this.topolinha --);
        }else{
            this.pilha[this.topolinha] = num;
            System.out.println("Elemento Inserido");
            return(this.topolinha);
        }
    }
    int pop(int topo){
        this.topolinha = topo;
        this.topolinha --;
        
        if(this.topolinha < -1){
            JOptionPane.showMessageDialog(null,"Ja ta vazio essa porra ");
            return(this.topolinha++);
        }else{
            System.out.println("Valor retirado "+this.pilha[this.topolinha+1]);
            return(this.pilha[this.topolinha + 1]);
        }
        
    }
    int topo(int topo){
        this.topolinha = topo;
        if(this.topolinha == -1){
            System.out.println("TA vazio essa porra");
            return(-998);
        }else{
            return(this.pilha[this.topolinha]);
        }
        
    }
}
