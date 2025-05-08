package com.projeto.engenharia.esiv_fatec.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@JsonNaming(PropertyNamingStrategies.UpperCamelCaseStrategy.class)
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("id")
    private Long id;

    @JsonProperty("FantasyName")
    private String FantasyName;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("AddressStreet")
    private String AddressStreet;

    @JsonProperty("AddressDistrict")
    private String AddressDistrict;

    @JsonProperty("LegalName")
    private String LegalName;

    @JsonProperty("StoreIdNumber")
    private Integer StoreIdNumber;

    @JsonProperty("Type")
    private String Type;

    @JsonProperty("CEP")
    private String CEP;

    @JsonProperty("State")
    private String State;

    @JsonProperty("City")
    private String City;

    @JsonProperty("Region")
    private String Region;

    @JsonProperty("CountryDescription")
    private String CountryDescription;

    @JsonProperty("CountryId")
    private String CountryId;

    @JsonProperty("PhoneCode")
    private String PhoneCode;

    @JsonProperty("Phone")
    private String Phone;

    @JsonProperty("BirthDate")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private String BirthDate;

    @JsonProperty("HomePage")
    private String HomePage;

    @JsonProperty("Email")
    private String Email;

    @JsonProperty("isActive")
    private boolean IsActive;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFantasyName() {
        return FantasyName;
    }

    public void setFantasyName(String FantasyName) {
        this.FantasyName = FantasyName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getAddressStreet() {
        return AddressStreet;
    }

    public void setAddressStreet(String AddressStreet) {
        this.AddressStreet = AddressStreet;
    }

    public String getAddressDistrict() {
        return AddressDistrict;
    }

    public void setAddressDistrict(String AddressDistrict) {
        this.AddressDistrict = AddressDistrict;
    }

    public String getLegalName() {
        return LegalName;
    }

    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    public Integer getStoreIdNumber() {
        return StoreIdNumber;
    }

    public void setStoreIdNumber(Integer StoreIdNumber) {
        this.StoreIdNumber = StoreIdNumber;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public String getCountryDescription() {
        return CountryDescription;
    }

    public void setCountryDescription(String CountryDescription) {
        this.CountryDescription = CountryDescription;
    }

    public String getCountryId() {
        return CountryId;
    }

    public void setCountryId(String CountryId) {
        this.CountryId = CountryId;
    }

    public String getPhoneCode() {
        return PhoneCode;
    }

    public void setPhoneCode(String PhoneCode) {
        this.PhoneCode = PhoneCode;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getBirthDate() {
        return BirthDate;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public String getHomePage() {
        return HomePage;
    }

    public void setHomePage(String HomePage) {
        this.HomePage = HomePage;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public boolean isIsActive() {
        return IsActive;
    }

    public void setActive(boolean IsActive) {
        this.IsActive = IsActive;
    }
}
