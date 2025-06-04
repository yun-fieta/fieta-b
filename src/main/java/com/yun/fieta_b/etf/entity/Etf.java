package com.yun.fieta_b.etf.entity;

import com.yun.fieta_b.etf.enums.EtfTheme;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import java.time.LocalDate;
import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
@Getter
@Entity
public class Etf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String etfName;

    @Column(nullable = false, unique = true)
    private String etfCode;

    @Column(nullable = false)
    private String etfManagementCompany;

    @Column(nullable = false)
    private LocalDate etfListingDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EtfTheme etfTheme;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate
    private LocalDateTime updatedAt;

}