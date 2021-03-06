package J2HW2;

public class SimpleBotException extends Exception {

    private int errCode;
    private String args;

    public SimpleBotException(String msg, int errCode, String args) {
        super(msg);
        this.errCode = errCode;
        this.args = args;
    }

    public int getErrCode() {
        return this.errCode;
    }

    public String getErrArgs() {
        return this.args;
    }

}
