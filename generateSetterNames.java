package com.bmw.codis.service.garage.mapping;

import java.lang.reflect.Method;

public class PrintMethodsUtil {

  public static void printMethods(Object instance, String prefix) {
    try {
      Class c = instance.getClass();
      String instanceName = generateInstanceName(instance);

      Method m[] = c.getMethods();
      for (int i = 0; i < m.length; i++)
        if (m[i].getName().startsWith(prefix)) {
          System.out.println(instanceName + "." + m[i].getName() + "(\"value\");");
        }

    } catch (Throwable e) {
      System.err.println(e);
    }
  }

  private static String generateInstanceName(Object instance) {
    String instanceName = instance.getClass().getSimpleName();
    String first = instanceName.substring(0, 1).toLowerCase();
    instanceName = first + instanceName.substring(1, instanceName.length());
    return instanceName;
  }

  public static void printGetters(Object instance) {
    printMethods(instance, "get");
  }

  public static void printSetters(Object instance) {
    printMethods(instance, "set");
  }
}
