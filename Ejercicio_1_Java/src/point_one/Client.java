package point_one;

public class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Customer(int id) {
        this.id = id;
    }

    public Customer(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static Customer[] add(Customer[] custumersList, Customer newCustumer, int index){
        Customer[] customers1 = custumersList;
        customers1[index]=newCustumer;
        return customers1;
    }
}
