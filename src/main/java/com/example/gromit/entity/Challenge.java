package com.example.gromit.entity;

import com.example.gromit.base.BaseEntity;
import lombok.*;
import org.apache.catalina.User;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@DynamicInsert
@DynamicUpdate
@Getter
@ToString
@Entity
public class Challenge extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private UserAccount userAccount;

    @OneToMany
    private List<Member> members = new LinkedList<>();

    private Long userId;

    @Column(nullable = false,length =50)
    private String title;

    @Column(nullable = false)
    private LocalDateTime startDate;
    @Column(nullable = false)
    private LocalDateTime endDate;

    @Column(nullable = false)
    private int goal;

    @Column(nullable = false)
    private int recruits;

    @Column(nullable = false)
    private boolean isPassword;

    private String password;

    @Builder
    public Challenge(UserAccount userAccount, String title, LocalDateTime startDate, LocalDateTime endDate, int goal, int recruits, boolean isPassword, String password) {
        this.userAccount = userAccount;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.goal = goal;
        this.recruits = recruits;
        this.isPassword = isPassword;
        this.password = password;
    }

    @Builder
    public Challenge(Long userAccountId, String title, LocalDateTime startDate, LocalDateTime endDate, int goal, int recruits, boolean isPassword, String password) {
        this.userId= userAccountId;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.goal = goal;
        this.recruits = recruits;
        this.isPassword = isPassword;
        this.password = password;
    }
}
