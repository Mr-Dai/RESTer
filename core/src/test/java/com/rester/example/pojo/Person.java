package com.rester.example.pojo;

import com.rester.annotation.Attribute;
import com.rester.annotation.Id;
import com.rester.annotation.RestResource;

import java.time.LocalDate;

/**
 * Example person information POJO with public fields.
 */
@RestResource
public class Person {

    @Id @Attribute public String id;
    @Attribute public String name;
    @Attribute public LocalDate birthDate;
    @Attribute public String address;
    @Attribute public String phoneNum;
    @Attribute public Gender gender;

}
