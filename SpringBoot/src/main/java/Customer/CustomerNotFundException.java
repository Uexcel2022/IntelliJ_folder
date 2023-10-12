package Customer;

public class CustomerNotFundException extends RuntimeException {
    public CustomerNotFundException(Long id) {
        super(String.format("Customer with id %s not found.",id));
    }
}
