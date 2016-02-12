/*
 * APIMATICCalculatorLib
 *
 * This file was automatically generated by APIMATIC BETA v2.0 on 02/12/2016
 */
package io.apimatic.examples.controllers;

import io.apimatic.examples.http.client.HttpClient;
import io.apimatic.examples.http.client.UnirestClient;

public abstract class BaseController {
    /**
     * Protected variable to keep reference of client instance
     */
    protected HttpClient clientInstance = null;

    /**
     * Initialize with the default http client
     */
    public BaseController() {
        clientInstance = UnirestClient.getSharedInstance();
    }

    /**
     * Initialize the base controller using the given http client
     *
     * @param _client The given http client
     */
    public BaseController(HttpClient _client) {
        clientInstance = _client;
    }
}
