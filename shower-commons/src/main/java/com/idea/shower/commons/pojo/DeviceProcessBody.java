package com.idea.shower.commons.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @program: shower-01
 * @description:
 * @author: yuane
 * @create: 2020-11-26 23:03
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeviceProcessBody {
    /**
     * code : 200
     * message : 成功
     * data : {"requestId":"3C389239-BDC3-43B1-9AF8-D3A97260AE85","success":true,"messageId":"1331977227923101185"}
     */

    @JsonProperty("code")
    private int code;
    @JsonProperty("message")
    private String message;
    @JsonProperty("data")
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class DataBean {
        /**
         * requestId : 3C389239-BDC3-43B1-9AF8-D3A97260AE85
         * success : true
         * messageId : 1331977227923101185
         */

        @JsonProperty("requestId")
        private String requestId;
        @JsonProperty("success")
        private boolean success;
        @JsonProperty("messageId")
        private String messageId;

        public String getRequestId() {
            return requestId;
        }

        public void setRequestId(String requestId) {
            this.requestId = requestId;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessageId() {
            return messageId;
        }

        public void setMessageId(String messageId) {
            this.messageId = messageId;
        }
    }
}