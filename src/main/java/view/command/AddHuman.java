package view.command;

import view.ConsoleUI;

public class AddHuman extends Command {
    public AddHuman(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Добавить человека";
    }

    public void execute(){
        consoleUI.addNewHuman();
    }
}
