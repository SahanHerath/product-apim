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


import org.wso2.am.integration.clients.admin.api.v1.dto.MonetizationUsagePublishInfoDTO;
import org.wso2.am.integration.clients.admin.api.v1.dto.PublishStatusDTO;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MonetizationCollectionApi {
    private ApiClient apiClient;

    public MonetizationCollectionApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MonetizationCollectionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for monetizationPublishUsagePost
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call monetizationPublishUsagePostCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/monetization/publish-usage";

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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call monetizationPublishUsagePostValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = monetizationPublishUsagePostCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Publish Usage Records
     * Publish Usage Records of Monetized APIs 
     * @return PublishStatusDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PublishStatusDTO monetizationPublishUsagePost() throws ApiException {
        ApiResponse<PublishStatusDTO> resp = monetizationPublishUsagePostWithHttpInfo();
        return resp.getData();
    }

    /**
     * Publish Usage Records
     * Publish Usage Records of Monetized APIs 
     * @return ApiResponse&lt;PublishStatusDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PublishStatusDTO> monetizationPublishUsagePostWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = monetizationPublishUsagePostValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<PublishStatusDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Publish Usage Records (asynchronously)
     * Publish Usage Records of Monetized APIs 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call monetizationPublishUsagePostAsync(final ApiCallback<PublishStatusDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = monetizationPublishUsagePostValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PublishStatusDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for monetizationPublishUsageStatusGet
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call monetizationPublishUsageStatusGetCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/monetization/publish-usage/status";

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
    private com.squareup.okhttp.Call monetizationPublishUsageStatusGetValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = monetizationPublishUsageStatusGetCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get the status of Monetization usage publisher
     * Get the status of Monetization usage publisher 
     * @return MonetizationUsagePublishInfoDTO
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MonetizationUsagePublishInfoDTO monetizationPublishUsageStatusGet() throws ApiException {
        ApiResponse<MonetizationUsagePublishInfoDTO> resp = monetizationPublishUsageStatusGetWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get the status of Monetization usage publisher
     * Get the status of Monetization usage publisher 
     * @return ApiResponse&lt;MonetizationUsagePublishInfoDTO&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MonetizationUsagePublishInfoDTO> monetizationPublishUsageStatusGetWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = monetizationPublishUsageStatusGetValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<MonetizationUsagePublishInfoDTO>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get the status of Monetization usage publisher (asynchronously)
     * Get the status of Monetization usage publisher 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call monetizationPublishUsageStatusGetAsync(final ApiCallback<MonetizationUsagePublishInfoDTO> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = monetizationPublishUsageStatusGetValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MonetizationUsagePublishInfoDTO>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
