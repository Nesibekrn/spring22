package lesson04;

public class Store {
    private String name;
    private String address;

    public Store(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){
        return  this.name;
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

    public String toString(){
        return this.name + "\n" + this.address;
    }
}
