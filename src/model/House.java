package model;

public class House extends Facility {
    private String  roomStandard;
    private int numberOfStory;

    public House() {
    }

    public House(String serviceId, String serviceName, double roomArea, double price, int numberOfStaying, RentalType rentalType, String roomStandard, int numberOfStory) {
        super(serviceId, serviceName, roomArea, price, numberOfStaying, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfStory = numberOfStory;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfStory() {
        return numberOfStory;
    }

    public void setNumberOfStory(int numberOfStory) {
        this.numberOfStory = numberOfStory;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfStory=" + numberOfStory +
                '}' + super.toString();
    }
}
