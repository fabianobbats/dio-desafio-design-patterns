package me.dio.observer;

public class Aquecedor implements Observer {

  private Observable sensor;
  private boolean estaLigado;

  
  public Aquecedor(Observable sensor) {
    this.sensor = sensor;
    this.estaLigado = false;
    this.sensor.register(this);
  }


  @Override
  public void update(int temperatura) {
    if(temperatura <= 16 && !estaLigado) {
      estaLigado = true;
      System.out.printf("Temperatura: %d °C -> Ligando o aquecedor...\n", temperatura);
    }else if(temperatura > 16 && estaLigado) {
      estaLigado = false;
      System.out.printf("Temperatura: %d °C -> Desligando o aquecedor...\n", temperatura);
    }
  }
  
}
