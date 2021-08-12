package com.example;

import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithName;

@ConfigMapping(prefix = "myconfig")
public class MyConfig {
    @WithName("firstname")
    public String firstname;
    @WithName("lastname")
    public String lastname;
}
