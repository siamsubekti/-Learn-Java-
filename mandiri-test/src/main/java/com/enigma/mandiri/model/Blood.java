package com.enigma.mandiri.model;


import com.enigma.mandiri.constant.Constant;
import com.enigma.mandiri.constant.MappedBy;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = Constant.BLOOD)
public class Blood {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Column(name = Constant.BLOOD_GROUP)
    private String bloodGroup;

    @JsonIgnore
    @OneToMany(mappedBy = MappedBy.BLOOD_GROUPS)
    private List<Donor> bloods;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public List<Donor> getBloods() {
        return bloods;
    }

    public void setBloods(List<Donor> bloods) {
        this.bloods = bloods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blood blood = (Blood) o;
        return Objects.equals(id, blood.id) &&
                Objects.equals(bloodGroup, blood.bloodGroup) &&
                Objects.equals(bloods, blood.bloods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bloodGroup, bloods);
    }
}
