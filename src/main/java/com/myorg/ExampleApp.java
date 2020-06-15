package com.myorg;

import software.amazon.awscdk.core.App;

import java.util.Arrays;

public class ExampleApp {
    public static void main(final String[] args) {
        App app = new App();

        new ExampleStack(app, "ExampleStack");

        app.synth();
    }
}
