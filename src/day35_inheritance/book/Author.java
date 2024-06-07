package day35_inheritance.book;

import my_utilities.StringUtil;

public class Author {
    String name;
    int age;

    public Author(String name, int age) {
       // this.name = name;
        setName(name);
       // this.age = age;
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String result = "";
        for (String each : name.split(" ")){
            result+=StringUtil.fixFormat(each)+" ";

        }
        //result = "Jojo Moyes "
        this.name = result.trim();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //this.age = age;
        if (age > 12){
            this.age = age;

        }

    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
