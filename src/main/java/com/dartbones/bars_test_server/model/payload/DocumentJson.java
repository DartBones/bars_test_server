package com.dartbones.bars_test_server.model.payload;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public class DocumentJson {

    private Integer number;

    @JsonFormat(
        shape = JsonFormat.Shape.STRING,
        pattern = "dd.MM.yyyy HH:mm:ss"
    )
    private LocalDateTime date;

    @JsonFormat(
        shape = JsonFormat.Shape.STRING,
        pattern = "dd.MM.yyyy HH:mm:ss"
    )
    private LocalDateTime updateDate;

    public DocumentJson(Integer number, LocalDateTime date, LocalDateTime updateDate) {
        this.number = number;
        this.date = date;
        this.updateDate = updateDate;
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

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }
}
