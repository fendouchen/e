package com.example.demo.LoginJpa;

import com.example.demo.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Description Description
 * @Author Coder
 * @Date Created in 2020/1/7
 */
public interface LoginJpa extends JpaRepository<UserEntity,Long> {
}
