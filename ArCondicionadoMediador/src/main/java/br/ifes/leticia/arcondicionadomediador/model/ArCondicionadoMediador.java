/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.arcondicionadomediador.model;

import java.util.HashMap;

/**
 *
 * @author Leticia
 */
public class ArCondicionadoMediador {
    private Sensor sensor;
    private int temperaturaAtual;
    
    int mediaPessoas;
    HashMap<Integer, Sensor> listaSensores = new  HashMap<>();
    
    public ArCondicionadoMediador(){
        this.temperaturaAtual = 25;
    }
    
    public void registrarSensor(Sensor sensor){
        listaSensores.put(sensor.getCodSensor(), sensor);
    }
    
    public void ligarArCondicionado(){
        sensor.ligar();
    }
    
    public void desligarArCondicionado(){
        sensor.desligar();
    }
    
    public void habilitarSensor(){
        System.out.println("Ar Condicionado conectado com o Sensor!! ");
    }
    
    public void desabilitarSensor(){
        System.out.println("Ar Condicionado desconectado com o Sensor!! ");
    }
    
    public void controlandoTemperatura(){
              
        if(listaSensores.size() == 3){
            
            this.temperaturaAtual = this.temperaturaAtual + media_sensores(listaSensores.get(1), listaSensores.get(2), 
                    listaSensores.get(3));
            System.out.println(temperaturaAtual + " graus. Ideal: 25 graus");
            
            if(temperaturaAtual > 25){
                System.out.println("Temperatura normalizando\n");
                this.temperaturaAtual = - this.mediaPessoas;
            }
            else {
                System.out.println("Nenhuma mudanca\n");
            }
        }
        else{
            System.out.println("Esperando outros sensores\n");
        }
    }
    
    
    public int media_sensores(Sensor sensor1, Sensor sensor2, Sensor sensor3){
        this.mediaPessoas = (int) Math.round((sensor1.getCurrentNumPessoas() + sensor2.getCurrentNumPessoas() 
                + sensor3.getCurrentNumPessoas())/3);
        /* COMETARIO REFERENCE AO ACERTO DO CALCULO PARA O VALOR DA TEMPERATURA 
        System.out.println((sensor1.getCurrentNumPessoas() + sensor2.getCurrentNumPessoas() 
        + sensor3.getCurrentNumPessoas())%3);
        double abc = (2.0+5.0+7.0)/3.0;
        int teste = (int) Math.round(4.6);
        System.out.println("OMG "+teste);*/
        
        if(mediaPessoas<=0){
            return 0;
        }
        else{
            return mediaPessoas;
        }
    }
}
