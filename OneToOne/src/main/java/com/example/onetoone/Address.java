package com.example.onetoone;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    private String city;
    private String province;

    @OneToOne // Đánh dấu có mỗi quan hệ 1-1 với Person ở phía dưới
    @JoinColumn(name = "person_id") // Liên kết với nhau qua khóa ngoại person_id
    private Person person;

    public Address(Long id, String city, String province, Person person) {
        this.id = id;
        this.city = city;
        this.province = province;
        this.person = person;
    }
}
