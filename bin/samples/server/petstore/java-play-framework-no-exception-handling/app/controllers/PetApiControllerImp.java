package controllers;

import java.io.InputStream;
import apimodels.ModelApiResponse;
import apimodels.Pet;

import java.util.List;
import java.util.ArrayList;

import com.fasterxml.jackson.databind.ObjectMapper;
import javax.inject.Inject;
import javax.validation.constraints.*;

public class PetApiControllerImp implements PetApiControllerImpInterface {

    private final ObjectMapper mapper;

    @Inject
    private PetApiControllerImp() {
        mapper = new ObjectMapper();
    }

    @Override
    public void addPet(Pet body)  {
        //Do your magic!!!
        
    }

    @Override
    public void deletePet(Long petId, String apiKey)  {
        //Do your magic!!!
        
    }

    @Override
    public List<Pet> findPetsByStatus( @NotNull List<String> status)  {
        //Do your magic!!!
        String accept = request().getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            return mapper.readValue("", List.class);
        }
        String accept = request().getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return mapper.readValue("", List.class);
        }
        return new ArrayList<Pet>();
    }

    @Override
    public List<Pet> findPetsByTags( @NotNull List<String> tags)  {
        //Do your magic!!!
        String accept = request().getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            return mapper.readValue("", List.class);
        }
        String accept = request().getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return mapper.readValue("", List.class);
        }
        return new ArrayList<Pet>();
    }

    @Override
    public Pet getPetById(Long petId)  {
        //Do your magic!!!
        String accept = request().getHeader("Accept");
        if (accept != null && accept.contains("application/xml")) {
            return mapper.readValue("", Pet.class);
        }
        String accept = request().getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return mapper.readValue("", Pet.class);
        }
        return new Pet();
    }

    @Override
    public void updatePet(Pet body)  {
        //Do your magic!!!
        
    }

    @Override
    public void updatePetWithForm(Long petId, String name, String status)  {
        //Do your magic!!!
        
    }

    @Override
    public ModelApiResponse uploadFile(Long petId, String additionalMetadata, Http.MultipartFormData.FilePart file)  {
        //Do your magic!!!
        String accept = request().getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return mapper.readValue("", ModelApiResponse.class);
        }
        return new ModelApiResponse();
    }

}
