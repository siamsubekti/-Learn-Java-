package com.enigma.mandiri.dto;

import com.enigma.mandiri.model.Donor;

import java.util.List;

public class BloodDto {

    private String id;

    private String bloodGroup;

    private List<Donor> bloods;

    public BloodDto() {
    }

    public BloodDto(String id, String bloodGroup, List<Donor> bloods) {
        this.id = id;
        this.bloodGroup = bloodGroup;
        this.bloods = bloods;
    }

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
}
