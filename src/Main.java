import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main (String[] args){
        ArrayList<ProductIdName> listIdName = new ArrayList<>();
        /**
         * Filter product by id
         * Not use stream and use stream
         */
//        System.out.println(Function.filterProductById(listProduct, 1));

//        Product product = listProduct.stream()
//                .filter((product11 -> 1 == product11.getId()))
//                .findAny()
//                .orElse(null);
//        System.out.println(product);

        /**
         * Filter product by quality
         * Not use stream and use stream
         */
//        ArrayList<Product> newList = Function.filterProductByQuality(listProduct);
//        for (Product product: newList){
//            System.out.println(product);
//        }

//        List<Product> newList = listProduct.stream()
//                .filter(productx -> 0 < productx.getQuality() && !productx.isDelete())
//                .collect(Collectors.toList());
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

//            ProdcutImpl.filterListProductBySaleDateAndQuality(ProdcutImpl.createListProduct()).forEach(element -> System.out.println() );       ProdcutImpl.createListProduct().stream().filter(product -> product.getQuality()>0 && product.getSaleDate().isAfter(LocalDate.now())).forEach(product -> System.out.println(product));
            ProdcutImpl.filterListProductBySaleDateAndQuality(ProdcutImpl.createListProduct()).forEach(element -> System.out.println(element));
    }
}
