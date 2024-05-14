package util;

import constants.FrameworkConstants;
import enums.ConfigProperties;
import exceptions.PropertyFileUsageException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class PropertyUtils {

    private PropertyUtils(){}

    private static Properties properties = new Properties();

    static {
        try(FileInputStream fis = new FileInputStream(FrameworkConstants.getConfigFilePath())) {
            properties.load(fis);
        }
        catch (IOException e){
            e.printStackTrace();
            System.exit(0);
        }
    }

    public static String getValue(ConfigProperties key){
        if(Objects.isNull(properties.getProperty(key.name().toLowerCase()))||
                Objects.isNull(key)){
            throw new PropertyFileUsageException("Property name "+key+" is not found. Please check config.properties");
        }
        return properties.getProperty(key.name().toLowerCase());
    }

}
