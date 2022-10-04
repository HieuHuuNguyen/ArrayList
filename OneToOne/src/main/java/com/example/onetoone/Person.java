package com.example.onetoone;

import lombok.Builder;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Hibernate entity
    @Data // Lombok
    @Builder // Lombok
    public class Person { //Table person

        @Id // Đánh dấu trường này là primary key
        @GeneratedValue(strategy = GenerationType.IDENTITY) // Tự động tăng giá trị id
        private Long id;
        private String name;

    public Person(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person() {

    }
}
