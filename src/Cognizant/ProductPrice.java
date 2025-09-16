package Cognizant;

public class ProductPrice {

    public static int ProductPriceCount(String s) {
        String product[] = s.split(";");
        int price = 0;
        for (String key : product) {
            String parts[] = key.split(":");
            price+= Integer.parseInt(parts[1].trim())*Integer.parseInt(parts[2].trim());
        }
        return price;
    }

    public static void main(String[] args) {
        String s = "apple:250:10;Bannana:120:15;orange:300:5";
        System.out.println(ProductPriceCount(s));
    }
}
