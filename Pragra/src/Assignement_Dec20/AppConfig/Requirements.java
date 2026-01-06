package Assignement_Dec20.AppConfig;

public class Requirements {
    static String appName;
    static float version;
    static
    {
        appName="Android";
        version=2.0F;
    }
    static void displayConfig()
    {
        System.out.println(appName+" "+version);
    }
}
