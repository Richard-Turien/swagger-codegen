package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;


import io.swagger.model.Pet;
<<<<<<< HEAD
import io.swagger.model.InlineResponse200;
=======
import io.swagger.model.ApiResponse;
>>>>>>> upstream/master
import java.io.File;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

<<<<<<< HEAD
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-03-16T14:27:58.108+08:00")
public abstract class PetApiService {
  
      public abstract Response addPet(Pet body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response deletePet(Long petId,String apiKey,SecurityContext securityContext)
=======
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2016-04-15T18:10:39.667+08:00")
public abstract class PetApiService {
      public abstract Response addPet(Pet body,SecurityContext securityContext)
>>>>>>> upstream/master
      throws NotFoundException;
      public abstract Response deletePet(Long petId,String apiKey,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findPetsByStatus(List<String> status,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findPetsByTags(List<String> tags,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getPetById(Long petId,SecurityContext securityContext)
      throws NotFoundException;
<<<<<<< HEAD
  
      public abstract Response getPetByIdInObject(Long petId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response petPetIdtestingByteArraytrueGet(Long petId,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response updatePet(Pet body,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response updatePetWithForm(String petId,String name,String status,SecurityContext securityContext)
      throws NotFoundException;
  
      public abstract Response uploadFile(MultipartFormDataInput input,Long petId,SecurityContext securityContext)
      throws NotFoundException;
  
=======
      public abstract Response updatePet(Pet body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updatePetWithForm(Long petId,String name,String status,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response uploadFile(MultipartFormDataInput input,Long petId,SecurityContext securityContext)
      throws NotFoundException;
>>>>>>> upstream/master
}
