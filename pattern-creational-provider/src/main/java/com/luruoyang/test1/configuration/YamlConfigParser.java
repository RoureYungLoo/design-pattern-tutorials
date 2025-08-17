package com.luruoyang.test1.configuration;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;

public class YamlConfigParser {
  public Config parseConfig() {
    Yaml yaml = new Yaml(new Constructor(Config.class));
    InputStream inputStream = this.getClass()
        .getClassLoader()
        .getResourceAsStream("config.yaml");

    if (inputStream == null) {
      throw new RuntimeException("Cannot find config.yaml");
    }
    return yaml.load(inputStream);
  }

  public String getProviderClassName() {
    YamlConfigParser parser = new YamlConfigParser();
    Config config = parser.parseConfig();
    return config.getMyKitty().getProvider();
  }
}