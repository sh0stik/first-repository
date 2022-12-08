import com.opencsv.bean.CsvToBeanBuilder;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class MiniHackathonList {
    public static void main(String[] args) {
        MiniHackathonList m = new MiniHackathonList();
        List<Customer> customers = m.loadVendorDataWithOpenCSV();
        Scanner scanner = new Scanner(System.in);
        String inputLine = "";
        while (true) {
            System.out.println("Type the Lastname to find customer or 0 to Exit:");
            inputLine = scanner.nextLine();
            if (inputLine.equals("0")) {
                scanner.close();
                break;
            }
            findAndPrintCustomers(inputLine, customers);
        }
    }

    private static void findAndPrintCustomers(String input, List<Customer> customers) {
        int count = 0;
        for (Customer customer : customers) {
            if (customer.getLastName().equalsIgnoreCase(input)) {
                System.out.println(customer + "\n");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no customer with lastname " + input);
        }
    }

    private List<Customer> loadVendorDataWithOpenCSV() {
        String file = "C:/Users/dariy/Downloads/us-500/us-500.csv";
        List<Customer> customers = new ArrayList<>();
        try {
            customers = new CsvToBeanBuilder(new FileReader(file))
                    .withType(Customer.class)
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return customers;
    }

    private List<Customer> loadVendorData() {
        List<Customer> customers = new ArrayList<>();
        // please map this file to your drive
        String file = "C:/Users/dariy/Downloads/us-500/us-500.csv";
        String line;
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            while ((line = br.readLine()) != null) {
                if (line.contains("first_name")) {
                    continue;
                }
                Customer customer = createCustomer(line);
                customers.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return customers;
    }

    private Customer createCustomer(String line) {
        String[] attributes = line.replace("\"", "").split(",(?!\\s)");
        Customer customer = new Customer();
        customer.setFirstName(attributes[0]);
        customer.setLastName(attributes[1]);
        customer.setCompanyName(attributes[2]);
        customer.setAddress(attributes[3]);
        customer.setCity(attributes[4]);
        customer.setCounty(attributes[5]);
        customer.setState(attributes[6]);
        customer.setZipCode(attributes[7]);
        customer.setPhoneNumber1(attributes[8]);
        customer.setPhoneNumber2(attributes[9]);
        customer.setEmail(attributes[10]);
        customer.setWeb(attributes[11]);
        return customer;
    }
}

