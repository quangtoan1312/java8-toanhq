import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Function {
    /**
     * Find product by input id not using stream
     * @param listProduct
     * @param idProduct
     * @return product
     */
    public static Product filterProductById(ArrayList<Product> listProduct, int idProduct){
        for (Product product: listProduct){
            if (product.getId() == idProduct){
                return product;
            }
        }
        return null;
    }

    /**
     * List product that quality > 0 and not delete
     * @param listProduct
     * @return new list
     */
    public static ArrayList<Product> filterProductByQuality (ArrayList<Product> listProduct){
        ArrayList<Product> newList = new ArrayList<>();
        for (Product product: listProduct){
            if (product.getQuality() > 0 && !product.isDelete()){
                newList.add(product);
            }
        }
        return newList;


    }

    /**
     * List product that sale day > today and not deleted
     * @param listProduct
     * @return new list
     */
    public static ArrayList<Product> filterProductBySaleDate(ArrayList<Product> listProduct){
        ArrayList<Product> newList = new ArrayList<>();
        for (Product product: listProduct){
            if (product.getSaleDate().isAfter(LocalDate.now()) && !product.isDelete()){
                newList.add(product);
            }
        }
        return newList;
    }

    /**
     * Total all products that not deleted
     * @param listProduct
     * @return
     */
    public static int totalProduct(ArrayList<Product> listProduct){
        int sum = 0;
        for (Product product: listProduct){
            if (!product.isDelete()){
                sum += product.getQuality();
            }
        }
        return sum;
    }

    public static boolean isHaveProductInCategory(ArrayList<Product> listProduct, int categoryId){
        for (Product product: listProduct){
            if (product.getCategoryId() == categoryId){
                return true;
            }
        }
        return false;
    }

}
