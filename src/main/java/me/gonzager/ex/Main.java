package me.gonzager.ex;

import me.gonzager.commands.Limpiar;
import me.gonzager.commands.Tarea;
import me.gonzager.domain.Habitacion;
import me.gonzager.domain.Robot;

public class Main {
    public static void main(String[] args) {
        Robot robot = new Robot(10.00);

        Habitacion habitacion = new Habitacion(100);

        Tarea limpiarPiso = new Limpiar(robot, habitacion);

        robot.ejecutarTarea(limpiarPiso);
    }
}