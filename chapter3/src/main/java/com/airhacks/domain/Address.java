package com.airhacks.domain;

import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.airhacks.validation.ZipCode;

public class Address {

    @NotNull
    private String street1;
    private String street2;
    @NotNull
    private String city;
    private String state;
    @NotNull @ZipCode
    private String zipCode;
    private String country;

    public Address(String street1, String street2, String city, String state, String zipCode, String country) {
	this.street1 = street1;
	this.street2 = street2;
	this.city = city;
	this.state = state;
	this.zipCode = zipCode;
	this.country = country;
    }

    public String getStreet1() {
	return street1;
    }

    public void setStreet1(String street1) {
	this.street1 = street1;
    }

    public String getStreet2() {
	return street2;
    }

    public void setStreet2(String street2) {
	this.street2 = street2;
    }

    public String getCity() {
	return city;
    }

    public void setCity(String city) {
	this.city = city;
    }

    public String getState() {
	return state;
    }

    public void setState(String state) {
	this.state = state;
    }

    public String getZipCode() {
	return zipCode;
    }

    public void setZipCode(String zipCode) {
	this.zipCode = zipCode;
    }

    public String getCountry() {
	return country;
    }

    public void setCountry(String country) {
	this.country = country;
    }

    @Override
    public String toString() {
	return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
