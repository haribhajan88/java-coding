
class InvalidCredentialsException extends Exception {
    InvalidCredentialsException(String msg) { super(msg); }
}

class Login {
    void validate(String user, String pass) throws InvalidCredentialsException {
        if (!user.equals("admin") || !pass.equals("1234"))
            throw new InvalidCredentialsException("Invalid username or password!");
        System.out.println("Login successful!");
    }
}

public class login_sys {
    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.validate("admin", "wrongpass"); // Try changing to "1234" to test success
        } catch (InvalidCredentialsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again.");
        }
    }
}