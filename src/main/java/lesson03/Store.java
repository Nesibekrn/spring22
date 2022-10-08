package lesson03;

public class Store {
    private String name;
    private String address;

    //making a constructor
    public Store(String theName, String theAddress){
        this.name = theName;
        this.address = theAddress;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public void setName(String theName){
        this.name = theName;
    }

    public void setAddress(String theAddress){
        this.address = theAddress;
    }

   
}
