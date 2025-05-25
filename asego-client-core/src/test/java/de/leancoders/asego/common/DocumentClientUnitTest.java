package de.leancoders.asego.common;

import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.client.services.AsegoClientService;
import de.leancoders.asego.common.model.document.EDocumentField;
import de.leancoders.asego.common.request.document.DocumentOrderItem;
import de.leancoders.asego.common.request.document.DocumentSearchFilter;
import de.leancoders.asego.common.request.document.DocumentUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.document.DocumentResponse;
import de.leancoders.asego.common.response.document.DocumentSearchResponse;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;

@Log4j2
public class DocumentClientUnitTest {

    private static final String USERNAME = "test";
    private static final String PASSWORD = "XxyL8X1GT6";
    private static final UUID KUNDEN_UID = UUID.fromString("53290761-F5D4-4990-AAB2-0CDEAEF30325");
    private static final UUID DOKUMENT_UID = UUID.fromString("D4F66BBD-27C1-4E68-B86F-67BBDC697F69");
    private static final String DOKUMENT_NAME = "TestDocument.pdf";
    private static final String DOKUMENT_TYPE = "pdf";

    

    public static final AsegoConfig ASEGO_CONFIG_DEFAULT = AsegoConfig.of(
            "https://localhost/",
            444);

    private AsegoClientService clientService;
    
    private String loadBase64FromResource(String filename) throws Exception {
        return Files.readString(Paths.get("src/test/resources/" + filename));
    }

    @BeforeEach
    public void setUp() {
        clientService = new AsegoClientService(ASEGO_CONFIG_DEFAULT);
        clientService.login(USERNAME, PASSWORD);
    }

    @Test
    public void test_documents_search() {
        DocumentSearchFilter searchFilter = DocumentSearchFilter.of();

        final DocumentSearchResponse documents = clientService
                .documents()
                .search(KUNDEN_UID, null, 0, 10, searchFilter);

        System.out.println("documents = " + documents);
    }

    @Test
    public void test_documents_getById() {
        final DocumentResponse document = clientService
                .documents()
                .getById(KUNDEN_UID, DOKUMENT_UID);

        System.out.println("document = " + document);
    }

    @Test
    public void test_documents_update() throws Exception {
        String base64Data = loadBase64FromResource("test-document-base64.txt");
        DocumentUpdateRequest documentUpdateRequest = DocumentUpdateRequest.of(
                DOKUMENT_NAME,
                DOKUMENT_TYPE,
                base64Data
        );


        clientService
                .documents()
                .update(KUNDEN_UID, DOKUMENT_UID, documentUpdateRequest);
    }

   

    @Test
    public void test_documents_create() throws Exception {
        String base64Data = loadBase64FromResource("test-document-base64.txt");
        DocumentUpdateRequest documentUpdateRequest = DocumentUpdateRequest.of(
                DOKUMENT_NAME,
                DOKUMENT_TYPE,
                base64Data
        );


        final CreatedElementResponse document = clientService
                .documents()
                .create(KUNDEN_UID, documentUpdateRequest);

        System.out.println("document = " + document);
    }

    @Test
    public void test_documents_searchWithOrdering() {
        DocumentSearchFilter searchFilter = DocumentSearchFilter.of();

        // Create ordering parameters
        List<DocumentOrderItem> orderBy = new ArrayList<>();
        orderBy.add(DocumentOrderItem.of(EDocumentField.FILE_NAME, true)); // Replace "name" with actual document field if needed

        // Execute search with ordering
        final DocumentSearchResponse documents = clientService
                .documents()
                .search(KUNDEN_UID, null, 0, 10, orderBy, searchFilter);

        System.out.println("Ordered documents search result = " + documents);
    }
}