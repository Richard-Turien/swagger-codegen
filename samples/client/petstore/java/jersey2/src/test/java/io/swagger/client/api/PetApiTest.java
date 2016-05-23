package io.swagger.client.api;

import org.junit.Test;

import java.io.File;
import java.util.List;

import io.swagger.client.ApiException;
import io.swagger.client.model.Pet;

/**
 * API tests for PetApi
 */
public class PetApiTest {

    private final PetApi api = new PetApi();


    /**
     * Add a new pet to the store
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addPetTest() throws ApiException {
        Pet body = null;
        // api.addPet(body);

        // TODO: test validations
    }

    /**
     * Deletes a pet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deletePetTest() throws ApiException {
        Long petId = null;
        String apiKey = null;
        // api.deletePet(petId, apiKey);

        // TODO: test validations
    }

    /**
     * Finds Pets by status
     *
     * Multiple status values can be provided with comma separated strings
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findPetsByStatusTest() throws ApiException {
        List<String> status = null;
        // List<Pet> response = api.findPetsByStatus(status);

        // TODO: test validations
    }

    /**
     * Finds Pets by tags
     *
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for
     * testing.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void findPetsByTagsTest() throws ApiException {
        List<String> tags = null;
        // List<Pet> response = api.findPetsByTags(tags);

        // TODO: test validations
    }

    /**
     * Find pet by ID
     *
     * Returns a single pet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPetByIdTest() throws ApiException {
        Long petId = null;
        // Pet response = api.getPetById(petId);

        // TODO: test validations
    }

    /**
     * Update an existing pet
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePetTest() throws ApiException {
        Pet body = null;
        // api.updatePet(body);

        // TODO: test validations
    }

    /**
     * Updates a pet in the store with form data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updatePetWithFormTest() throws ApiException {
        Long petId = null;
        String name = null;
        String status = null;
        // api.updatePetWithForm(petId, name, status);

        // TODO: test validations
    }

    /**
     * uploads an image
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadFileTest() throws ApiException {
        Long petId = null;
        String additionalMetadata = null;
        File file = null;
        // ModelApiResponse response = api.uploadFile(petId, additionalMetadata, file);

        // TODO: test validations
    }

}
