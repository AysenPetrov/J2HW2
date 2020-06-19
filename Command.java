package J2HW2;

public abstract class Command {

    protected String name;
    protected String argument;

    public Command(String name, String argument) {
        this.name = name;
        this.argument = argument;
    }

    public String getName() {
        return name;
    }
}