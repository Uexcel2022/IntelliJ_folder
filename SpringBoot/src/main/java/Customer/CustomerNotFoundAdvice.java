package Customer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class CustomerNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(CustomerNotFundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String customerNotFundHandler(CustomerNotFundException e){
        return e.getMessage();
    }
}
