package eu.payzen.webservices.sdk.builder.request;

import com.lyra.vads.ws.v5.ExtraDetailsRequest;

public class ExtraDetailsRequestBuilder {

        private String ipAddress;
        private String fingerPrintId;

        public ExtraDetailsRequestBuilder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        public ExtraDetailsRequestBuilder fingerPrintId(String fingerPrintId) {
            this.fingerPrintId = fingerPrintId;
            return this;
        }

        public ExtraDetailsRequest build() {
            ExtraDetailsRequest extraDetailsRequest = new ExtraDetailsRequest();

            extraDetailsRequest.setIpAddress(ipAddress);
            extraDetailsRequest.setFingerPrintId(fingerPrintId);

            return extraDetailsRequest;
        }
    }