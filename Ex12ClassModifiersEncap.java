package JavaEntry;

public class Ex12ClassModifiersEncap {
    private String fullName = "Test";

    public String getName(){ // Getter Method
        return fullName;
    }

    public void setName(String newName){  // Setter Method
        this.fullName = newName;
    }
}
