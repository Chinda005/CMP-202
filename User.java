public class user {
    String username = "Solomon";
    String password = "12345"
    String Login (){
        if (username.equals("solomon") && password.equals("12345")) {
            return "Logged In"; 
        } else {
            return"Failed";

        }
    }
    public static void main(String[]args){
        User jane = new User ();
        System.out.println(jane.login());
    }
}