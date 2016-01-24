/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.leticia.arcondicionadomediador.model.ArCondicionadoMediador;
import br.ifes.leticia.arcondicionadomediador.model.Sensor;
import junit.framework.Assert;
import org.junit.Test;
/**
 *
 * @author Leticia
 */
public class TesteArCondicionado {
    
    public TesteArCondicionado() {
    }
    
    @Test
    public void TesteArCondicionado(){
        ArCondicionadoMediador arCondicionado = new ArCondicionadoMediador();
        Sensor sensor1 = new Sensor(arCondicionado, 2, 1);
        sensor1.ligar();
        Sensor sensor2 = new Sensor(arCondicionado, 5, 2);
        sensor2.ligar();
        Sensor sensor3 = new Sensor(arCondicionado, 7, 3);
        sensor3.ligar();
        arCondicionado.controlandoTemperatura();
        
        Assert.assertEquals(4, arCondicionado.media_sensores(sensor1, sensor2, sensor3));
    }
    
    @Test
    public void TesteSensor(){
        ArCondicionadoMediador arCondicionado = new ArCondicionadoMediador();
        Sensor sensor1 = new Sensor(arCondicionado, 2, 1);
        sensor1.ligar();
        
        Assert.assertEquals(2, sensor1.getCurrentNumPessoas());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
