/**
 * Swagger Petstore
 * This is a sample server Petstore server.  You can find out more about Swagger at <a href=\"http://swagger.io\">http://swagger.io</a> or on irc.freenode.net, #swagger.  For this sample, you can use the api key \"special-key\" to test the authorization filters
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@wordnik.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import { Inject, Injectable, Optional }                      from '@angular/core';
import { Http, Headers, URLSearchParams }                    from '@angular/http';
import { RequestMethod, RequestOptions, RequestOptionsArgs } from '@angular/http';
import { Response, ResponseContentType }                     from '@angular/http';

import { Observable }                                        from 'rxjs/Observable';
import 'rxjs/add/operator/map';

import * as models                                           from '../model/models';
import { BASE_PATH }                                         from '../variables';

/* tslint:disable:no-unused-variable member-ordering */


@Injectable()
export class PetApi {
    protected basePath = 'http://petstore.swagger.io/v2';
    public defaultHeaders: Headers = new Headers();

    constructor(protected http: Http, @Optional()@Inject(BASE_PATH) basePath: string) {
        if (basePath) {
            this.basePath = basePath;
        }
    }

    /**
     * Add a new pet to the store
     * 
     * @param body Pet object that needs to be added to the store
     */
    public addPet(body?: models.Pet, extraHttpRequestParams?: any): Observable<{}> {
        const path = this.basePath + `/pet`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.values()); // https://github.com/angular/angular/issues/6845

        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json', 
            'application/xml'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json', 
            'application/xml'
        ];

        headers.set('Content-Type', 'application/json');



        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Post,
            headers: headers,
            body: body == null ? '' : JSON.stringify(body), // https://github.com/angular/angular/issues/10612
            search: queryParameters,
            responseType: ResponseContentType.Json
        });

        return this.http.request(path, requestOptions)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * Deletes a pet
     * 
     * @param petId Pet id to delete
     * @param apiKey 
     */
    public deletePet(petId: number, apiKey?: string, extraHttpRequestParams?: any): Observable<{}> {
        const path = this.basePath + `/pet/${petId}`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.values()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'petId' is not null or undefined
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling deletePet.');
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json', 
            'application/xml'
        ];



        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Delete,
            headers: headers,
            search: queryParameters,
            responseType: ResponseContentType.Json
        });

        return this.http.request(path, requestOptions)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     * @param status Status values that need to be considered for filter
     */
    public findPetsByStatus(status?: Array<string>, extraHttpRequestParams?: any): Observable<Array<models.Pet>> {
        const path = this.basePath + `/pet/findByStatus`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.values()); // https://github.com/angular/angular/issues/6845
        if (status !== undefined) {
            queryParameters.set('status', String(status));
        }


        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json', 
            'application/xml'
        ];



        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Get,
            headers: headers,
            search: queryParameters,
            responseType: ResponseContentType.Json
        });

        return this.http.request(path, requestOptions)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     * @param tags Tags to filter by
     */
    public findPetsByTags(tags?: Array<string>, extraHttpRequestParams?: any): Observable<Array<models.Pet>> {
        const path = this.basePath + `/pet/findByTags`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.values()); // https://github.com/angular/angular/issues/6845
        if (tags !== undefined) {
            queryParameters.set('tags', String(tags));
        }


        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json', 
            'application/xml'
        ];



        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Get,
            headers: headers,
            search: queryParameters,
            responseType: ResponseContentType.Json
        });

        return this.http.request(path, requestOptions)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * Find pet by ID
     * Returns a pet when ID &lt; 10.  ID &gt; 10 or nonintegers will simulate API error conditions
     * @param petId ID of pet that needs to be fetched
     */
    public getPetById(petId: number, extraHttpRequestParams?: any): Observable<models.Pet> {
        const path = this.basePath + `/pet/${petId}`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.values()); // https://github.com/angular/angular/issues/6845
        // verify required parameter 'petId' is not null or undefined
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling getPetById.');
        }

        // to determine the Content-Type header
        let consumes: string[] = [
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json', 
            'application/xml'
        ];



        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Get,
            headers: headers,
            search: queryParameters,
            responseType: ResponseContentType.Json
        });

        return this.http.request(path, requestOptions)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * Update an existing pet
     * 
     * @param body Pet object that needs to be added to the store
     */
    public updatePet(body?: models.Pet, extraHttpRequestParams?: any): Observable<{}> {
        const path = this.basePath + `/pet`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.values()); // https://github.com/angular/angular/issues/6845

        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json', 
            'application/xml'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json', 
            'application/xml'
        ];

        headers.set('Content-Type', 'application/json');



        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Put,
            headers: headers,
            body: body == null ? '' : JSON.stringify(body), // https://github.com/angular/angular/issues/10612
            search: queryParameters,
            responseType: ResponseContentType.Json
        });

        return this.http.request(path, requestOptions)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * Updates a pet in the store with form data
     * 
     * @param petId ID of pet that needs to be updated
     * @param name Updated name of the pet
     * @param status Updated status of the pet
     */
    public updatePetWithForm(petId: string, name?: string, status?: string, extraHttpRequestParams?: any): Observable<{}> {
        const path = this.basePath + `/pet/${petId}`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.values()); // https://github.com/angular/angular/issues/6845
        let formParams = new URLSearchParams();

        // verify required parameter 'petId' is not null or undefined
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling updatePetWithForm.');
        }

        // to determine the Content-Type header
        let consumes: string[] = [
            'application/x-www-form-urlencoded'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json', 
            'application/xml'
        ];

        headers.set('Content-Type', 'application/x-www-form-urlencoded');



        // use <any> since paramName could be of any type and formParams just accepts <string> 
        // see: http://stackoverflow.com/a/32607656
        formParams.set('name', <any>name); 

        // use <any> since paramName could be of any type and formParams just accepts <string> 
        // see: http://stackoverflow.com/a/32607656
        formParams.set('status', <any>status); 

        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Post,
            headers: headers,
            body: formParams.toString(),
            search: queryParameters,
            responseType: ResponseContentType.Json
        });

        return this.http.request(path, requestOptions)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

    /**
     * uploads an image
     * 
     * @param petId ID of pet to update
     * @param additionalMetadata Additional data to pass to server
     * @param file file to upload
     */
    public uploadFile(petId: number, additionalMetadata?: string, file?: any, extraHttpRequestParams?: any): Observable<{}> {
        const path = this.basePath + `/pet/${petId}/uploadImage`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.values()); // https://github.com/angular/angular/issues/6845
        let formParams = new URLSearchParams();

        // verify required parameter 'petId' is not null or undefined
        if (petId === null || petId === undefined) {
            throw new Error('Required parameter petId was null or undefined when calling uploadFile.');
        }

        // to determine the Content-Type header
        let consumes: string[] = [
            'multipart/form-data'
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json', 
            'application/xml'
        ];

        headers.set('Content-Type', 'application/x-www-form-urlencoded');



        // use <any> since paramName could be of any type and formParams just accepts <string> 
        // see: http://stackoverflow.com/a/32607656
        formParams.set('additionalMetadata', <any>additionalMetadata); 

        // use <any> since paramName could be of any type and formParams just accepts <string> 
        // see: http://stackoverflow.com/a/32607656
        formParams.set('file', <any>file); 

        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Post,
            headers: headers,
            body: formParams.toString(),
            search: queryParameters,
            responseType: ResponseContentType.Json
        });

        return this.http.request(path, requestOptions)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }

}
