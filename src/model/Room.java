package model;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceId, String serviceName, double roomArea, double price, int numberOfStaying, RentalType rentalType, String freeService) {
        super(serviceId, serviceName, roomArea, price, numberOfStaying, rentalType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                '}' + super.toString();
    }
}
