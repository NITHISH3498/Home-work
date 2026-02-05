
package inheritance;

abstract class Transport 
{
    protected int passengerId;
    protected String passengerName;
    protected String fromCity;
    protected String toCity;
    protected double distance;
    protected double fare;

    abstract void calculateFare();

    public void displayTicket() {
        System.out.println("\n----- TICKET DETAILS -----");
        System.out.println("Passenger ID   : " + passengerId);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Route          : " + fromCity + " -> " + toCity);
        System.out.println("Distance       : " + distance + " km");
        System.out.println("Total Fare     : " + fare);
    }
}
