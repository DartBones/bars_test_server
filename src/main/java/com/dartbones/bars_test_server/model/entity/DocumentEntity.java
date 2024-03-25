package com.dartbones.bars_test_server.model.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity(name = "documents")
@EqualsAndHashCode(of = {"recId", "number"})
public class DocumentEntity {

    @Id
    @Column(
        length = 1024,
        unique = true,
        name = "rec_id",
        nullable = false
    )
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String recId;

    @Column(name = "number", unique = true, nullable = false)
    private Integer number;

    @Column(name = "`date`", nullable = false)
    private LocalDateTime date;

    @Column(name = "update_date")
    private LocalDateTime updateDateTime;

    @PrePersist
    void onCreate() {
        this.date = LocalDateTime.now();
    }

    @PreUpdate
    void onUpdate() {
        this.updateDateTime = LocalDateTime.now();
    }
}