package com.dartbones.bars_test_server.model.payload;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
public class DocumentsResponse {
    private List<DocumentJson> documents;
}