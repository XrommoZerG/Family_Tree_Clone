package command;

import view.ConsoleUI;

public class GetTree extends Command{
    public GetTree(ConsoleUI consoleUI) {
        super(consoleUI);
        description = "Просмотреть весь список";
    }

    public void execute(){
        consoleUI.viewAll();
    }
}
