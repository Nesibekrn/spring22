package lesson04;

public class OOP2 {
    public static void main(String[] args) {
        Store str = new Store("Super Store","California");
        System.out.println(str);

        str.setName("Super Mart");
        str.setAddress("US");
        System.out.println(str);
    }
}
