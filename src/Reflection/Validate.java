package Reflection;

import Annotation.NotBlank;
import ExceptionHandling.BlankException;

import java.lang.reflect.Field;

public class Validate {


    /*
    berikut dibawah ini adalah contoh dari validation Reflection
     */
    public static void ValidationReflection(Object object){
        Class aClaSS = object.getClass();
        Field[] fields = aClaSS.getDeclaredFields();

        for (var field : fields){
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null ){// kita bisa mengkombinasikannya dengan annnotation
                //validated
                try{
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()){
                        throw new BlankException("Field "+field.getName()+ " is blank ");
                    }
                }catch (IllegalAccessException illegalAccessException){
                    System.out.println("Can't to access field "+ illegalAccessException.getMessage());
                }
            }
        }


    }


}
