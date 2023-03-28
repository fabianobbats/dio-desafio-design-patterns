import me.dio.observer.Aquecedor;
import me.dio.observer.ArCondicionado;
import me.dio.observer.Observer;
import me.dio.observer.Sensor;

public class App {
    public static void main(String[] args) throws Exception {
        
        Sensor sensor = new Sensor();

        Observer arCondicionado = new ArCondicionado(sensor);
        Observer aquecedor = new Aquecedor(sensor);
        
        sensor.setTemperatura(22);
        sensor.setTemperatura(30);
        sensor.setTemperatura(25);
        sensor.setTemperatura(14);
        sensor.setTemperatura(20);
    }
}
