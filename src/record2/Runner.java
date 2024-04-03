package record2;

public class Runner {
    public static void main(String[] args) {

        Product product1=new Product("Laptop",120.99,9);
        Product product2=new Product("MobilePhone",80.99,15);

        //urunleri ekleme
        ProductService service=new ProductService();
        service.addProduct(product1);
        service.addProduct(product2);

        //mevcut olan tum urunleri listeleme
        System.out.println("Stoktakiler: ");
        service.availableProducts();

        //product2.stock();


    }
}
