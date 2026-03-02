package org.example.clean_code.lesson_3_design_patterns.creational_patterns.singleton.task_1;

public class ConfigurationManager {

    public String url;
    public String name;
    public String password;

    public String filePath;

    public int lvlLog;

    private static ConfigurationManager configurationManager;

    private ConfigurationManager() {
        url = "https//";
        name = "root";
        password = "root";

        filePath = "/";

        lvlLog = 0;
    };

    public static ConfigurationManager getConfigurationManager() {
        if (configurationManager == null) {
            configurationManager = new ConfigurationManager();
        }
        return configurationManager;
    }

}
