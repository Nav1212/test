package com.fullstack.Medichaintest.roles;
import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Privilege {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    //private Collection<Privilege> Privileges;


    @ManyToMany(mappedBy = "Privileges")
    private Collection<Role> roles;


    public Privilege(String name) {
        this.name = name;
    }

    public Privilege() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
