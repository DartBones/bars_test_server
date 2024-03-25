package com.dartbones.bars_test_server.service;

import com.dartbones.bars_test_server.model.entity.DocumentEntity;

import java.util.List;

public interface DocumentService {
    List<DocumentEntity> getAll();
}
