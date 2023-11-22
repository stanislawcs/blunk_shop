package com.example.blunk.code.domain;

import com.example.blunk.code.domain.system.SystemRoles;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
@NoArgsConstructor
@ToString
public class Role {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private SystemRoles name = SystemRoles.ROLE_USER;

    @ManyToMany(mappedBy = "roles")
    @ToString.Exclude
    private List<User> users;
}
