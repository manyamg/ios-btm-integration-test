package com.hitachi.btm.config;

import com.hitachi.btm.config.models.Configuration;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;
import java.util.Optional;

import static java.lang.String.format;


public class ConfigurationLoader {

    private static Configuration config;


    private static Configuration initialise() {
        Constructor constructor = new Constructor(Configuration.class);
        String fileName = "";
        fileName = Optional.ofNullable(System.getProperty("environment")).orElse("qa") + ".yml";
        InputStream input = ConfigurationLoader.class.getClassLoader().getResourceAsStream(format("config/%s", fileName));
        Yaml yaml = new Yaml(constructor);
        config = (Configuration) yaml.load(input);
        return config;
    }


    public static Configuration config() {
        if (config == null) {
            return initialise();
        } else {
            return config;
        }
    }

}
