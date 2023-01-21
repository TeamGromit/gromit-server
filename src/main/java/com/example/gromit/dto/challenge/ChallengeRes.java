package com.example.gromit.dto.challenge;

import com.example.gromit.entity.Challenge;
import com.example.gromit.entity.UserAccount;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class ChallengeRes {
    private final UserAccount userAccount;
    private final String title;
    private final LocalDate startDate;
    private final LocalDate endDate;
    private final int goal;
    private final int recruits;
    private final boolean isPassword;

    public ChallengeRes(Challenge challenge) {
        this.userAccount = challenge.getUserAccount();
        this.title = challenge.getTitle();
        this.startDate = challenge.getStartDate();
        this.endDate = challenge.getEndDate();
        this.goal = challenge.getGoal();
        this.recruits = challenge.getRecruits();
        this.isPassword = challenge.isPassword();
    }
}
