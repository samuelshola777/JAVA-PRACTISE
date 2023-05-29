package chapter7.totalSales;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.List;

public class SalesPerson {

    private String name;
    private String productNumber;
    private Product products;

    public SalesPerson(String name, String productNumber,Product products ) {
        this.name = name;
        this.productNumber = productNumber;
        this.products = products;
    }

    public SalesPerson() {
    }

    public static void main(String[] args) {
        System.out.print("sales person  "+" product"+"  total sales for the month\n");
        int[][] saleTable = new int[4][5];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                
                System.out.print(saleTable[i][j]+"           ");
            }
            System.out.println();
        }

    }
}
