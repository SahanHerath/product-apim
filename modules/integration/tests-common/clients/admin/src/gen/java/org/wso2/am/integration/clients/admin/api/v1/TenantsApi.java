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


import org.wso2.am.integration.clients.admin.api.v1.dto.CustomUrlInfoDTO;
import org.wso2.am.integration.clients.admin.api.v1.dto.ErrorDTO;
import org.wso2.am.integration.clients.admin.api.v1.dto.TenantInfoDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TenantsApi {
    private ApiClient apiClient;

    public TenantsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TenantsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getCustomUrlInfoByTenantDomain
     * @param tenantDomain The tenant domain name.  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCustomUrlInfoByTenantDomainCall(String tenantDomain, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/custom-urls/{tenantDomain}"
            .replaceAll("\\{" + "tenantDomain" + "\\}", apiClient.escapeString(tenantDomain.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call getCustomUrlInfoByTenantDomainValidateBeforeCall(String tenantDomain, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'tenantDomain' is set
        if (tenantDomain == null) {
            throw new ApiException("Missing the required parameter 'tenantDomain' when calling getCustomUrlInfoByTenantDomain(Async)");
        }
        

        com.squareup.okhttp.Call call = getCustomUrlInfoByTenantDomainCall(tenantDomain, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get custom-url info of a tenant domain 
     * This operation is to get custom-url information of the provided tenant-domain 
     * @param tenantDomain The tenant domain name.  (required)
     * @return CustomUrlInfoDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CustomUrlInfoDTO getCustomUrlInfoByTenantDomain(String tenantDomain) throws ApiException {
        ApiResponse<CustomUrlInfoDTO> resp = getCustomUrlInfoByTenantDomainWithHttpInfo(tenantDomain);
        return resp.getData();
    }

    /**
     * Get custom-url info of a tenant domain 
     * This operation is to get custom-url information of the provided tenant-domain 
     * @param tenantDomain The tenant domain name.  (required)
     * @return ApiResponse&lt;CustomUrlInfoDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CustomUrlInfoDTO> getCustomUrlInfoByTenantDomainWithHttpInfo(String tenantDomain) throws ApiException {
        com.squareup.okhttp.Call call = getCustomUrlInfoByTenantDomainValidateBeforeCall(tenantDomain, null, null);
        Type localVarReturnType = new TypeToken<CustomUrlInfoDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get custom-url info of a tenant domain  (asynchronously)
     * This operation is to get custom-url information of the provided tenant-domain 
     * @param tenantDomain The tenant domain name.  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCustomUrlInfoByTenantDomainAsync(String tenantDomain, final ApiCallback<CustomUrlInfoDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCustomUrlInfoByTenantDomainValidateBeforeCall(tenantDomain, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CustomUrlInfoDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTenantInfoByUsername
     * @param username The state represents the current state of the tenant  Supported states are [ active, inactive]  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getTenantInfoByUsernameCall(String username, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/tenant-info/{username}"
            .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

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
    private com.squareup.okhttp.Call getTenantInfoByUsernameValidateBeforeCall(String username, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getTenantInfoByUsername(Async)");
        }
        

        com.squareup.okhttp.Call call = getTenantInfoByUsernameCall(username, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get tenant id of the user 
     * This operation is to get tenant id of the provided user 
     * @param username The state represents the current state of the tenant  Supported states are [ active, inactive]  (required)
     * @return TenantInfoDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TenantInfoDTO getTenantInfoByUsername(String username) throws ApiException {
        ApiResponse<TenantInfoDTO> resp = getTenantInfoByUsernameWithHttpInfo(username);
        return resp.getData();
    }

    /**
     * Get tenant id of the user 
     * This operation is to get tenant id of the provided user 
     * @param username The state represents the current state of the tenant  Supported states are [ active, inactive]  (required)
     * @return ApiResponse&lt;TenantInfoDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TenantInfoDTO> getTenantInfoByUsernameWithHttpInfo(String username) throws ApiException {
        com.squareup.okhttp.Call call = getTenantInfoByUsernameValidateBeforeCall(username, null, null);
        Type localVarReturnType = new TypeToken<TenantInfoDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get tenant id of the user  (asynchronously)
     * This operation is to get tenant id of the provided user 
     * @param username The state represents the current state of the tenant  Supported states are [ active, inactive]  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTenantInfoByUsernameAsync(String username, final ApiCallback<TenantInfoDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTenantInfoByUsernameValidateBeforeCall(username, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TenantInfoDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
