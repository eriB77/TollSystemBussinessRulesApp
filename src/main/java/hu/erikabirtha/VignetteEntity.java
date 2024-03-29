package hu.erikabirtha;

import java.util.Date;

public class VignetteEntity {
    public String registrationNumber;
    public String vehicleCategory;
    public String motorwayVignetteType;
    public Integer price;
    public Date validFrom;

    public Date validTo;
    public Date dateOfPurchase;

    public VignetteEntity(String registrationNumber, String vehicleCategory, String motorwayVignetteType, Integer price, Date validFrom, Date validTo, Date dateOfPurchase) {
        this.registrationNumber = registrationNumber;
        this.vehicleCategory = vehicleCategory;
        this.motorwayVignetteType = motorwayVignetteType;
        this.price = price;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.dateOfPurchase = dateOfPurchase;
    }


    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getMotorwayVignetteType() {
        return motorwayVignetteType;
    }

    public void setMotorwayVignetteType(String motorwayVignetteType) {
        this.motorwayVignetteType = motorwayVignetteType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public Date getValidTo() {
        return validTo;
    }

    public void setValidTo(Date validTo) {
        this.validTo = validTo;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

}
