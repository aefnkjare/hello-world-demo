package com.iv;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// https://logging.apache.org/log4j/2.x/manual/configuration.html
// https://logging.apache.org/log4j/2.x/manual/usage.html
public class App {
    static final Logger logger = LogManager.getLogger(App.class.getName());
    public static void main(String[] args) {
        logger.error("Error!");
    }
}