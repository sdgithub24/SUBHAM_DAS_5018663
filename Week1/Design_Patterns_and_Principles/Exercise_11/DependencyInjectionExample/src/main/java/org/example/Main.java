package org.example;


interface CustomerRepository{
    public void findCustomerById();
}

class CustomerRepositoryImpl implements CustomerRepository{
    public void findCustomerById() {
        System.out.println("Find customer by id");

    }
}

class CustomerService{
    CustomerRepository repository;
    public CustomerService(CustomerRepository repository){
        this.repository = repository;
    }

    public void findCustomerById() {
        repository.findCustomerById();
    }
}

public class Main {
    public static void main(String[] args) {
        CustomerRepository repository = new CustomerRepositoryImpl();
        repository.findCustomerById();

    }
}