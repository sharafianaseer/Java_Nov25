package ExceptionAssignement;

import javax.xml.transform.Source;

public class TicketMain {

    public static void main(String[] args){

        Passenger p1=new Passenger("Sharafia",36);
        TicketBooking t1= new TicketBooking();
        try{
            t1.bookTicket(p1,450);
        }catch (InvalidAgeException|InsufficientBalanceException|SeatNotAvailableException e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("End of the Program");
        }



    }
}
