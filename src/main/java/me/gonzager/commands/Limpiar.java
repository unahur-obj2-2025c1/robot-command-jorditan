package me.gonzager.commands;

import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Limpiar extends Tarea {
  Habitacion habitacion;

  public Limpiar(Robot robot, Habitacion habitacion) {
    super(robot);
    this.habitacion = habitacion;
  }

  @Override
  public Integer duracion() {
    return habitacion.getMetrosCuadrados() * 180;
  }

  @Override
  public void doEjecutar(Robot robot) {
    robot.limpiarPiso(habitacion);
  }

  @Override
  public Double getConsumo() {
    return 5.00 * habitacion.getMetrosCuadrados();
  }
}
