package com.enigma.mandiri.model;

import com.enigma.mandiri.constant.Constant;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = Constant.ORDER)
public class Order {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Column
    private Date date;

    @ManyToOne
    @JoinColumn(name = Constant.DONOR_ID)
    private Donor donorId;

    @ManyToOne
    @JoinColumn(name = Constant.RECEPTION_ID)
    private Reception receptionId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Donor getDonorId() {
        return donorId;
    }

    public void setDonorId(Donor donorId) {
        this.donorId = donorId;
    }

    public Reception getReceptionId() {
        return receptionId;
    }

    public void setReceptionId(Reception receptionId) {
        this.receptionId = receptionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(date, order.date) &&
                Objects.equals(donorId, order.donorId) &&
                Objects.equals(receptionId, order.receptionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, donorId, receptionId);
    }
}
