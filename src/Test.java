public class Test {
    public static void main(String[] args) {
        FunctionProduct functionProduct = new FunctionProduct();

        functionProduct.creatObject();

        String path = "C:\\Gin\\module2\\Binary File Serialization\\quan li san pham file nhi phan\\src\\example.txt";
        functionProduct.writeToFile(functionProduct.containsObject, path);

        functionProduct.readFromFile(path);

        functionProduct.displayProduct();

        Product searchById = functionProduct.searchProduct(3);

        System.out.println(searchById.toString());
    }
}
