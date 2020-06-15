package com.myorg;

import software.amazon.awscdk.core.App;

public class ExampleApp extends App {

    public ExampleApp() {
        new ExampleStack(this, "ExampleStack");
    }

}
