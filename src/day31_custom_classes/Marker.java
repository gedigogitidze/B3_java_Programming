package day31_custom_classes;

public class Marker {

    String type;
    String brad;
    String color;


//Once we create constructor there is no more default constructor
    public Marker(String inputType,String inputBrand,String inputColor){
        color = inputColor;
        type = inputType;
        brad  =inputBrand;


    }

    @Override
    public String toString() {
        return "Marker{" +
                "\ntype: " + type+
                "\nbrad: " + brad+
                "\ncolor: " + color;
    }
}
