package com.thaitran81.ticketbooking.model.entity;

import java.time.LocalDateTime;

import com.thaitran81.ticketbooking.model.enums.SessionStatus;
import com.thaitran81.ticketbooking.model.enums.SkillLevel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ThaiTran81
 * @since 05/01/2025
 */
// Court Session Entity
@Entity
@Table(name = "court_sessions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CourtSession extends BaseEntity {
    @Column(nullable = false)
    private String location;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "end_time", nullable = false)
    private LocalDateTime endTime;

    @Column(name = "max_players", nullable = false)
    private Integer maxPlayers;

    @Enumerated(EnumType.STRING)
    @Column(name = "min_skill_level", nullable = false)
    private SkillLevel minSkillLevel;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SessionStatus status = SessionStatus.PENDING;
}
