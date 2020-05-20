package com.m.g.ui.jpa.model;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@Table(name = "user", schema = "public")
public class UserEntity implements Serializable {

    @Id
    @Column(name = "user_id")
    private Long id;

   @Column(name = "user_name")
    private String name;

    @Column(name = "user_email")
    private String email;


}