import static java.lang.String.format;

public class House {
     public int floorNumbers;
     public String address;

    public void setAddress(String address) {
        this.address = address;
        address = "via Mancini 21";
    }
    public void setFloorNumbers(int floorNumbers) {
        this.floorNumbers = floorNumbers;
    }

    public void residentNames(String array, String manuele, String peter, String larry) {
        residentNames("Luca","Manuele","Peter","Larry");

    }

    public int getFloorNumbers() {
        return floorNumbers;
    }

    public String getAddress() {
        return address;
    }
}




