package org.example.clean_code.lesson_3_design_patterns.creational_patterns.singleton.task_1;

public class ConfigurationManager {

    private String url;
    private String name;
    private String password;

    private String filePath;

    private int lvlLog;

    private static ConfigurationManager configurationManager;

    private ConfigurationManager(String url, String name, String password, String filePath, int lvlLog) {
        this.url = url;
        this.name = name;
        this.password = password;

        this.filePath = filePath;

        this.lvlLog = lvlLog;
    };

    public static ConfigurationManager getConfigurationManager(String url, String name, String password, String filePath, int lvlLog) {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager(url, name, password, filePath, lvlLog);
        }
        return configurationManager;
    }

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getFilePath() {
        return filePath;
    }

    public int getLvlLog() {
        return lvlLog;
    }
}
