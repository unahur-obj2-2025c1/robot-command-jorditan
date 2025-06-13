package me.gonzager.commands;

import me.gonzager.domain.Robot;

public class Info extends Tarea {

  public Info(Robot robot) {
    super(robot);
  }

  @Override
  public void doEjecutar(Robot robot) {
    System.err.println(robot.promedioTiempoTareasRealizadas());
  }

  @Override
  public Double getConsumo() {
    return 10.00;
  }

  @Override
  public Integer duracion() {
    return 15;
  }
}
