package com.dartbones.bars_test_server.model.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "documents")
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

    public DocumentEntity() {}

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDateTime getUpdateDateTime() {
        return updateDateTime;
    }

    public void setUpdateDateTime(LocalDateTime updateDateTime) {
        this.updateDateTime = updateDateTime;
    }

    @PrePersist
    void onCreate() {
        this.date = LocalDateTime.now();
    }

    @PreUpdate
    void onUpdate() {
        this.updateDateTime = LocalDateTime.now();
    }
}