package view.command;

import view.ConsoleUI;

import java.io.Console;

public abstract class Command {
    String description;
    ConsoleUI consoleUI;

    public Command(ConsoleUI consoleUI) {
        this.consoleUI = consoleUI;
    }

    public String getDescription() {
        return description;
    }
    public abstract void execute();
}
