/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lavajato;

/**
 *
 * @author bruno gabriel
 */
public class Listaligada {
    private Elemento primeiro;
    private Elemento ultimo;
    private int tamanho;
    
   
    public Listaligada(){
        this.tamanho = 0;
    }

    public Elemento getPrimeiro() {
        return primeiro;
    }

    public int getTamanho() {
        return tamanho;
    }

    public Elemento getUltimo() {
        return ultimo;
    }

    public void setPrimeiro(Elemento primeiro) {
        this.primeiro = primeiro;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void setUltimo(Elemento ultimo) {
        this.ultimo = ultimo;
    }
    public void adicionar(String marca, String nome, Integer num){
        Elemento novoCarro = new Elemento(marca, nome, num);
        if(this.primeiro == null && this.ultimo == null){
            this.primeiro = novoCarro;
            this.ultimo = novoCarro;
        }else{
            this.ultimo.setProximo(novoCarro);
            this.ultimo = novoCarro;
        }
        this.tamanho ++;
    }
    public Elemento busca(int codigo){
        Elemento atual = this.primeiro;
        for(int i = 0; i < this.tamanho; i++){
            if(codigo == atual.getNum()){
                return atual;
            }else{
                 atual = atual.getProximo();
                return null;
            }
             
        }
        return null;
    }
}
