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

    static void runBusinessLogic() {
        dialog.render();
    }
}
