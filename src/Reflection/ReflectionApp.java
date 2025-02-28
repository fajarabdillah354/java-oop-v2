package Reflection;



public class ReflectionApp {
    public static void main(String[] args) {
        CreateUser createUser = new CreateUser();
        createUser.setName("fajarabdillah01");
        createUser.setPassword("fahmifadilah25");
        Validate.ValidationReflection(createUser);// saat kita ingin mengecek kita hanya perlu mengakses method validaationReflection
    }


   
}
