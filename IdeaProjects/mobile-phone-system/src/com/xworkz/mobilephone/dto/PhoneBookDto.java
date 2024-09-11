package com.xworkz.mobilephone.dto;

public class PhoneBookDto {
    private int refId;
    private long contactNo;
    private String contactName;

    public int getRefId() {
        return refId;
    }

    public long getContactNo() {
        return contactNo;
    }

    public String getContactName() {
        return contactName;
    }

    public PhoneBookDto(int refId, long contactNo, String contactName) {
        this.refId = refId;
        this.contactNo = contactNo;
        this.contactName = contactName;
    }
}
