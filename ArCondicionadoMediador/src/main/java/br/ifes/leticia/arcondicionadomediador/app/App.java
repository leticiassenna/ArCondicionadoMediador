/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.leticia.arcondicionadomediador.app;

import br.ifes.leticia.arcondicionadomediador.model.ArCondicionadoMediador;
import br.ifes.leticia.arcondicionadomediador.model.Sensor;


/**
 *
 * @author 20111BSI0161
 */
public class App {
    public static void main(String[] args){
        
        ArCondicionadoMediador arCondicionado = new ArCondicionadoMediador();
        Sensor sensor1 = new Sensor(arCondicionado, 2, 1);
        Sensor sensor2 = new Sensor(arCondicionado, 5, 2);
        Sensor sensor3 = new Sensor(arCondicionado, 7, 3);
        
    }
}
