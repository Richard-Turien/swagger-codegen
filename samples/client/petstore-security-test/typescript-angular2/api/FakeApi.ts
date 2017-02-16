/**
 * Swagger Petstore *_/ ' \" =end -- \\r\\n \\n \\r
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\  *_/ ' \" =end --       
 *
 * OpenAPI spec version: 1.0.0 *_/ ' \" =end -- \\r\\n \\n \\r
 * Contact: apiteam@swagger.io *_/ ' \" =end -- \\r\\n \\n \\r
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
import { Configuration }                                     from '../configuration';

/* tslint:disable:no-unused-variable member-ordering */


@Injectable()
export class FakeApi {
    protected basePath = 'https://petstore.swagger.io *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r/v2 *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r';
    public defaultHeaders: Headers = new Headers();
    public configuration: Configuration = new Configuration();

    constructor(protected http: Http, @Optional()@Inject(BASE_PATH) basePath: string, @Optional() configuration: Configuration) {
        if (basePath) {
            this.basePath = basePath;
        }
        if (configuration) {
            this.configuration = configuration;
        }
    }

    /**
     * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
     * 
     * @param test code inject * &#39; &quot; &#x3D;end  rn n r To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
     */
    public testCodeInjectEndRnNR(test code inject * &#39; &quot; &#x3D;end  rn n r?: string, extraHttpRequestParams?: any): Observable<{}> {
        return this.testCodeInjectEndRnNRWithHttpInfo(test code inject * &#39; &quot; &#x3D;end  rn n r, extraHttpRequestParams)
            .map((response: Response) => {
                if (response.status === 204) {
                    return undefined;
                } else {
                    return response.json();
                }
            });
    }


    /**
     * To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
     * 
     * @param test code inject * &#39; &quot; &#x3D;end  rn n r To test code injection *_/ &#39; \&quot; &#x3D;end -- \\r\\n \\n \\r
     */
    public testCodeInjectEndRnNRWithHttpInfo(test code inject * &#39; &quot; &#x3D;end  rn n r?: string, extraHttpRequestParams?: any): Observable<Response> {
        const path = this.basePath + `/fake`;

        let queryParameters = new URLSearchParams();
        let headers = new Headers(this.defaultHeaders.toJSON()); // https://github.com/angular/angular/issues/6845
        let formParams = new URLSearchParams();



        // to determine the Content-Type header
        let consumes: string[] = [
            'application/json', 
            '*_/   =end --       '
        ];

        // to determine the Accept header
        let produces: string[] = [
            'application/json', 
            '*_/   =end --       '
        ];
        
            
        headers.set('Content-Type', 'application/x-www-form-urlencoded');


        if (test code inject * &#39; &quot; &#x3D;end  rn n r !== undefined) {
            formParams.set('test code inject */ &#39; &quot; &#x3D;end -- \r\n \n \r', <any>test code inject * &#39; &quot; &#x3D;end  rn n r); 
        }

        let requestOptions: RequestOptionsArgs = new RequestOptions({
            method: RequestMethod.Put,
            headers: headers,
            body: formParams.toString(),
            search: queryParameters,
            responseType: ResponseContentType.Json
        });

        return this.http.request(path, requestOptions);
    }

}
