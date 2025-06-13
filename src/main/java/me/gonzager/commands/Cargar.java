package me.gonzager.commands;

import me.gonzager.domain.Robot;

public class Cargar extends Tarea {
  private Integer tiempo;

  public Cargar(Robot robot, Integer tiempo) {
    super(robot);
    this.tiempo = tiempo;
  }

  @Override
  public void doEjecutar(Robot robot) {
    robot.cargar(tiempo);
  }

  @Override
  public Integer duracion() {
    return this.tiempo;
  }

  @Override
  public Double getConsumo() {
    return 0.00;
  }
}
