package com.github;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class App extends Application<Config> {

  public static void main(String[] args) throws Exception {
    new App().run(args);
  }

  @Override
  public void run(Config configuration, Environment environment) throws Exception {

  }
}
