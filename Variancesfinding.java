import java.util.*;

class Variancesfinding {
    public static void main(String args[]) {
        List<Data> salesof2021 = new ArrayList<>();
        salesof2021.add(new Data("Tea", 100));
        salesof2021.add(new Data("Coffee", 250));
        salesof2021.add(new Data("Green tea", 50));
        salesof2021.add(new Data("Orange Soda", 180));
        salesof2021.add(new Data("Lemon soda", 220));
        System.out.println("The Sales of 2021 for a Tea Time Coffee Shop :");
        for (int k = 0; k < salesof2021.size(); k++) {
            System.out.println(salesof2021.get(k));
        }

        List<Data> salesof2022 = new ArrayList<>();
        salesof2022.add(new Data("Tea", 120));
        salesof2022.add(new Data("Coffee", 230));
        salesof2022.add(new Data("Green tea", 60));
        salesof2022.add(new Data("Orange Soda", 210));
        salesof2022.add(new Data("Lemon soda", 205));
        System.out.println("The Sales of 2022 for a Tea Time Coffee Shop :");
        for (int l = 0; l < salesof2022.size(); l++) {
            System.out.println(salesof2022.get(l));
        }

        List<Double> variances = new ArrayList<>();
        List<Double> variancespercentage = new ArrayList<>();

        for (int i = 0; i < salesof2022.size(); i++) {
            variances.add(salesof2022.get(i).getvalue() - salesof2021.get(i).getvalue());
        }
        System.out.println("The Difference of the products in Tea Time Coffee Shop while compare with price of 2021 :");
        for (int m = 0; m < salesof2022.size(); m++) {
            System.out.println(salesof2022.get(m).getproduct() + "  " + variances.get(m));
        }

        for (int j = 0; j < salesof2022.size(); j++) {
            variancespercentage.add(Math.abs(variances.get(j) / salesof2022.get(j).getvalue()) * 100);
        }
        System.out.println(
                "The Difference percentage of the products in Tea Time Coffee Shop while compare with price of 2021 :");
        for (int n = 0; n < salesof2022.size(); n++) {
            System.out.println(salesof2022.get(n).getproduct() + "  " + variancespercentage.get(n));
        }
    }
}