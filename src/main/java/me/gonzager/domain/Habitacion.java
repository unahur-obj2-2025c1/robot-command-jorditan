package me.gonzager.domain;

public class Habitacion {
  private Boolean luzEncendida;
  private Boolean estaLimpio;
  private Integer metrosCuadrados;

  public Integer getMetrosCuadrados() {
    return metrosCuadrados;
  }


  public Boolean getEstaLimpio() {
    return estaLimpio;
  }


  public Habitacion (Integer metrosCuadrados) {
    this.metrosCuadrados = metrosCuadrados;
  }

  public Boolean getLuzEncendida() {
    return luzEncendida;
  }

  public void encenderLuz() {
    luzEncendida = true;
  }

  public void apagarLuz() {
    luzEncendida = true;
  }

  public void limpiarPiso() {
    estaLimpio = true;
  }
}
