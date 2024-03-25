package com.dartbones.bars_test_server.model.payload;

import java.util.List;

public class DocumentsResponse {
    private List<DocumentJson> documents;

    public DocumentsResponse(List<DocumentJson> documents) {
        this.documents = documents;
    }

    public List<DocumentJson> getDocuments() {
        return documents;
    }

    public void setDocuments(List<DocumentJson> documents) {
        this.documents = documents;
    }
}