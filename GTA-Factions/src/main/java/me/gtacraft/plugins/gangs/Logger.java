package me.gtacraft.plugins.gangs;

import org.fusesource.jansi.Ansi;

/**
 * Created by Connor on 6/29/14. Designed for the GTA-Factions project.
 */

public class Logger {

    private final String ansi_green = Ansi.ansi().fg(Ansi.Color.GREEN).boldOff().toString();
    private final String ansi_yellow = Ansi.ansi().fg(Ansi.Color.YELLOW).boldOff().toString();
    private final String ansi_red = Ansi.ansi().fg(Ansi.Color.RED).boldOff().toString();

    private final String ansi_underline = Ansi.ansi().a(Ansi.Attribute.UNDERLINE).boldOff().toString();
    private final String ansi_reset = Ansi.ansi().a(Ansi.Attribute.RESET).boldOff().toString();

    public void notice(String s, Class<?> c){
        System.out.println(ansi_green + "[GTAGangs (" + c.getSimpleName() + ")] " + s + ansi_reset);
    }

    public void debug(String s, Class<?> c){
        System.out.println(ansi_yellow + "(DE) " + ansi_reset + "[GTAGangs (" + c.getSimpleName() + ")] " + s + ansi_reset);
    }

    public void log(String s, Class<?> c){
        System.out.println("[GTAGangs (" + c.getSimpleName() + ")] " + s);
    }

    public void warning(String s, Class<?> c){
        System.out.println(ansi_yellow + "[GTAGangs (" + c.getSimpleName() + ")] " + s + ansi_reset);
    }

    public void error(String s, Class<?> c){
        System.out.println(ansi_red + "[GTAGangs (" + c.getSimpleName() + ")] " + s + ansi_reset);
    }
}