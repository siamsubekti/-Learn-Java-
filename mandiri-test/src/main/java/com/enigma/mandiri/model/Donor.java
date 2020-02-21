package com.enigma.mandiri.model;

import com.enigma.mandiri.constant.Constant;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = Constant.DONOR)
public class Donor {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Column
    private String name;

    @Column
    private Integer age;

    @Column
    private String gender;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String address;

    @ManyToOne
    @JoinColumn(name = Constant.BLOOD_ID)
    private Blood bloodGroups;

    @JsonIgnore
    @OneToMany(mappedBy = "donorId")
    private List<Order> donorOrder;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donor donor = (Donor) o;
        return Objects.equals(id, donor.id) &&
                Objects.equals(name, donor.name) &&
                Objects.equals(age, donor.age) &&
                Objects.equals(gender, donor.gender) &&
                Objects.equals(phone, donor.phone) &&
                Objects.equals(email, donor.email) &&
                Objects.equals(address, donor.address) &&
                Objects.equals(bloodGroups, donor.bloodGroups) &&
                Objects.equals(donorOrder, donor.donorOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, gender, phone, email, address, bloodGroups, donorOrder);
    }
}
