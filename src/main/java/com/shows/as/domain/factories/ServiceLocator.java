package com.shows.as.domain.factories;

public class ServiceLocator {

    private static ServiceLocator instance = new ServiceLocator();

    public static ServiceLocator getInstance() {
        return instance;
    }

    private ServiceLocator() {

    }
}
