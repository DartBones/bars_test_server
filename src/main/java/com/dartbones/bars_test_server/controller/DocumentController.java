package com.dartbones.bars_test_server.controller;

import com.dartbones.bars_test_server.model.entity.DocumentEntity;
import com.dartbones.bars_test_server.model.payload.*;
import com.dartbones.bars_test_server.service.DocumentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1/documents")
class DocumentController {
    private final DocumentService documentService;

    DocumentController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/all")
    public DocumentsResponse getAll() {
        final var documentEntityList = this.documentService.getAll();
        return this.createResponse(documentEntityList);
    }

    private DocumentsResponse createResponse(List<DocumentEntity> entities) {
        final var documentPayloadList = entities.stream().map(this::mapEntityToJson).collect(Collectors.toList());
        return new DocumentsResponse(documentPayloadList);
    }

    private DocumentJson mapEntityToJson(DocumentEntity entity) {
        return new DocumentJson(entity.getNumber(), entity.getDate(), entity.getUpdateDateTime());
    }
}