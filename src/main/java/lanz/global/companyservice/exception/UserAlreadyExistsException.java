package lanz.global.companyservice.exception;

public class UserAlreadyExistsException extends BadRequestException {

    public UserAlreadyExistsException(String email) {
        super("exception.user-already-exists.title", "exception.user-already-exists.message", email);
    }
}
