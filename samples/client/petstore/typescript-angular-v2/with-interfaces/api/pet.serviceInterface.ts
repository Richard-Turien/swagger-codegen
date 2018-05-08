/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at [http://swagger.io](http://swagger.io) or on [irc.freenode.net, #swagger](http://swagger.io/irc/).  For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
import { Headers }                                           from '@angular/http';

import { Observable }                                    from 'rxjs/Observable';

import { ApiResponse } from '../model/apiResponse';
import { Pet } from '../model/pet';


import { Configuration }                                     from '../configuration';


export interface PetServiceInterface {
    defaultHeaders: Headers;
    configuration: Configuration;
    [others: string]: any;

    /**
    * Add a new pet to the store
    * 
    * @param body Pet object that needs to be added to the store
    */
    addPet(body: Pet, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Deletes a pet
    * 
    * @param petId Pet id to delete
    * @param apiKey 
    */
    deletePet(petId: number, apiKey?: string, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Finds Pets by status
    * Multiple status values can be provided with comma separated strings
    * @param status Status values that need to be considered for filter
    */
    findPetsByStatus(status: Array<'available' | 'pending' | 'sold'>, extraHttpRequestParams?: any): Observable<Array<Pet>>;

    /**
    * Finds Pets by tags
    * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
    * @param tags Tags to filter by
    */
    findPetsByTags(tags: Array<string>, extraHttpRequestParams?: any): Observable<Array<Pet>>;

    /**
    * Find pet by ID
    * Returns a single pet
    * @param petId ID of pet to return
    */
    getPetById(petId: number, extraHttpRequestParams?: any): Observable<Pet>;

    /**
    * Update an existing pet
    * 
    * @param body Pet object that needs to be added to the store
    */
    updatePet(body: Pet, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * Updates a pet in the store with form data
    * 
    * @param petId ID of pet that needs to be updated
    * @param name Updated name of the pet
    * @param status Updated status of the pet
    */
    updatePetWithForm(petId: number, name?: string, status?: string, extraHttpRequestParams?: any): Observable<{}>;

    /**
    * uploads an image
    * 
    * @param petId ID of pet to update
    * @param additionalMetadata Additional data to pass to server
    * @param file file to upload
    */
    uploadFile(petId: number, additionalMetadata?: string, file?: Blob, extraHttpRequestParams?: any): Observable<ApiResponse>;

}
