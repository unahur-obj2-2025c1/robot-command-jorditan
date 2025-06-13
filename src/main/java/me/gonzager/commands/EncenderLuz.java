package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class EncenderLuz extends Tarea {
  Habitacion habitacion;

  public EncenderLuz(Robot robot, Habitacion habitacion) {
    super(robot);
    this.habitacion = habitacion;
  }

  public void doEjecutar(Robot robot) {
    robot.encenderLuz(habitacion);
  }

  @Override
  public Integer duracion() {
    if (habitacion.getLuzEncendida()) {
      return 25;
    } else {
      return 90;
    }
  }

  @Override
  public Double getConsumo() {
    if (habitacion.getLuzEncendida()) {
      return 1.00;
    } else {
      return 5.00;
    }
  }
}
