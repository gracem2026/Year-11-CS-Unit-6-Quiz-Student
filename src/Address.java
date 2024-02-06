public class Address {
    // properties
    private String district;
    private String street;
    private int streetNumber;

    // constructor
    public Address (String dist, String str, int strNum) {
        district = dist;
        street = str;
        streetNumber = strNum;
    }

    // methods
    // getters
    public String getDistrict() {
        return district;
    }
    public String getStreet() {
        return street;
    }
    public int getStreetNumber() {
        return streetNumber;
    }
    // setters
    public void setDistrict(String d) {
        district = d;
    }
    public void setStreet(String s) {
        street = s;
    }
    public void setStreetNumber(int sN) {
        streetNumber = sN;
    }
    // toString
    public String toString(){
        return streetNumber + " " + street + ", " + district;
    }
}
