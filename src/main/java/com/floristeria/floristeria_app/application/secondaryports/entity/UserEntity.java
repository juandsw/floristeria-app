package com.floristeria.floristeria_app.application.secondaryports.entity;

import com.floristeria.floristeria_app.crosscutting.helpers.TextHelper;
import com.floristeria.floristeria_app.crosscutting.helpers.UUIDHelper;
import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.UUID;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(name = "id")
    private UUID id;

    @Column(name = "documento")
    private String documento;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    public UserEntity() {
        setId(UUIDHelper.getDefault());
        setDocumento(TextHelper.EMPTY);
        setName(TextHelper.EMPTY);
        setEmail(TextHelper.EMPTY);
        setPassword(TextHelper.EMPTY);
    }

    public UserEntity(final UUID id, final String documento, final String name, final String email, final String password) {
        setId(id);
        setDocumento(documento);
        setName(name);
        setEmail(email);
        setPassword(password);
    }

    public static UserEntity create(){
        return new UserEntity();
    }

    public static UserEntity create(final UUID id, final String documento, final String name, final String email, final String password){
        return new UserEntity(id, documento, name, email, password);
    }

    public UUID getId() {
        return id;
    }

    public UserEntity setId(UUID id) {
        this.id = UUIDHelper.getDefault(id, UUIDHelper.getDefault());
        return this;
    }

    public String getDocumento() {
        return documento;
    }

    public UserEntity setDocumento(String documento) {
        this.documento = TextHelper.applyTrim(documento);
        return this;
    }

    public String getName() {
        return name;
    }

    public UserEntity setName(String name) {
        this.name = TextHelper.applyTrim(name);
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = TextHelper.applyTrim(email);
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = TextHelper.applyTrim(password);
        return this;
    }

}
