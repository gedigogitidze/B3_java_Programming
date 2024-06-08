package day36_inheritance.access;

/*
Create an App class


create variables:
      name (app name), version


create constructor to initialize the variables


create method:
      download()
          Example output: prints $name is downloading version $version

 */
    // INSTANCE VARIABLES
public class App {
    String name;
    double version;

  // CONSTRuCTOR
    public App(String name, double version) {
        this.name = name;
        this.version = version;
    }
    //INSTANCE METHOD
    public void download () {
        System.out.println(name + " is downloading version "+version);
    }

}
