

void main() {
    Product bread = new Product("Bread",4, 1.0);
    Product cheese = new Product("Cheese", 4, 3.0);
    Product fruit = new Product("Fruit", 4, 2.0);
    Product toiletPaper = new Product("Toilet paper", 4, 2.5);
    SuperMarket superMarket = new SuperMarket(bread, fruit, toiletPaper, cheese);
    Customer customer = new Customer("Customer");


    String name = IO.readln("Which product do you want to buy?");
    int amount = Integer.parseInt(IO.readln("How many do you want to buy?"));


    customer.buyItem(name, amount);
    customer.goToSupermarket(superMarket);
    customer.buyItem(name, amount);

//        Dit kan ook
    customer.buyItem("cheese", 2);

//        Deze moeten foutmeldingen geven
    customer.buyItem("fruit", 200);
    customer.buyItem("beer", 24);
}
