package application;

import entities.Product;
import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

public class App {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet",350.50));
        list.add(new Product("HD Case",80.90));

        Function<Product, String> func = p -> p.getName().toUpperCase();

        List<String> UpperCase = list.stream().map(func).toList();

        UpperCase.forEach(System.out::println);
    }
}
