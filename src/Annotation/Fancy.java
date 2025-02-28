package Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
annotation sebenarnya kaya cuma nambahin informasi aja
 */
@Target(value = {ElementType.TYPE})// ini berguna agar annotation ini di akses di TYPE dan jika kita menambahkan annotation di method akan error karna kita harus menambahkan ElementType.METHOD

@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {

    String name() default "Silahkan Coba Lagi";// jika kita memberi nilai value maka orang lain yang ingin memakai tidak harus menuliskan valuenya


    String[] tags() default {};




}
