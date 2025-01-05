package com.thaitran81.ticketbooking.model.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author ThaiTran81
 * @since 05/01/2025
 */
@Entity
@Table(name = "player_stats")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PlayerStats extends BaseEntity {
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "total_matches", nullable = false)
    private Integer totalMatches = 0;

    @Column(name = "total_play_time", nullable = false)
    private Integer totalPlayTime = 0;

    @Column(name = "win_count", nullable = false)
    private Integer winCount = 0;

    @Column(name = "lose_count", nullable = false)
    private Integer loseCount = 0;

    @Column(name = "last_played_at")
    private LocalDateTime lastPlayedAt;
}
