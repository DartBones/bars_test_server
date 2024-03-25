package com.dartbones.bars_test_server.service;

import com.dartbones.bars_test_server.model.entity.DocumentEntity;
import com.dartbones.bars_test_server.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {
    private final DocumentRepository documentRepository;

    @Override
    public List<DocumentEntity> getAll() {
        return this.documentRepository.findAll();
    }
}