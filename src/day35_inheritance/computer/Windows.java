package day35_inheritance.computer;

public class Windows extends Computer {

//    public void test () {
//
//    }

    String os;
    String edgeVersion;

    public Windows(String os , int memory) {
        //super()
        super(os, memory);
//    this.os =os;
//    this.memory =memory;
//    super.test();

    }

    public Windows (String os, int memory, String edgeVersion){
        this(os,memory);
        this.edgeVersion = edgeVersion;
    }



    }

