package com.dartbones.bars_test_server.model.payload;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
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
}
