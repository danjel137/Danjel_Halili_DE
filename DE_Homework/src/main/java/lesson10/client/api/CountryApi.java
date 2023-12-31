/*
 * Nager.Date API - V3
 * Nager.Date is open source software and is completely free for commercial use. If you would like to support the project you can award a GitHub star ⭐ or even better <a href='https://github.com/sponsors/nager'>actively support us</a>
 *
 * OpenAPI spec version: v3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package lesson10.client.api;


import com.google.gson.reflect.TypeToken;
import lesson10.client.*;
import lesson10.client.model.CountryInfoDto;
import lesson10.client.model.CountryV3Dto;


import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountryApi {
    private ApiClient apiClient;

    public CountryApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CountryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for countryAvailableCountries
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call countryAvailableCountriesCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v3/AvailableCountries";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call countryAvailableCountriesValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        com.squareup.okhttp.Call call = countryAvailableCountriesCall(progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get all available countries
     * 
     * @return List&lt;CountryV3Dto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<CountryV3Dto> countryAvailableCountries() throws ApiException {
        ApiResponse<List<CountryV3Dto>> resp = countryAvailableCountriesWithHttpInfo();
        return resp.getData();
    }

    /**
     * Get all available countries
     * 
     * @return ApiResponse&lt;List&lt;CountryV3Dto&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<CountryV3Dto>> countryAvailableCountriesWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = countryAvailableCountriesValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<List<CountryV3Dto>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get all available countries (asynchronously)
     * 
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call countryAvailableCountriesAsync(final ApiCallback<List<CountryV3Dto>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = countryAvailableCountriesValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<CountryV3Dto>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for countryCountryInfo
     * @param countryCode  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call countryCountryInfoCall(String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/api/v3/CountryInfo/{countryCode}"
            .replaceAll("\\{" + "countryCode" + "\\}", apiClient.escapeString(countryCode.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain", "application/json", "text/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
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
    private com.squareup.okhttp.Call countryCountryInfoValidateBeforeCall(String countryCode, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'countryCode' is set
        if (countryCode == null) {
            throw new ApiException("Missing the required parameter 'countryCode' when calling countryCountryInfo(Async)");
        }
        
        com.squareup.okhttp.Call call = countryCountryInfoCall(countryCode, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get country info for the given country
     * 
     * @param countryCode  (required)
     * @return CountryInfoDto
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CountryInfoDto countryCountryInfo(String countryCode) throws ApiException {
        ApiResponse<CountryInfoDto> resp = countryCountryInfoWithHttpInfo(countryCode);
        return resp.getData();
    }

    /**
     * Get country info for the given country
     * 
     * @param countryCode  (required)
     * @return ApiResponse&lt;CountryInfoDto&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CountryInfoDto> countryCountryInfoWithHttpInfo(String countryCode) throws ApiException {
        com.squareup.okhttp.Call call = countryCountryInfoValidateBeforeCall(countryCode, null, null);
        Type localVarReturnType = new TypeToken<CountryInfoDto>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get country info for the given country (asynchronously)
     * 
     * @param countryCode  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call countryCountryInfoAsync(String countryCode, final ApiCallback<CountryInfoDto> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = countryCountryInfoValidateBeforeCall(countryCode, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CountryInfoDto>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
