package com.yun.fieta_b.etf.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@Entity
public class EtfPeriodPerformance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "etf_id", nullable = false)
    private Etf etf;

    @Column(nullable = true)
    private Double weeklyReturn;

    @Column(nullable = true)
    private Double monthlyReturn;

    @Column(nullable = true)
    private Double quarterlyReturn;  // 분기

    @Column(nullable = true)
    private Double halfYearReturn;  // 반년

    @Column(nullable = true)
    private Double annualReturn;

    @Column(nullable = true)
    private Double twoYearReturn;

    @Column(nullable = true)
    private Double threeYearReturn;

    @Column(nullable = true)
    private Double fourYearReturn;

    @Column(nullable = true)
    private Double fiveYearReturn;

    @Column(nullable = false)
    private LocalDate date;

}