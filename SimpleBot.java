package J2HW2;

import java.util.ArrayList;

public class SimpleBot {

    private ArrayList<ICommand> commands;

    public SimpleBot() {
        this.commands  = new ArrayList<>();
        System.out.println("SimpleBot is running now");
    }

    public void addCommand(ICommand cmd) {
        this.commands.add(cmd);
    }

    public void rmCommand(String cmdName) {
        ArrayList<ICommand> filtered = new ArrayList<>();
        for (ICommand cmd : this.commands) {
            if(!cmd.getName().equals(cmdName)) {
                filtered.add(cmd);
            }
        }
        this.commands = filtered;
    }

    public ArrayList<ICommand> getCommands() {
        return this.commands;
    }

}