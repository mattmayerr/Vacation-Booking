package com.example.demo;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.dao.DivisionRepository;
import com.example.demo.entities.Customer;
import com.example.demo.entities.Division;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    private final CustomerRepository customerRepository;
    private final DivisionRepository divisionRepository;

    public Bootstrap(CustomerRepository customerRepository, DivisionRepository divisionRepository) {
        this.customerRepository = customerRepository;
        this.divisionRepository = divisionRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Division alexDiv = divisionRepository.findById(Long.valueOf(5)).orElse(null);
        Division mattDiv = divisionRepository.findById(Long.valueOf(21)).orElse(null);
        Division charlieDiv = divisionRepository.findById(Long.valueOf(64)).orElse(null);
        Division lisaDiv = divisionRepository.findById(Long.valueOf(31)).orElse(null);
        Division samDiv = divisionRepository.findById(Long.valueOf(14)).orElse(null);

        Customer alex = new Customer(Long.valueOf(2), "Alex", "Armstrong", "4432 Apollo Way", "44321", "(304)398-9981", null, null, alexDiv);
        Customer matt = new Customer(Long.valueOf(3), "Matt", "Mayer", "7470 Charlotte Pike", "76021", "(817)835-0884", null, null, mattDiv);
        Customer charlie = new Customer(Long.valueOf(4), "Charlie", "Sheen", "887 Forest Lane", "93219", "(714)987-0163", null, null, charlieDiv);
        Customer lisa = new Customer(Long.valueOf(5), "Lisa", "Nevares", "16524 Iron Horse Rd", "29421", "(854)013-4891", null, null, lisaDiv);
        Customer sam = new Customer(Long.valueOf(6), "Sam", "Richards", "6951 Orange Tree Ct", "87865", "(214)789-1538", null, null, samDiv);

        customerRepository.save(alex);
        customerRepository.save(matt);
        customerRepository.save(charlie);
        customerRepository.save(lisa);
        customerRepository.save(sam);
    }
}
