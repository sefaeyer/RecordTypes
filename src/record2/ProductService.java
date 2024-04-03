package record2;

import java.util.ArrayList;
import java.util.List;

//product ile ilgili islemler
public class ProductService {

    List<Product> products=new ArrayList<>();


    //yeni bir urun ekleme
    public void addProduct(Product product){
        this.products.add(product);
    }


    //listeden bir urunu iptal etme
    public void removeProduct(Product product){
        this.products.remove(product);
    }


    //tum urunleri listeleme
    public void allProducts(){
        for (Product p:this.products){
            System.out.println("Urun adi: "+p.name()+" - Fiyati : "+p.price()+" - Stok : "+p.stock());
        }
    }


    //sadece mevcut olan urunleri listeleme
    public void availableProducts(){
        for (Product p:this.products){
            if (p.stock()>0) {
                System.out.println("Urun adi: "+p.name()+" - Fiyati : "+p.price()+" - Stok : "+p.stock());
            }
        }
    }

}
