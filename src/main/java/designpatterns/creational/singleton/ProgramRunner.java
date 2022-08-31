package designpatterns.creational.singleton;

public class ProgramRunner {
    public static void main(String[] args) {
        System.out.println(ProgramLogger.getProgramLoger().toString());
        System.out.println(ProgramLogger.getProgramLoger().toString());

        ProgramLogger.getProgramLoger().addLogInfo("First log...");
        ProgramLogger.getProgramLoger().addLogInfo("Second log...");
        ProgramLogger.getProgramLoger().addLogInfo("Third log...");

        ProgramLogger.getProgramLoger().showLogFile();
    }
}
