package automation.lesson8;


public class Products {
  private String key;
  private Integer value;

    public Products(String key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Products{" + "key='" + key + '\'' + ", value=" + value + '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

