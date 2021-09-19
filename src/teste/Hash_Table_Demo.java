package teste;
// Java code to illustrate the put() method
import java.util.*;

public class Hash_Table_Demo {
    public static void main(String[] args)
    {

        // Creating an empty Hashtable
       Map<Integer, String> hash_table =
                new Hashtable<Integer, String>();

        // Inserting values into the table
        hash_table.put(10, "Geeks");
        hash_table.put(15, "4");
        hash_table.put(20, "Geeks");
        hash_table.put(25, "Welcomes");
        hash_table.put(30, "You");
        hash_table.put(15, "Agora" );

        // Displaying the Hashtable
        System.out.println("Initial table is: " + hash_table);

        // Inserting existing key along with new value
        String returned_value = (String)hash_table.put(20, "All");

        // Verifying the returned value
        System.out.println("Returned value is: " + returned_value);

        // Displaying the new table
        System.out.println("New table is: " + hash_table);
    }
}
