package model;

public abstract class Facility {


    public enum RentalType {
        BY_HOUR,
        BY_DAY,
        BY_MONTH,
        BY_YEAR

    }
    private String serviceId ;
    private String serviceName ;
    private double roomArea;
    private double price;
    private int numberOfStaying ;
    private RentalType rentalType;
    public Facility(String serviceId, String serviceName, double roomArea, double price, int numberOfStaying, RentalType rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.roomArea = roomArea;
        this.price = price;
        this.numberOfStaying = numberOfStaying;
        this.rentalType = rentalType;
    }

    public Facility() {
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(double roomArea) {
        this.roomArea = roomArea;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfStaying() {
        return numberOfStaying;
    }

    public void setNumberOfStaying(int numberOfStaying) {
        this.numberOfStaying = numberOfStaying;
    }

    public RentalType getRentalType() {
        return rentalType;
    }

    public void setRentalType(RentalType rentalType) {
        this.rentalType = rentalType;
    }


    }
