import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class MiniHackathonMap {
    public static void main(String[] args) {
        MiniHackathonMap m = new MiniHackathonMap();
        Map<String, List<Customer>> customersByLastName = m.loadVendorData();
        Scanner scanner = new Scanner(System.in);
        String inputLine = "";
        while (true) {
            System.out.println("Type the Lastname to find customer or 0 to Exit:");
            inputLine = scanner.nextLine();
            if (inputLine.equals("0")) {
                scanner.close();
                break;
            }
            findAndPrintCustomer(inputLine, customersByLastName);
        }
    }


    private static void findAndPrintCustomer(String input, Map<String, List<Customer>> customersByLastName) {
        int count = 0;
        if (customersByLastName.containsKey(input.toLowerCase())) {
            customersByLastName.get(input).forEach(System.out::println);
        } else {
            System.out.println("There is no customer with lastname " + input);
        }

    }


    private Map<String, List<Customer>> loadVendorData() {
        String file = "C:/Users/dariy/Downloads/us-500/us-500.csv";
        List<Customer> customers;
        Map<String, List<Customer>> customersByLastName = new HashMap<>();
        try {
            customers = new CsvToBeanBuilder(new FileReader(file))
                    .withType(Customer.class)
                    .build()
                    .parse();
            for (Customer customer : customers) {
                String lastName = customer.getLastName().toLowerCase();
                customersByLastName.putIfAbsent(lastName, new ArrayList<>());
                customersByLastName.get(lastName).add(customer);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return customersByLastName;
    }
}