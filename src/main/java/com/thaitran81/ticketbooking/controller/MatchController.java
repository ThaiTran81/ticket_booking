package com.thaitran81.ticketbooking.controller;

import com.thaitran81.ticketbooking.model.dto.response.MatchDetailResponse;
import com.thaitran81.ticketbooking.model.enums.MatchStatus;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ThaiTran81
 * @since 04/01/2025
 */
@RestController
@RequestMapping("/api/v1/matches")
@Slf4j
public class MatchController {

    @GetMapping("/{id}")
    public ResponseEntity<MatchDetailResponse> getMatch(@PathVariable Long id) {
        log.info("Fetching match details for id: {}", id);
        return ResponseEntity.ok(MatchDetailResponse.builder().status(MatchStatus.COMPLETED).build());
    }
}
