package com.brandedhustler.jpasecurity.model;


/*
 * @Author: BrandedHustler
 * @Version: 1.0.0
 * @since: 03/07/2022

 */


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRole {

    @Id
    @SequenceGenerator(
            name = "user_role_sequence",
            sequenceName = "user_role_sequence",
            allocationSize = 1,
            initialValue = 1000
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_role_sequence"
    )
    @Column(nullable = false, updatable = false)
    private Long roleId;
    private String roleName;
}
