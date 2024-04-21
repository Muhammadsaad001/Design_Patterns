package Q4;

// Enum to represent product IDs
enum ProductId { MINE, YOURS }

// Product interface
interface Product {
    void print();
}

// Concrete product MINE
class ConcreteProductMINE implements Product {
    @Override
    public void print() {
        System.out.println("print MINE");
    }
}

// Concrete product YOURS
class ConcreteProductYOURS implements Product {
    @Override
    public void print() {
        System.out.println("print YOURS");
    }
}

// Creator class with factory method
class Creator {
    // Factory method to create products based on ID
    public Product create(ProductId id) {
        if (id == ProductId.MINE) {
            return new ConcreteProductMINE();
        } else if (id == ProductId.YOURS) {
            return new ConcreteProductYOURS();
        }
        // Handle other product IDs here if needed
        return null;
    }
}

public class demo {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Product product1 = creator.create(ProductId.MINE);
        product1.print();

        Product product2 = creator.create(ProductId.YOURS);
        product2.print();
    }
}
