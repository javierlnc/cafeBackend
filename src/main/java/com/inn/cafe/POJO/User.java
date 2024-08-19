package com.inn.cafe.POJO;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.io.Serializable;

@Data
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id", nullable = false, updatable= false)
    private  Integer id;

    @Column(name = "name", nullable = false)
    private  String name;

    @Column(name="contac_number",nullable = false)
    private String contacNumber;

    @Column(name="email",nullable = false,unique = true)
    private  String email;

    @Column( name = "password", nullable = false)
    private String password;
    @Column (name="status", nullable = false)
    private String status;

    @Column (name="role", nullable = false)
    private String role;





}
