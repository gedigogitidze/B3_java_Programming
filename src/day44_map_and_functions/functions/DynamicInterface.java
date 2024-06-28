package day44_map_and_functions.functions;
// i want to make my FunctionalInterface to be able to work with all different data types
// <E> ----- > Generic
// <> ------> defines that it will work with any data type - any object can be used
// T -----------> T is a common name used

import java.util.ArrayList;

@FunctionalInterface
public interface DynamicInterface <T> {

    void test(T t);



}
