package com.example.onetoone;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class OneToOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(OneToOneApplication.class, args);
    }

    // Sử dụng @RequiredArgsConstructor và final để thay cho @Autowired
    private final PersonRepository personRepository;
    private final AddressRepository addressRepository;

    public void run(String... args) throws Exception {
        // Tạo ra đối tượng person
        Person person = Person.builder()
                .name("loda")
                .build();
        // Lưu vào db
        personRepository.save(person);

        // Tạo ra đối tượng Address có tham chiếu tới person
        Address address = Address.builder()
                .city("Hanoi")
                .person(person)
                .build();

        // Lưu vào db
        addressRepository.save(address);
    }

}
