package cda.exec;


import cda.factory.Dialog;
import cda.factory.SwingDialog;

public final class Application {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        // TODO : add readConfigFile()
    	if (true) {
            dialog = new SwingDialog();
        } else {
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.render();
    }
}
