/*
 * Copyright 2015 avier Garcia Alonso.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.payzen.webservices.sdk.builder.request;

import com.lyra.vads.ws.v5.BillingDetailsRequest;
import com.lyra.vads.ws.v5.CustomerRequest;
import com.lyra.vads.ws.v5.ExtraDetailsRequest;
import com.lyra.vads.ws.v5.ShippingDetailsRequest;

/**
 * Builder class to help in the construction of a CustomerRequest
 * 
 * @author Javier Garcia Alonso
 */
public class CustomerRequestBuilder {
    private BillingDetailsRequest billingDetailsRequest;
    private ShippingDetailsRequest shippingDetailsRequest;
    private ExtraDetailsRequest extraDetailsRequest;
    
    private CustomerRequestBuilder() {
    }
    
    public static CustomerRequestBuilder create() {
        return new CustomerRequestBuilder();
    }

    public CustomerRequestBuilder billingDetailsRequest(BillingDetailsRequest billingDetailsRequest) {
        this.billingDetailsRequest = billingDetailsRequest;
        return this;
    }

    public CustomerRequestBuilder shippingDetailsRequest(ShippingDetailsRequest shippingDetailsRequest) {
        this.shippingDetailsRequest = shippingDetailsRequest;
        return this;
    }

    public CustomerRequestBuilder extraDetailsRequest(ExtraDetailsRequest extraDetailsRequest) {
        this.extraDetailsRequest = extraDetailsRequest;
        return this;
    }
    
    public CustomerRequest build() {
        CustomerRequest customerRequest = new CustomerRequest();
        
        customerRequest.setBillingDetails(billingDetailsRequest);
        customerRequest.setShippingDetails(shippingDetailsRequest);
        customerRequest.setExtraDetails(extraDetailsRequest);
        
        return customerRequest;
    }
}
