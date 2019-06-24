package com.artiushenko.socnet.entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "t_family_status")
public class FamilyStatus extends AbstractPersistable<Long> {

    @Column (length = 120, name = "status")
    private String familyStatus;

    public String getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(String familyStatus) {
        this.familyStatus = familyStatus;
    }
}
