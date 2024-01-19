package model;

public class Villa extends Facility {
    private String  roomStandard;
    private double poolArea;
    private int numberOfStory;

    public Villa() {
    }

    public Villa(String serviceId, String serviceName, double roomArea, double price, int numberOfStaying, RentalType rentalType, String roomStandard, double poolArea, int numberOfStory) {
        super(serviceId, serviceName, roomArea, price, numberOfStaying, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfStory = numberOfStory;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfStory() {
        return numberOfStory;
    }

    public void setNumberOfStory(int numberOfStory) {
        this.numberOfStory = numberOfStory;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfStory=" + numberOfStory +
                '}' + super.toString();
    }
}
