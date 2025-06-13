package me.gonzager.domain;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import me.gonzager.commands.Tarea;


public class Robot {
  private Double cargaBateria;
  private List<Tarea> tareasRealizadas = new ArrayList<>();

  public Robot(Double cargaBateria) {
    this.cargaBateria = redondearDosDecimales(cargaBateria);
  }

  public List<Tarea> getTareasRealizadas() {
    return tareasRealizadas;
  }

  public Double getCargaBateria() {
    return cargaBateria;
  }

  public void consumirBateria(Double cantidadConsumo) {
    this.cargaBateria -= cantidadConsumo;
  }

  private Double redondearDosDecimales(Double valor) {
        BigDecimal bd = BigDecimal.valueOf(valor);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    
    public Integer cantidadTareasRealizadas() {
      return tareasRealizadas.size();
    }
    
    public Integer tiempoTotalTareasRealizadas() {
      return tareasRealizadas.stream()
      .mapToInt(Tarea::duracion)
      .sum();
    }
    
    public Integer promedioTiempoTareasRealizadas() {
      return this.tiempoTotalTareasRealizadas() / this.cantidadTareasRealizadas();
    }

    public void ejecutarTarea(Tarea tarea) {
      try {
        if (tarea.getConsumo() < cargaBateria) {
          tarea.ejecutar(this);
          tareasRealizadas.add(tarea);
        }
      } catch (Exception e) {
        System.err.println("El robot no tiene suficiente carga para realizar la tarea");
      }
    }
  
    public void cargar(Integer minutos) {
      Double cargaPosible = minutos * 0.8;
    
      cargaBateria = Math.min(cargaBateria + cargaPosible, 100.0);
    }

    public void limpiarPiso(Habitacion habitacion) {
      habitacion.limpiarPiso();
    }

    public void apagarLuz(Habitacion habitacion) {
      habitacion.apagarLuz();
    }

    public void encenderLuz(Habitacion habitacion) {
      habitacion.encenderLuz();
    }
  
    
  }
