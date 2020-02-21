package com.enigma.mandiri.dto;

import com.enigma.mandiri.model.Blood;
import com.enigma.mandiri.model.Order;

import java.util.List;

public class DonorDto {

    private String id;

    private String name;

    private Integer age;

    private String gender;

    private String phone;

    private String email;

    private String address;

    private Blood bloodGroups;

    private List<Order> donorOrder;

    public DonorDto() {
    }

    public DonorDto(String id, String name, Integer age, String gender, String phone, String email, String address, Blood bloodGroups, List<Order> donorOrder) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.bloodGroups = bloodGroups;
        this.donorOrder = donorOrder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Blood getBloodGroups() {
        return bloodGroups;
    }

    public void setBloodGroups(Blood bloodGroups) {
        this.bloodGroups = bloodGroups;
    }

    public List<Order> getDonorOrder() {
        return donorOrder;
    }

    public void setDonorOrder(List<Order> donorOrder) {
        this.donorOrder = donorOrder;
    }
}
