package pro.sky.lists.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Сотрудник уже добавлен")
public class EmployeeAlreadyAddedException extends UnsupportedOperationException {
    public EmployeeAlreadyAddedException(String message) {
        super(message);
    }
}
