package Es1;


public class Customer {


    private int id;
    private String name;
    private int tier;


    public Customer( int id,String name, int tier){
        this.id=id;
        this.name=name;
        this.tier=tier;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTier() {
        return tier;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}

