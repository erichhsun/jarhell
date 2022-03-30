package com.github;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class Config extends Configuration {

  @JsonProperty
  private String username;

  public String getUsername() {
    return username;
  }
}
