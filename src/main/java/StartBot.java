import commands.Constants;

public class StartBot extends Constants {
    public static void main(String[] args) {
        if (args.length != 0) {
            Constants.BOT_TOKEN = args[0];
            new InputController();
            System.out.println("SUCCESSFUL INITIALIZATION");
        } else {
            System.out.println("ERROR: Bot token = null");
        }
    }
}
