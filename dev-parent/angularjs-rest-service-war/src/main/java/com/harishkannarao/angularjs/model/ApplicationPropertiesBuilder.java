package com.harishkannarao.angularjs.model;

import java.util.List;

public class ApplicationPropertiesBuilder {
    private String sampleString;
    private List<String> listOfString;
    private Long sampleLong;
    private Boolean enablePropertyChangeListener;

    private ApplicationPropertiesBuilder() {}

    public static ApplicationPropertiesBuilder newBuilder() {
        return new ApplicationPropertiesBuilder();
    }

    public ApplicationProperties build() {
        ApplicationProperties result = new ApplicationProperties();
        result.setSampleString(sampleString);
        result.setListOfString(listOfString);
        result.setSampleLong(sampleLong);
        result.setEnablePropertyChangeListener(enablePropertyChangeListener);
        return result;
    }

    public ApplicationPropertiesBuilder setSampleString(String sampleString) {
        this.sampleString = sampleString;
        return this;
    }

    public ApplicationPropertiesBuilder setListOfString(List<String> listOfString) {
        this.listOfString = listOfString;
        return this;
    }

    public ApplicationPropertiesBuilder setSampleLong(Long sampleLong) {
        this.sampleLong = sampleLong;
        return this;
    }

    public ApplicationPropertiesBuilder setEnablePropertyChangeListener(Boolean enablePropertyChangeListener) {
        this.enablePropertyChangeListener = enablePropertyChangeListener;
        return this;
    }
}
