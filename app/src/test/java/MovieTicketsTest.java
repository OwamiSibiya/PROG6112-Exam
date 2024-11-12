/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class MovieTicketsTest {
    
    public MovieTicketsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of the class MovieTickets' TotalMovieSales function.
     */
    @Test
    public void testTotalMovieSales() {
        System.out.println("TotalMovieSales");
        int[] movieTicketSales = null;
        MovieTickets instance = new MovieTickets();
        int expResult = 0;
        int result = instance.TotalMovieSales(movieTicketSales);
        assertEquals(expResult, result);
        // TODO: Examine the test code that was generated and eliminate the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of the MovieTickets class's TopMovie function.
     */
    @Test
    public void testTopMovie() {
        System.out.println("TopMovie");
        String[] movies = null;
        int[] totalSales = null;
        MovieTickets instance = new MovieTickets();
        String expResult = "";
        String result = instance.TopMovie(movies, totalSales);
        assertEquals(expResult, result);
        // TODO: Examine the test code that was generated and eliminate the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Main method test for the MovieTickets class
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        MovieTickets.main(args);
       // TODO Examine the test code that was generated and eliminate the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void CalculateTotalSales_ReturnsExpectedTotalSales() {
        MovieTickets movieTickets = new MovieTickets();
        int[] salesData = {3000, 1500, 1700};
        int expectedTotal = 6200;
        int actualTotal = movieTickets.TotalMovieSales(salesData);
        assertEquals(expectedTotal, actualTotal, "Total sales calculation should return the correct total.");
    }

    @Test
    public void TopMovieSales_ReturnsTopMovie() {
        MovieTickets movieTickets = new MovieTickets();
        String[] movies = {"Napoleon", "Oppenheimer"};
        int[] totalSales = {6200, 6300};
        String expectedTopMovie = "Oppenheimer";
        String actualTopMovie = movieTickets.TopMovie(movies, totalSales);
        assertEquals(expectedTopMovie, actualTopMovie, "Top performing movie should be Oppenheimer.");
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