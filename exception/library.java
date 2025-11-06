package exception;

class BookNotAvailableException extends Exception {
    BookNotAvailableException(String msg) { super(msg); }
}
class InvalidReturnException extends Exception {
    InvalidReturnException(String msg) { super(msg); }
}
class UserLimitExceededException extends Exception {
    UserLimitExceededException(String msg) { super(msg); }
}

class Library {
    void borrowBook(boolean available, int booksBorrowed) throws BookNotAvailableException, UserLimitExceededException {
        if (!available) throw new BookNotAvailableException("Book is not available!");
        if (booksBorrowed > 5) throw new UserLimitExceededException("User limit exceeded!");
        System.out.println("Book borrowed successfully.");
    }

    void returnBook(boolean wasBorrowed) throws InvalidReturnException {
        if (!wasBorrowed) throw new InvalidReturnException("Book was not borrowed!");
        System.out.println("Book returned successfully.");
    }
}

public class library {
    public static void main(String[] args) {
        Library lib = new Library();
        try {
            lib.borrowBook(false, 3); // Try changing to true
            lib.returnBook(false);   // Try changing to true
        } catch (BookNotAvailableException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (UserLimitExceededException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InvalidReturnException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
