class Movie {
    private int availableTickets = 1;

    public synchronized void bookTicket(String customerName) {
        if (availableTickets > 0) {
            System.out.println(customerName + " successfully booked the ticket.");
            availableTickets--;
        } else {
            System.out.println(customerName + " could not book the ticket. No tickets available.");
        }
    }

    public int getAvailableTickets() {
        return availableTickets;
    }
}
  
public class StudentSynchronization{
    public static void main(String[] args) {
        Movie movie = new Movie();

        Thread customer1 = new Thread(() -> {
            movie.bookTicket("Customer-1");
        });

        Thread customer2 = new Thread(() -> {
            movie.bookTicket("Customer-2");
        });

        customer1.start();
        customer2.start();

        try {
            customer1.join();
            customer2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Tickets remaining: " + movie.getAvailableTickets());
    }
}
