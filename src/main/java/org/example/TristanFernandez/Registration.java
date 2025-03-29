package org.example.TristanFernandez;

public class Registration {
    private String email;
    private String userName;
    private String password;

    // setter method for email with specifications
    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email was set successfully.");
        } else {
            System.out.println("This is not a valid email address.");
            System.out.println("Must end in \"@yahoo.com\"");
        }
    }

    // setter method for username with specifications
    public void setUserName(String userName) {
        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username successfully updated.");
        } else {
            System.out.println("Invalid username");
            System.out.println("Username should be a minimum of 7 characters in length.");
        }
    }

    // setter method for password with specifications
    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6) {
            if (password.contains(userName)) {
                System.out.println("Invalid password");
                System.out.println("Password cannot contain username, please try again.");
            } else {
                this.password = password;
                System.out.println("Successfully updated password.");
            }
        } else {
            System.out.println("Invalid password");
            System.out.println("Password should be a minimum of 7 characters in length.");
        }
    }
}
