import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main (String[] args){
       ArrayList<Product> listProduct = new ArrayList<>();
        Product product1 = new Product(1, "CPU", 1, LocalDate.of(2022, 12,12), 10,false);
        Product product2 = new Product(2, "Mainboard", 1, LocalDate.of(2022, 11,12), 34,true);
        Product product3 = new Product(3, "RAM", 1, LocalDate.of(2022, 10,12), 0,false);
        Product product4 = new Product(4, "GPU", 1, LocalDate.of(2022, 9,12), 6,false);
        Product product5 = new Product(5, "PSU", 1, LocalDate.of(2022, 8,12), 3,false);
        Product product6 = new Product(6, "Case", 1, LocalDate.of(2022, 7,12), 2,false);
        Product product7 = new Product(7, "Monitor", 2, LocalDate.of(2022, 6,12), 1,false);
        Product product8 = new Product(8, "Mouse", 2, LocalDate.of(2022, 5,12), 8,false);
        Product product9 = new Product(9, "Keyboard", 2, LocalDate.of(2022, 4,12), 4,false);
        Product product10 = new Product(10, "Headphone", 2, LocalDate.of(2022, 3,12), 5,false);

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
        /**
         * Filter product by id
         * Not use stream and use stream
         */
//        System.out.println(Function.filterProductById(listProduct, 1));
//
//        Product product = listProduct.stream()
//                .filter((product11 -> 1 == product11.getId()))
//                .findAny()
//                .orElse(null);
//        System.out.println(product);

        /**
         * Filter product by quality
         * Not use stream and use stream
         */
//        ArrayList<Product> newList = Function.filterProductByQuality(ProductImp.createListProduct());
//        for (Product product: newList){
//            System.out.println(product);
//        }

//        List<Product> newList = listProduct.stream()
//                .filter(product -> 0 < product.getQuality() && !product.isDelete())
//                        .collect(Collectors.toList());
//        newList.forEach(System.out::println);

        /**
         * Filter list product by sale day
         * not use stream and use stream
         */
//        ArrayList<Product> newList = Function.filterProductBySaleDate(listProduct);
//        for (Product product: newList){
//            System.out.println(product);
//        }

//        List<Product> newList = listProduct.stream()
//                .filter(product -> LocalDate.now().isBefore(product.getSaleDate()) && !product.isDelete())
//                .collect(Collectors.toList());
//        newList.forEach(System.out::println);

        /**
         * Sum products that not deleted
         * Non-stream and stream
         */
//        System.out.println(Function.totalProduct(listProduct));
//
//        int sum = listProduct.stream()
//                .filter(product -> !product.isDelete())
//                .reduce(0, (a,b) -> a+b.getQuality(), Integer::sum);
//        System.out.println(sum);

        /**
         * Check if the product is in the given category id
         */
//        System.out.println(Function.isHaveProductInCategory(listProduct,3));
//
//        boolean check = listProduct.stream()
//                .anyMatch(product -> product.getCategoryId() == 1);
//        System.out.println(check);


        List<String> newList = new ArrayList<>();
        listProduct.stream()
                        .filter(product -> product.getQuality() > 0 && product.getSaleDate().isAfter(LocalDate.now()))
                                .collect(Collectors.toList())
                                        .forEach((product -> newList.add("ID: " + product.getId() + " name: " + product.getName())));
        newList.forEach(System.out::println);

    }
}

