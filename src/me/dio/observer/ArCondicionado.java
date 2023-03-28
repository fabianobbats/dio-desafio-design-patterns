package me.dio.observer;

public class ArCondicionado implements Observer{
  private Observable sensor;
  private boolean estaLigado;

  
  public ArCondicionado(Observable sensor) {
    this.sensor = sensor;
    this.estaLigado = false;
    this.sensor.register(this);
  }

  @Override
  public void update(int temperatura) {
    if(temperatura > 22 && !estaLigado) {
      estaLigado = true;
      System.out.printf("Temperatura: %d °C -> Ligando o ar condicionado... \n", temperatura);
    }else if(temperatura <= 16 && estaLigado) {
      estaLigado = false;
      System.out.printf("Temperatura: %d °C -> Desligando o ar condicionado...\n", temperatura);
    }
  }
}
