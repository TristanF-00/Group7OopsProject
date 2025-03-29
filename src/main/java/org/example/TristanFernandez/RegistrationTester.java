package org.example.TristanFernandez;


public class RegistrationTester {
    public static void main(String[] args) {

        Registration register = new Registration();

        // invalid and then valid setting of email
        register.setEmail("Tristan@gmail.com");
        register.setEmail("Tristan@yahoo.com");
        System.out.println();

        // invalid and then valid setting of username
        register.setUserName("tris");
        register.setUserName("tristanF");
        System.out.println();

        // invalid and then valid setting of password
        register.setPassword("1234");
        register.setPassword("tristanFernandez");
        register.setPassword("LetMeInItsTristan");
    }
}
