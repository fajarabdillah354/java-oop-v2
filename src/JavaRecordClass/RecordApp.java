package JavaRecordClass;

public class RecordApp {

    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("fajar abdillah ahmad", "fahmifadilah25");

        System.out.println(loginRequest);
        System.out.println("id : "+loginRequest.Username());
        System.out.println("password : "+ loginRequest.Password());

        System.out.println(new LoginRequest("fajar abdillah ahmad"));
        System.out.println(new LoginRequest(null,"ujeh354"));
    }

}
