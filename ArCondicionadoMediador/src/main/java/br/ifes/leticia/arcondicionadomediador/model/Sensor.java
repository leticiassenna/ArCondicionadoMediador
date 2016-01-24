/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.arcondicionadomediador.model;

/**
 *
 * @author Leticia
 */
public class Sensor {
    private int currentNumPessoas = 0;
    private final int codSensor;
    private final ArCondicionadoMediador mediador;
    private boolean ligado;
    
    public Sensor(ArCondicionadoMediador arMediador, int numPessoas, int codigo){
        this.mediador = arMediador;
        this.ligado = false;
        this.currentNumPessoas = numPessoas;
        this.codSensor = codigo;
        
        mediador.registrarSensor(this);
    }
    
    public int getCurrentNumPessoas(){
        return currentNumPessoas;
    }
    
    public int getCodSensor(){
        return codSensor;
    }
    
    public void ligar(){
        this.ligado = true;
        mediador.ligarArCondicionado();
        System.out.println("Ar Condicionado ligado!! ");
    }
    
    public void desligar(){
        this.ligado = false;
        mediador.desligarArCondicionado();
        System.out.println("Ar Condicionado ligado!! ");
    }
    
    public boolean estaLigado(){
        return this.ligado;
    }
}
