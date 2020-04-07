/*
 * WSO2 API Manager - Admin
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Admin Portal. Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.5.176/components/apimgt/org.wso2.carbon.apimgt.rest.api.admin/src/main/resources/admin-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: 0.16.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.admin.api.v1;

import org.wso2.am.integration.clients.admin.api.ApiCallback;
import org.wso2.am.integration.clients.admin.api.ApiClient;
import org.wso2.am.integration.clients.admin.api.ApiException;
import org.wso2.am.integration.clients.admin.api.ApiResponse;
import org.wso2.am.integration.clients.admin.api.Configuration;
import org.wso2.am.integration.clients.admin.api.Pair;
import org.wso2.am.integration.clients.admin.api.ProgressRequestBody;
import org.wso2.am.integration.clients.admin.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import org.wso2.am.integration.clients.admin.api.v1.dto.ApplicationThrottlePolicyDTO;
import org.wso2.am.integration.clients.admin.api.v1.dto.ApplicationThrottlePolicyListDTO;
import org.wso2.am.integration.clients.admin.api.v1.dto.ErrorDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationPolicyCollectionApi {
    private ApiClient apiClient;

    public ApplicationPolicyCollectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApplicationPolicyCollectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for throttlingPoliciesApplicationGet
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesApplicationGetCall(String accept, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/throttling/policies/application";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (accept != null)
        localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));
        if (ifNoneMatch != null)
        localVarHeaderParams.put("If-None-Match", apiClient.parameterToString(ifNoneMatch));
        if (ifModifiedSince != null)
        localVarHeaderParams.put("If-Modified-Since", apiClient.parameterToString(ifModifiedSince));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call throttlingPoliciesApplicationGetValidateBeforeCall(String accept, String ifNoneMatch, String ifModifiedSince, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = throttlingPoliciesApplicationGetCall(accept, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get all Application Throttling Policies
     * Retrieves all existing application throttling policies. 
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return ApplicationThrottlePolicyListDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApplicationThrottlePolicyListDTO throttlingPoliciesApplicationGet(String accept, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        ApiResponse<ApplicationThrottlePolicyListDTO> resp = throttlingPoliciesApplicationGetWithHttpInfo(accept, ifNoneMatch, ifModifiedSince);
        return resp.getData();
    }

    /**
     * Get all Application Throttling Policies
     * Retrieves all existing application throttling policies. 
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @return ApiResponse&lt;ApplicationThrottlePolicyListDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApplicationThrottlePolicyListDTO> throttlingPoliciesApplicationGetWithHttpInfo(String accept, String ifNoneMatch, String ifModifiedSince) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesApplicationGetValidateBeforeCall(accept, ifNoneMatch, ifModifiedSince, null, null);
        Type localVarReturnType = new TypeToken<ApplicationThrottlePolicyListDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all Application Throttling Policies (asynchronously)
     * Retrieves all existing application throttling policies. 
     * @param accept Media types acceptable for the response. Default is application/json.  (optional, default to application/json)
     * @param ifNoneMatch Validator for conditional requests; based on the ETag of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param ifModifiedSince Validator for conditional requests; based on Last Modified header of the formerly retrieved variant of the resource (Will be supported in future).  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesApplicationGetAsync(String accept, String ifNoneMatch, String ifModifiedSince, final ApiCallback<ApplicationThrottlePolicyListDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = throttlingPoliciesApplicationGetValidateBeforeCall(accept, ifNoneMatch, ifModifiedSince, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApplicationThrottlePolicyListDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for throttlingPoliciesApplicationPost
     * @param body Application level policy object that should to be added  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesApplicationPostCall(ApplicationThrottlePolicyDTO body, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/throttling/policies/application";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (contentType != null)
        localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call throttlingPoliciesApplicationPostValidateBeforeCall(ApplicationThrottlePolicyDTO body, String contentType, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling throttlingPoliciesApplicationPost(Async)");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new ApiException("Missing the required parameter 'contentType' when calling throttlingPoliciesApplicationPost(Async)");
        }
        

        com.squareup.okhttp.Call call = throttlingPoliciesApplicationPostCall(body, contentType, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Add an Application Throttling Policy
     * This operation can be used to add a new application level throttling policy. 
     * @param body Application level policy object that should to be added  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @return ApplicationThrottlePolicyDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApplicationThrottlePolicyDTO throttlingPoliciesApplicationPost(ApplicationThrottlePolicyDTO body, String contentType) throws ApiException {
        ApiResponse<ApplicationThrottlePolicyDTO> resp = throttlingPoliciesApplicationPostWithHttpInfo(body, contentType);
        return resp.getData();
    }

    /**
     * Add an Application Throttling Policy
     * This operation can be used to add a new application level throttling policy. 
     * @param body Application level policy object that should to be added  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @return ApiResponse&lt;ApplicationThrottlePolicyDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ApplicationThrottlePolicyDTO> throttlingPoliciesApplicationPostWithHttpInfo(ApplicationThrottlePolicyDTO body, String contentType) throws ApiException {
        com.squareup.okhttp.Call call = throttlingPoliciesApplicationPostValidateBeforeCall(body, contentType, null, null);
        Type localVarReturnType = new TypeToken<ApplicationThrottlePolicyDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add an Application Throttling Policy (asynchronously)
     * This operation can be used to add a new application level throttling policy. 
     * @param body Application level policy object that should to be added  (required)
     * @param contentType Media type of the entity in the body. Default is application/json.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call throttlingPoliciesApplicationPostAsync(ApplicationThrottlePolicyDTO body, String contentType, final ApiCallback<ApplicationThrottlePolicyDTO> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = throttlingPoliciesApplicationPostValidateBeforeCall(body, contentType, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ApplicationThrottlePolicyDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
