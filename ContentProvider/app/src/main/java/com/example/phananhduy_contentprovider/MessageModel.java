package com.example.phananhduy_contentprovider;

public class MessageModel {
    private String address;
    private String body;

    public MessageModel(String address, String body) {
        this.address = address;
        this.body = body;
    }

    public String getAddress() {
        return address;
    }

    public String getBody() {
        return body;
    }
}