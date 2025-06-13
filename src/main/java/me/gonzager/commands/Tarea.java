package me.gonzager.commands;

import me.gonzager.domain.Robot;

public abstract class Tarea  {
  Robot robot;

  public Tarea(Robot robot) {
    this.robot = robot;
  }

  public void ejecutar(Robot robot) {
    this.doEjecutar(robot);
    robot.consumirBateria(this.getConsumo());;
  };

  public abstract void doEjecutar(Robot robot);

  public abstract Double getConsumo();

  public abstract Integer duracion();
}
