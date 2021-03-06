package org.cloneeverytime.domain.post;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false)
    private String emailId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private java.time.LocalTime registeredDate;

    @Column(nullable = false)
    private int removedAccount;

    private java.time.LocalTime removedDate;







}
