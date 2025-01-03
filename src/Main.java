

import Design_Pattern.Builder_Pattern.Builder.ProductBuilder;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ProductBuilder computer = new ProductBuilder.ComputerBuilder("Intel i7", "16GB")
                .setStorage("1TB SSD")
                .setGraphicsCardEnabled(true)
                .build();

        System.out.println(computer);

        kb.close();
    }


}

