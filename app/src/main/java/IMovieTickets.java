package MovieTicketSales;

public interface IMovieTickets {
    int TotalMovieSales(int[] movieTicketSales);
    String TopMovie(String[] movies, int[] totalSales);
    
    double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice);
    boolean ValidateData(String movieName, int numberOfTickets, double ticketPrice);
}

// References:
// Oracle. (n.d.). Interfaces [online]. Available at: https://docs.oracle.com/javase/tutorial/java/IandI/createinterface.html [Accessed 12 Nov. 2024].
// Stack Overflow. (2009). What is an interface in Java? [online]. Available at: https://stackoverflow.com/questions/1323641/what-is-an-interface-in-java [Accessed 12 Nov. 2024].
// Baeldung. (2018). Java Math [online]. Available at: https://www.baeldung.com/java-math [Accessed 12 Nov. 2024].
// GeeksforGeeks. (2019). Java - How to Validate User Input [online]. Available at: https://www.geeksforgeeks.org/java-how-to-validate-user-input/ [Accessed 12 Nov. 2024].
