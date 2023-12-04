package view.command;

import view.ConsoleUI;

public class Load extends Command {
    public Load(ConsoleUI consoleUI){
        super(consoleUI);
        description = "Звгрузить из файла";
    }
    public  void execute(){
        consoleUI.load();
    }
}
