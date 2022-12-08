import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvBindByPosition;

import java.util.StringJoiner;

public class Customer {

    @CsvBindByName(column = "first_name")
    private String firstName;
    @CsvBindByName(column = "last_name")
    private String lastName;
    @CsvBindByName(column = "company_name")
    private String companyName;
    @CsvBindByName(column = "address")
    private String address;
    @CsvBindByName(column = "city")
    private String city;
    @CsvBindByName(column = "county")
    private String county;
    @CsvBindByName(column = "state")
    private String state;
    @CsvBindByName(column = "zip")
    private String zipCode;
    @CsvBindByName(column = "phone1")
    private String phoneNumber1;
    @CsvBindByName(column = "phone2")
    private String phoneNumber2;
    @CsvBindByName(column = "email")
    private String email;
    @CsvBindByName(column = "web")
    private String web;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String companyName, String address, String city, String county,
                    String state, String zipCode, String phoneNumber1, String phoneNumber2, String email, String web) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.address = address;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.email = email;
        this.web = web;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\n"
                + "Address: " + address + ", " + city + ", " + zipCode + "\n"
                + "Phone Number: " + phoneNumber1 + "\n"
                + "Email: " + email + "\n";
    }
}
