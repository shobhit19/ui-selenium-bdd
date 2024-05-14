package constants;

public final class FrameworkConstants {

    private FrameworkConstants(){}

    private static final String RESOURCE_PATH = System.getProperty("user.dir")+"/src/test/java/resources";
    private static final String CONFIG_FILE_PATH = RESOURCE_PATH+"/config/config.properties";


    public static String getConfigFilePath(){
        return CONFIG_FILE_PATH;
    }

}
