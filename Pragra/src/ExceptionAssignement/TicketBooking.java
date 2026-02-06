package ExceptionAssignement;

public class TicketBooking {
    private static int availableseats=2;
    private double walletBalance=1000;


    void bookTicket(Passenger p,int fare) throws RuntimeException
    {
        System.out.println("Ticket booking for Mr./Mrs."+p.getName());
        System.out.println("Ticket fare is :"+fare);
        if(p.getAge()<5||p.getAge()>120)
            throw new InvalidAgeException("Passenger is not eligible for travel");

        else if(fare>walletBalance)
            throw new InsufficientBalanceException("Insufficient Balance");

        else if(availableseats==0)
            throw new SeatNotAvailableException("seat is not available");
        else {
            walletBalance-=fare;
            availableseats-=1;
            System.out.println("Ticket booked successfully.\nAmount deducted ="+fare);
            System.out.println("Current wallet balance:"+walletBalance+"\nAvailable seat="+availableseats);
        }

    }

}
