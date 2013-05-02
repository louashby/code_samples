public class SetterPrintUtil{

  public void printSetters(){
    try {
      Class c = this.getClass();
      Method m[] = c.getMethods();
      for (int i = 0; i < m.length; i++)
        if (m[i].getName().startsWith("set")){
          System.out.println("instanceName."+m[i].getName()+"(\"valOne\");");
        }

    }
    catch (Throwable e) {
      System.err.println(e);
    }
  }

}
