package eu.payzen.webservices.sdk.builder.request;

import com.lyra.vads.ws.v5.BillingDetailsRequest;
import com.lyra.vads.ws.v5.CustStatus;

public class BillingDetailsRequestBuilder {

        private String reference;
        private String title;
        private CustStatus type;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String email;
        private String streetNumber;
        private String address;
        private String district;
        private String zipCode;
        private String city;
        private String state;
        private String country;
        private String language;
        private String cellPhoneNumber;
        private String legalName;
        private String identityCode;
        
        private BillingDetailsRequestBuilder() {
            
        }
        
        public static BillingDetailsRequestBuilder create() {
            return new BillingDetailsRequestBuilder();
        }
        
        public BillingDetailsRequestBuilder reference(String reference) {
            this.reference = reference;
            return this;
        }

        public BillingDetailsRequestBuilder title(String title) {
            this.title = title;
            return this;
        }

        public BillingDetailsRequestBuilder type(CustStatus type) {
            this.type = type;
            return this;
        }

        public BillingDetailsRequestBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public BillingDetailsRequestBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public BillingDetailsRequestBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public BillingDetailsRequestBuilder email(String email) {
            this.email = email;
            return this;
        }

        public BillingDetailsRequestBuilder streetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public BillingDetailsRequestBuilder address(String address) {
            this.address = address;
            return this;
        }

        public BillingDetailsRequestBuilder district(String district) {
            this.district = district;
            return this;
        }

        public BillingDetailsRequestBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public BillingDetailsRequestBuilder city(String city) {
            this.city = city;
            return this;
        }

        public BillingDetailsRequestBuilder state(String state) {
            this.state = state;
            return this;
        }

        public BillingDetailsRequestBuilder country(String country) {
            this.country = country;
            return this;
        }

        public BillingDetailsRequestBuilder language(String language) {
            this.language = language;
            return this;
        }

        public BillingDetailsRequestBuilder cellPhoneNumber(String cellPhoneNumber) {
            this.cellPhoneNumber = cellPhoneNumber;
            return this;
        }

        public BillingDetailsRequestBuilder legalName(String legalName) {
            this.legalName = legalName;
            return this;
        }

        public BillingDetailsRequestBuilder identityCode(String identityCode) {
            this.identityCode = identityCode;
            return this;
        }

        public BillingDetailsRequest build() {
            BillingDetailsRequest billingDetailsRequest = new BillingDetailsRequest();

            billingDetailsRequest.setAddress(address);
            billingDetailsRequest.setCellPhoneNumber(cellPhoneNumber);
            billingDetailsRequest.setCity(city);
            billingDetailsRequest.setCountry(country);
            billingDetailsRequest.setDistrict(district);
            billingDetailsRequest.setEmail(email);
            billingDetailsRequest.setFirstName(firstName);
            billingDetailsRequest.setIdentityCode(identityCode);
            billingDetailsRequest.setLanguage(language);
            billingDetailsRequest.setLastName(lastName);
            billingDetailsRequest.setLegalName(legalName);
            billingDetailsRequest.setPhoneNumber(phoneNumber);
            billingDetailsRequest.setReference(reference);
            billingDetailsRequest.setState(state);
            billingDetailsRequest.setStreetNumber(streetNumber);
            billingDetailsRequest.setTitle(title);
            billingDetailsRequest.setType(type);
            billingDetailsRequest.setZipCode(zipCode);
            
            return billingDetailsRequest;
        }
    }