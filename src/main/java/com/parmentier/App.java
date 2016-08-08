package com.parmentier;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

    public static List<String> fizzBuzz(){
        List<String> list = new ArrayList<>();
        for(int i = 1; i <= 15; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                list.add("Fizz Buzz");
            }else if(i % 3 == 0) {
                list.add("Fizz");
            }else if(i % 5 == 0){
                list.add("Buzz");
            }else {
                list.add("" + i);
            }
        }
        return list;
    }
}
