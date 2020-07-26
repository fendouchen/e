package com.example.demo.Entity;


import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;

/**
 * @Description Description
 * @Author Coder
 * @Date Created in 2020/1/7
 */
@Data
@Entity
@Table(name="user")
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="password")
    private String password;


}
