package com.rester.example.pojo;

import com.rester.annotations.Attribute;
import com.rester.annotations.Id;
import com.rester.annotations.Resource;

import java.time.LocalDate;

/**
 * Example person information POJO with public fields.
 */
@Resource
public class Person {

    @Id @Attribute public String id;
    @Attribute public String name;
    @Attribute public LocalDate birthDate;
    @Attribute public String address;
    @Attribute public String phoneNum;
    @Attribute public Gender gender;

}
