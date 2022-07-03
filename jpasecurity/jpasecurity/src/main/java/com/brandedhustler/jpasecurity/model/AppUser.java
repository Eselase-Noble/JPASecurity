package com.brandedhustler.jpasecurity.model;

/*
 * @Author: BrandedHustler
 * @Version: 1.0.0
 * @since: 03/07/2022

 */

import lombok.*;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.FetchType.EAGER;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AppUser {


    @Id
    @SequenceGenerator(
            name = "app_user_sequence",
            sequenceName = "app_user_sequence",
            allocationSize = 1,
            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "app_user_sequence"
    )
    @Column(nullable = false, updatable = false)
    private Long userId;
    private String name;
    private String username;
    private String password;
    @ManyToMany(fetch = EAGER)
    private Collection<UserRole> userRoles = new ArrayList<>();

}
