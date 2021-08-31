package com.pantofit.client.entities;
import javax.persistence.*;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import java.util.Set;
@Entity
@AllArgsConstructor @NoArgsConstructor @ToString
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 75)
    private String Code;
    @Column(length = 75)
    private String first_name;
    @Column(length = 75)
    private String last_name;
    private Date birthday;
    @Column(length = 75)
    private String email;
    private String phonenumber;
    @Column(length = 285)
    private String address;
    private String photo;

}