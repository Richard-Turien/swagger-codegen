package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import io.swagger.model.Pet;
import io.swagger.model.ModelApiResponse;
import java.io.File;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2016-10-06T16:59:45.939+01:00")
public interface PetApiService {
      public Response addPet(Pet body, SecurityContext securityContext);
      public Response deletePet(Long petId, String apiKey, SecurityContext securityContext);
      public Response findPetsByStatus(List<String> status, SecurityContext securityContext);
      public Response findPetsByTags(List<String> tags, SecurityContext securityContext);
      public Response getPetById(Long petId, SecurityContext securityContext);
      public Response updatePet(Pet body, SecurityContext securityContext);
      public Response updatePetWithForm(Long petId, String name, String status, SecurityContext securityContext);
      public Response uploadFile(Long petId, String additionalMetadata, InputStream fileInputStream, Attachment fileDetail, SecurityContext securityContext);
}
