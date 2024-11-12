package MovieTicketSales;

public class MovieTickets {

    private static final double VAT_RATE = 0.14;

    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double total = numberOfTickets * ticketPrice;
        return total + (total * VAT_RATE); // Including VAT
    }

    public boolean ValidateData(String movieName, int numberOfTickets, double ticketPrice) {
        return movieName != null && !movieName.isEmpty() &&
               numberOfTickets > 0 &&
               ticketPrice > 0;
    }

    public int TotalMovieSales(int[] ticketSales) {
        int total = 0;
        for (int sales : ticketSales) {
            total += sales;
        }
        return total;
    }

    public String TopMovie(String[] movies, int[] totalSales) {
        int topIndex = 0;
        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > totalSales[topIndex]) {
                topIndex = i;
            }
        }
        return movies[topIndex];
    }
}

//Referencing//Stack Overflow. (2010). How to declare a 2D array in Java? [online] Available at: https://stackoverflow.com/questions/2431259/how-to-declare-a-2d-array-in-java [Accessed 12 Nov. 2024].
//Stack Overflow. (2012). How do I use JUnit in NetBeans? [online] Available at: https://stackoverflow.com/questions/11980039/how-do-i-use-junit-in-netbeans [Accessed 12 Nov. 2024].
//Stack Overflow. (2010). How to use System.out.printf in Java? [online] Available at: https://stackoverflow.com/questions/2221876/how-to-use-system-out-printf-in-java [Accessed 12 Nov. 2024]
//Stack Overflow. (2011). How to read input in Java? [online] Available at: https://stackoverflow.com/questions/5287538/how-to-read-input-in-java [Accessed 12 Nov. 2024].
//Stack Overflow. (2013). Finding the max value in an array in Java. [online] Available at: https://stackoverflow.com/questions/18532873/finding-the-max-value-in-an-array-in-java [Accessed 12 Nov. 2024].
//stack Overflow. (2014). How to implement an interface in Java? [online] Available at: https://stackoverflow.com/questions/20971495/how-to-implement-an-interface-in-java [Accessed 12 Nov. 2024].
//Stack Overflow. (2013). How to sum elements of an array in Java? [online] Available at: https://stackoverflow.com/questions/14957644/how-to-sum-elements-of-an-array-in-java [Accessed 12 Nov. 2024]. 
//Stack Overflow. (2015). What is the purpose of JUnit’s assertEquals method? [online] Available at: https://stackoverflow.com/questions/29749148/what-is-the-purpose-of-junits-assertequals-method [Accessed 12 Nov. 2024].