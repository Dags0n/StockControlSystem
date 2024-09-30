package com.stock_control_system.stock_control_system.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;
    private String email;
    private String password;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private RoleEntity roleEntityId;

    public UserEntity() {
    }

    public UserEntity(String name, String password, String email, RoleEntity roleEntityId) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.roleEntityId = roleEntityId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleEntity getRoleId() {
        return roleEntityId;
    }

    public void setRoleId(RoleEntity roleEntityId) {
        this.roleEntityId = roleEntityId;
    }
}
