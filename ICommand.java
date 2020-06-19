package J2HW2;

public interface ICommand {

    public void run() throws SimpleBotException;
    public String getName();

}