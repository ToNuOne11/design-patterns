package patterns.singleton;

public class SingletonMethodMain {
    public static void main(String[] args) {
        ProgramLogger.getProgramLogger().addLogInfo("New log1...");
        ProgramLogger.getProgramLogger().addLogInfo("New log2...");
        ProgramLogger.getProgramLogger().addLogInfo("New log3...");

        ProgramLogger.getProgramLogger().showLogFile();
    }
}
