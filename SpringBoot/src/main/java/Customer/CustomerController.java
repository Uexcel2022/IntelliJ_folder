package Customer;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository){
        this.repository = repository;
    }

    @GetMapping("/customer")
    List<Customer> getCustomer(){
        return repository.findAll();
    }

    @PostMapping("/customer")
    Customer saveCustomer(@RequestBody Customer  newCustomer){
      return repository.save(newCustomer);
    }

    @DeleteMapping("/customer/{id}")
    void delete(@PathVariable long id ){
        repository.deleteById(id);
    }

    @GetMapping("/customer/{id}")
    Customer getCustomer(@PathVariable Long id ){
        return repository.findById(id)
        .orElseThrow(()->(new CustomerNotFundException(id)));
    }
    @PutMapping("/customer/{id}")
    Customer update(@PathVariable Long id, @RequestBody Customer newCustomer){
        return repository.findById(id).map(customer -> {
            customer.setName(newCustomer.getName());
            customer.setEmail(newCustomer.getEmail());
            return repository.save(customer);
        }).orElseThrow(()-> new CustomerNotFundException(id));
    }
}
