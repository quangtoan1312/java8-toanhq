import java.time.LocalDate;
import java.util.Date;

public class Product {
    private int id;
    private String name;
    private int categoryId;
    private LocalDate saleDate;
    private int quality;
    private boolean isDelete;

    public Product(int id, String name, int categoryId, LocalDate saleDate, int quality, boolean isDelete){
        this.id=id;
        this.name=name;
        this.categoryId=categoryId;
        this.saleDate=saleDate;
        this.quality=quality;
        this.isDelete=isDelete;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public int getQuality() {
        return quality;
    }

    public boolean isDelete() {
        return isDelete;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    @Override
    public String toString() {
        return "Product@[ID: " + id + ", name: " + name + ", Category ID: " + categoryId + ", saleDate: " + saleDate + ", quality: " + quality + "]";
    }

}
