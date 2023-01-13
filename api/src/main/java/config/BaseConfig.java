package config;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:config.properties"})
public interface BaseConfig extends Config {
    String url();
    String headers();

}