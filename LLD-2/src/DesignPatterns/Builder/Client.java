package DesignPatterns.Builder;

public class Client {
    public static void main(String[] args) {
       House house=House.getinstance().setName("Hilter").setAddress("Germany").setHouseNo(2000).setValidation(true).build();
       house.getProfile();
    }
}
