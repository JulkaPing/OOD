package designpatterns.creational.singleton;

public class ProgramLogger {
    private static ProgramLogger programLoger;
    private static String logFile = "This is a lof file. \n\n";

    public static synchronized ProgramLogger getProgramLoger() {
        if (programLoger == null) {
            programLoger = new ProgramLogger();
        }
        return programLoger;
    }

    private ProgramLogger() {

    }

    public void addLogInfo(String logInfo) {
        logFile = logFile + logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
