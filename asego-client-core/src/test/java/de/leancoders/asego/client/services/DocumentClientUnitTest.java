package de.leancoders.asego.client.services;

import de.leancoders.asego.AbstractTest;
import de.leancoders.asego.client.model.internal.AsegoConfig;
import de.leancoders.asego.common.model.document.EDocumentField;
import de.leancoders.asego.common.request.document.DocumentOrderItem;
import de.leancoders.asego.common.request.document.DocumentSearchFilter;
import de.leancoders.asego.common.request.document.DocumentUpdateRequest;
import de.leancoders.asego.common.response.CreatedElementResponse;
import de.leancoders.asego.common.response.document.DocumentResponse;
import de.leancoders.asego.common.response.document.DocumentSearchResponse;
import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Log4j2
public class DocumentClientUnitTest extends AbstractTest {

    @Override
    public AsegoConfig asegoConfig() {
        return ASEGO_CONFIG_DEV;
    }

    private static final UUID CUSTOMER_UID = UUID.fromString("53290761-F5D4-4990-AAB2-0CDEAEF30325");
    private static final UUID DOCUMENT_UID = UUID.fromString("D4F66BBD-27C1-4E68-B86F-67BBDC697F69");
    private static final String DOCUMENT_NAME = "TestDocument.pdf";
    private static final String DOCUMENT_TYPE = "pdf";


    @NonNull
    private String loadBase64FromResource(@NonNull final String filename) throws Exception {
        return Files.readString(Paths.get("src/test/resources/" + filename));
    }

    @Test
    public void test_documents_search() {
        DocumentSearchFilter searchFilter = DocumentSearchFilter.of();

        final DocumentSearchResponse documents = clientService
                .documents()
            .search(CUSTOMER_UID, null, 0, 10, searchFilter);

        System.out.println("documents = " + documents);
    }

    @Test
    public void test_documents_getById() {
        final DocumentResponse document =
            clientService
                .documents()
                .getById(CUSTOMER_UID, DOCUMENT_UID);

        System.out.println("document = " + document);
    }

    @Test
    public void test_documents_update() throws Exception {
        final String base64Data = loadBase64FromResource("test-document-base64.txt");
        final DocumentUpdateRequest documentUpdateRequest = DocumentUpdateRequest.of(
            DOCUMENT_NAME,
            DOCUMENT_TYPE,
            base64Data
        );

        final String update = clientService
            .documents()
            .update(CUSTOMER_UID, DOCUMENT_UID, documentUpdateRequest);

        System.out.println("update = " + update);
    }

   

    @Test
    public void test_documents_create() throws Exception {
        String base64Data = loadBase64FromResource("test-document-base64.txt");
        DocumentUpdateRequest documentUpdateRequest = DocumentUpdateRequest.of(
            DOCUMENT_NAME,
            DOCUMENT_TYPE,
                base64Data
        );


        final CreatedElementResponse document = clientService
                .documents()
            .create(CUSTOMER_UID, documentUpdateRequest);

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
            .search(CUSTOMER_UID, null, 0, 10, orderBy, searchFilter);

        System.out.println("Ordered documents search result = " + documents);
    }
}