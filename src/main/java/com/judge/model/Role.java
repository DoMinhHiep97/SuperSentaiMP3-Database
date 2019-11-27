package com.judge.model;

import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="roles")
public class Role {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;

    @Enumerated(EnumType.STRING)
    @NaturalId
    @Column(length = 60)
    private String roleName;
    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
