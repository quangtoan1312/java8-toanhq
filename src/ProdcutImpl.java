import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProdcutImpl {
    static Product product1 = new Product(1, "CPU", 1, LocalDate.of(2022, 12,12), 10,false);
    static Product product2 = new Product(2, "Mainboard", 1, LocalDate.of(2022, 11,12), 34,true);
    static Product product3 = new Product(3, "RAM", 1, LocalDate.of(2022, 10,12), 0,false);
    static Product product4 = new Product(4, "GPU", 1, LocalDate.of(2022, 9,12), 6,false);
    static Product product5 = new Product(5, "PSU", 1, LocalDate.of(2022, 8,12), 3,false);
    static Product product6 = new Product(6, "Case", 1, LocalDate.of(2022, 7,12), 2,false);
    static Product product7 = new Product(7, "Monitor", 2, LocalDate.of(2022, 6,12), 1,false);
    static Product product8 = new Product(8, "Mouse", 2, LocalDate.of(2022, 5,12), 8,false);
    static Product product9 = new Product(9, "Keyboard", 2, LocalDate.of(2022, 4,12), 4,false);
    static Product product10 = new Product(10, "Headphone", 2, LocalDate.of(2022, 3,12), 5,false);
    public static List<Product> createListProduct(){
        List<Product> listProduct = new ArrayList<>();
        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
        listProduct.add(product6);
        listProduct.add(product7);
        listProduct.add(product8);
        listProduct.add(product9);
        listProduct.add(product10);
        return listProduct;
    }
    public static List<String> filterListProductBySaleDateAndQuality(List<Product> listProduct){
        List<String> result = new ArrayList<>();
        createListProduct().stream()
                .filter(product -> product.getQuality() > 0 && product.getSaleDate().isAfter(LocalDate.now()))
                .collect(Collectors.toList()).forEach(product -> result.add("id: "+product.getId() + " name: " + product.getName()));
        return result;
    }
}
