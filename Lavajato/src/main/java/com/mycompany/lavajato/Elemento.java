/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lavajato;

/**
 *
 * @author bruno gabriel
 */
public class Elemento {
    private String marca;
    private String nome;
    private int num;
    private Elemento proximo;

    public Elemento (String marca, String nome, Integer num){
        this.marca = marca;
        this.nome = nome;
        this.num = num;
    }

    Elemento() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getMarca() {
        return marca;
    }

    public String getNome() {
        return nome;
    }

    public int getNum() {
        return num;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    @Override
    public String toString() {
        return "Marca= "+marca+"\nNome= "+nome+"\nCodigo = "+ num;
    }
   
   
    
    
}
