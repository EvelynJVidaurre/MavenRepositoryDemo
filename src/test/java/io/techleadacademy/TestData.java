package io.techleadacademy;

import com.github.javafaker.Faker;
import com.github.javafaker.PhoneNumber;

public class TestData {
    Faker faker = new Faker();

    public String firstname(){
        return faker.name().firstName();
    }

    public  String lastname(){
        return faker.name().lastName();
        }

    public String phoneNumbers(){
        return faker.phoneNumber().phoneNumber();
    }

    public  String address(){
        return faker.address().fullAddress();
}
}
