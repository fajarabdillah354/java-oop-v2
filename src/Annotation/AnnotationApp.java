package Annotation;


@Fancy(name = "fajar abdillah ahmad", tags = {"aplication", "java"})// jika ditambahkan disini tidak akan error namun jika ditambahkan dibagian method akan error karna kita belum menambahkan TYPE lain di bagian annotation
public class AnnotationApp {


    /*
    annotation digunakan untuk menambahkna meta data kedalam program kita, seperti contohnya ketika kita ingin menambahkan library atau framework


    annotation hanya bisa memiliki kode program sederhana, contoh atributenya:
    @Target   : memberi tahu bahwa annnotation dapat digunakan dimana saja ex Class,METHOD,FIELD, DLL
    @Retention   :  memberi tahu bahwa annnotation nya apakah disimpan di hasil kompilasi(ditampilkan juga) atau hanya sebatas di dalam program saja
     */

//   @Fancy() ini akan error
    String TryMethod(){
     return "kasian dehhluu";
    }
}
