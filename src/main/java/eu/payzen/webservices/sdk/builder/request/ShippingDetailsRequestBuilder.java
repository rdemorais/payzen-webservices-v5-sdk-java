package eu.payzen.webservices.sdk.builder.request;

import com.lyra.vads.ws.v5.CustStatus;
import com.lyra.vads.ws.v5.DeliverySpeed;
import com.lyra.vads.ws.v5.DeliveryType;
import com.lyra.vads.ws.v5.ShippingDetailsRequest;

public class ShippingDetailsRequestBuilder {

        private CustStatus type;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String streetNumber;
        private String address;
        private String address2;
        private String district;
        private String zipCode;
        private String city;
        private String state;
        private String country;
        private String deliveryCompanyName;
        private DeliverySpeed shippingSpeed;
        private DeliveryType shippingMethod;
        private String legalName;
        private String identityCode;

        public ShippingDetailsRequestBuilder type(CustStatus type) {
            this.type = type;
            return this;
        }

        public ShippingDetailsRequestBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public ShippingDetailsRequestBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public ShippingDetailsRequestBuilder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public ShippingDetailsRequestBuilder streetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public ShippingDetailsRequestBuilder address(String address) {
            this.address = address;
            return this;
        }

        public ShippingDetailsRequestBuilder address2(String address2) {
            this.address2 = address2;
            return this;
        }

        public ShippingDetailsRequestBuilder district(String district) {
            this.district = district;
            return this;
        }

        public ShippingDetailsRequestBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public ShippingDetailsRequestBuilder city(String city) {
            this.city = city;
            return this;
        }

        public ShippingDetailsRequestBuilder state(String state) {
            this.state = state;
            return this;
        }

        public ShippingDetailsRequestBuilder country(String country) {
            this.country = country;
            return this;
        }

        public ShippingDetailsRequestBuilder deliveryCompanyName(String deliveryCompanyName) {
            this.deliveryCompanyName = deliveryCompanyName;
            return this;
        }

        public ShippingDetailsRequestBuilder shippingSpeed(DeliverySpeed shippingSpeed) {
            this.shippingSpeed = shippingSpeed;
            return this;
        }

        public ShippingDetailsRequestBuilder shippingMethod(DeliveryType shippingMethod) {
            this.shippingMethod = shippingMethod;
            return this;
        }

        public ShippingDetailsRequestBuilder legalName(String legalName) {
            this.legalName = legalName;
            return this;
        }

        public ShippingDetailsRequestBuilder identityCode(String identityCode) {
            this.identityCode = identityCode;
            return this;
        }

        public ShippingDetailsRequest build() {
            ShippingDetailsRequest shippingDetailsRequest = new ShippingDetailsRequest();

            shippingDetailsRequest.setAddress(address);
            shippingDetailsRequest.setAddress2(address2);
            shippingDetailsRequest.setCity(city);
            shippingDetailsRequest.setCountry(country);
            shippingDetailsRequest.setDeliveryCompanyName(deliveryCompanyName);
            shippingDetailsRequest.setDistrict(district);
            shippingDetailsRequest.setFirstName(firstName);
            shippingDetailsRequest.setIdentityCode(identityCode);
            shippingDetailsRequest.setLastName(lastName);
            shippingDetailsRequest.setLegalName(legalName);
            shippingDetailsRequest.setPhoneNumber(phoneNumber);
            shippingDetailsRequest.setShippingMethod(shippingMethod);
            shippingDetailsRequest.setShippingSpeed(shippingSpeed);
            shippingDetailsRequest.setState(state);
            shippingDetailsRequest.setStreetNumber(streetNumber);
            shippingDetailsRequest.setType(type);
            shippingDetailsRequest.setZipCode(zipCode);

            return shippingDetailsRequest;
        }
    }