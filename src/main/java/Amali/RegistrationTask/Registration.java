package Amali.RegistrationTask;

public class Registration {
    private String userName;
    private String email;
    private String password;

    public void setUserName (String userName) {
        if (!userName.isEmpty()){
            if(userName.length() <= 6){
                System.out.println("WORNING: USERNAME must be at least 7 characters! ");
            }
            else if (password != null && password.contains(userName)){
                System.out.println("WORNING: Password can NOT contain User Name!");
            }
            else {
                this.userName = userName;
            }
        }
        else {
            System.out.println("ERROR: USERNAME can NOT be empty!");
        }
    }



    public void setEmail(String email) {
        if (!email.isEmpty()){
            if (email.matches("[a-zA-Z]+@yahoo.[a-zA-Z]+")){
                this.email = email;
            }
            else{
                System.out.println("WARING: Please use Yahoo");
            }
        }
        else{
            System.out.println("ERROR: email can not be empty!");
        }


    }



    public void setPassword(String password) {
        if (!password.isEmpty()){
           if(password.length() <= 6){
               System.out.println("WARNING: Password must be at least 7 characters!");
           } else if (password.contains(userName)){
               System.out.println("WARNING: Password can NOT contain User Name!");
           }
           else{
               this.password = password;
           }

        }
        else {
            System.out.println("ERROR: Password can NOT be empty!");
        }
    }




}
