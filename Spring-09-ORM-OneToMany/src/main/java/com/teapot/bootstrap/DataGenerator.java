package com.teapot.bootstrap;

import com.teapot.entity.Address;
import com.teapot.entity.Person;
import com.teapot.repository.AddressRepository;
import com.teapot.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {

        Person p1 = new Person("Mike","Smith");
        Person p2 = new Person("Sandra","Bullock");
        Person p3 = new Person("Tedd","Jonny");

        Address a1 = new Address("Quenn St","17042");
        Address a2 = new Address("King St","23501");
        Address a3 = new Address("Java St","27308");

//        p1.setAddresses(Arrays.asList(a1,a2));  //case 1

        personRepository.save(p1);

        a1.setPerson(p1);
        a2.setPerson(p1);

        personRepository.save(p2);
        a3.setPerson(p2);

        addressRepository.save(a1);
        addressRepository.save(a2);
        addressRepository.save(a3);










    }
}