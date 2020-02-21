package com.enigma.mandiri.model;

import com.enigma.mandiri.constant.Constant;
import com.enigma.mandiri.constant.MappedBy;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = Constant.RECEPTION)
public class Reception {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String address;

    @JsonIgnore
    @OneToMany(mappedBy = MappedBy.RECEPTION_ID)
    private List<Order> orderReception;

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

    public List<Order> getOrderReception() {
        return orderReception;
    }

    public void setOrderReception(List<Order> orderReception) {
        this.orderReception = orderReception;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reception reception = (Reception) o;
        return Objects.equals(id, reception.id) &&
                Objects.equals(name, reception.name) &&
                Objects.equals(phone, reception.phone) &&
                Objects.equals(email, reception.email) &&
                Objects.equals(address, reception.address) &&
                Objects.equals(orderReception, reception.orderReception);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, email, address, orderReception);
    }
}
