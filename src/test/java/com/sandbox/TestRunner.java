package com.sandbox;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;
import static org.junit.platform.engine.discovery.DiscoverySelectors.selectPackage;
import static org.junit.platform.launcher.TagFilter.includeTags;

import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;

public class TestRunner {

  public static void main(String args[]) {
    final LauncherDiscoveryRequest request =
        LauncherDiscoveryRequestBuilder.request()
            .selectors(selectClass(TestRunner.class), selectPackage("com.sandbox"))
            .filters(includeTags(args[0]))
            .build();

    final Launcher launcher = LauncherFactory.create();
    launcher.execute(request);

    System.out.println("HELLO TEST...");
  }
}
