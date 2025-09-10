import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

class Flower {
    private String name;
    private LocalDate expiryDate;
    private double price;

    public Flower() {
        this.name = "Unknown";
        this.expiryDate = LocalDate.now().plusDays(7);
        this.price = 0.0;
    }

    public Flower(String name, LocalDate expiryDate, double price) {
        this.name = name;
        this.expiryDate = expiryDate;
        this.price = price;
    }

    public Flower(String name) {
        this.name = name;
        this.expiryDate = LocalDate.now().plusDays(7);
        this.price = 0.0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Flower Name: " + name + ", Expiry Date: " + 
                           expiryDate.format(formatter) + ", Price: $" + price);
    }

    public void displayDetails(String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(message);
        System.out.println("Flower Name: " + name + ", Expiry Date: " + 
                           expiryDate.format(formatter) + ", Price: $" + price);
    }

    public boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }
}

class Rose extends Flower {
    private String color;
    private boolean hasThorns;

    public Rose() {
        super();
        this.color = "Red";
        this.hasThorns = true;
    }

    public Rose(String name, LocalDate expiryDate, double price, String color, boolean hasThorns) {
        super(name, expiryDate, price);
        this.color = color;
        this.hasThorns = hasThorns;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean hasThorns() {
        return hasThorns;
    }

    public void setHasThorns(boolean hasThorns) {
        this.hasThorns = hasThorns;
    }

    @Override
    public void displayDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Rose - Name: " + getName() + ", Expiry: " + 
                           getExpiryDate().format(formatter) + ", Price: $" + getPrice() +
                           ", Color: " + color + ", Has Thorns: " + hasThorns);
    }

    @Override
    public void displayDetails(String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(message);
        System.out.println("Rose - Name: " + getName() + ", Expiry: " + 
                           getExpiryDate().format(formatter) + ", Price: $" + getPrice() +
                           ", Color: " + color + ", Has Thorns: " + hasThorns);
    }
}

class Tulip extends Flower {
    private int petalCount;
    private String variety;

    public Tulip() {
        super();
        this.petalCount = 6;
        this.variety = "Standard";
    }

    public Tulip(String name, LocalDate expiryDate, double price, int petalCount, String variety) {
        super(name, expiryDate, price);
        this.petalCount = petalCount;
        this.variety = variety;
    }

    public int getPetalCount() {
        return petalCount;
    }

    public void setPetalCount(int petalCount) {
        this.petalCount = petalCount;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    @Override
    public void displayDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Tulip - Name: " + getName() + ", Expiry: " + 
                           getExpiryDate().format(formatter) + ", Price: $" + getPrice() +
                           ", Petal Count: " + petalCount + ", Variety: " + variety);
    }

    @Override
    public void displayDetails(String message) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(message);
        System.out.println("Tulip - Name: " + getName() + ", Expiry: " + 
                           getExpiryDate().format(formatter) + ", Price: $" + getPrice() +
                           ", Petal Count: " + petalCount + ", Variety: " + variety);
    }
}

class FlowerShop {
    private ArrayList<Flower> flowerList;

    public FlowerShop() {
        flowerList = new ArrayList<>();
    }

    public void addFlower(Flower flower) {
        flowerList.add(flower);
        System.out.println("Flower added successfully.");
    }

    public void addFlower(String name, LocalDate expiryDate, double price) {
        Flower flower = new Flower(name, expiryDate, price);
        flowerList.add(flower);
        System.out.println("Flower added successfully.");
    }

    public void removeFlower(String name) {
        boolean removed = flowerList.removeIf(flower -> flower.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Flower removed successfully.");
        } else {
            System.out.println("Flower not found.");
        }
    }

    public void displayAllFlowers() {
        if (flowerList.isEmpty()) {
            System.out.println("No flowers in the shop.");
        } else {
            System.out.println("\n=== All Flowers ===");
            for (Flower f : flowerList) {
                f.displayDetails();
            }
        }
    }

    public void displayFlowersByExpiryDate(LocalDate expiryDate) {
        ArrayList<Flower> filteredFlowers = flowerList.stream()
                .filter(flower -> flower.getExpiryDate().equals(expiryDate))
                .collect(Collectors.toCollection(ArrayList::new));
        
        if (filteredFlowers.isEmpty()) {
            System.out.println("No flowers found with expiry date: " + expiryDate);
        } else {
            System.out.println("\n=== Flowers with Expiry Date: " + expiryDate + " ===");
            for (Flower f : filteredFlowers) {
                f.displayDetails();
            }
        }
    }

    public void displayExpiredFlowers() {
        ArrayList<Flower> expiredFlowers = flowerList.stream()
                .filter(Flower::isExpired)
                .collect(Collectors.toCollection(ArrayList::new));
        
        if (expiredFlowers.isEmpty()) {
            System.out.println("No expired flowers found.");
        } else {
            System.out.println("\n=== Expired Flowers ===");
            for (Flower f : expiredFlowers) {
                f.displayDetails("EXPIRED: ");
            }
        }
    }
}

public class FlowerManagementSystem {
    public static void main(String[] args) {
        System.out.println("=== Flower Management System ===");
        System.out.println("Developed for CSE282 Lab Tasks");
        
        FlowerShop shop = new FlowerShop();
        Scanner scanner = new Scanner(System.in);
        int choice;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        do {
            System.out.println("\n--- Flower Management System Menu ---");
            System.out.println("1. Add Flower");
            System.out.println("2. Add Rose");
            System.out.println("3. Add Tulip");
            System.out.println("4. Remove Flower");
            System.out.println("5. Display All Flowers");
            System.out.println("6. Display Flowers by Expiry Date");
            System.out.println("7. Display Expired Flowers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a valid number.");
                scanner.next();
            }
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter flower name: ");
                    String name = scanner.nextLine();
                    
                    LocalDate date = null;
                    boolean validDate = false;
                    while (!validDate) {
                        System.out.print("Enter expiry date (YYYY-MM-DD): ");
                        String dateStr = scanner.nextLine();
                        try {
                            date = LocalDate.parse(dateStr, formatter);
                            validDate = true;
                        } catch (Exception e) {
                            System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
                        }
                    }
                    
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine();
                    
                    shop.addFlower(name, date, price);
                    break;
                    
                case 2:
                    System.out.print("Enter rose name: ");
                    String roseName = scanner.nextLine();
                    
                    LocalDate roseDate = null;
                    boolean validRoseDate = false;
                    while (!validRoseDate) {
                        System.out.print("Enter expiry date (YYYY-MM-DD): ");
                        String dateStr = scanner.nextLine();
                        try {
                            roseDate = LocalDate.parse(dateStr, formatter);
                            validRoseDate = true;
                        } catch (Exception e) {
                            System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
                        }
                    }
                    
                    System.out.print("Enter price: ");
                    double rosePrice = scanner.nextDouble();
                    scanner.nextLine();
                    
                    System.out.print("Enter color: ");
                    String color = scanner.nextLine();
                    
                    System.out.print("Does it have thorns? (true/false): ");
                    boolean hasThorns = scanner.nextBoolean();
                    scanner.nextLine();
                    
                    Rose rose = new Rose(roseName, roseDate, rosePrice, color, hasThorns);
                    shop.addFlower(rose);
                    break;
                    
                case 3:
                    System.out.print("Enter tulip name: ");
                    String tulipName = scanner.nextLine();
                    
                    LocalDate tulipDate = null;
                    boolean validTulipDate = false;
                    while (!validTulipDate) {
                        System.out.print("Enter expiry date (YYYY-MM-DD): ");
                        String dateStr = scanner.nextLine();
                        try {
                            tulipDate = LocalDate.parse(dateStr, formatter);
                            validTulipDate = true;
                        } catch (Exception e) {
                            System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
                        }
                    }
                    
                    System.out.print("Enter price: ");
                    double tulipPrice = scanner.nextDouble();
                    scanner.nextLine();
                    
                    System.out.print("Enter petal count: ");
                    int petalCount = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Enter variety: ");
                    String variety = scanner.nextLine();
                    
                    Tulip tulip = new Tulip(tulipName, tulipDate, tulipPrice, petalCount, variety);
                    shop.addFlower(tulip);
                    break;

                case 4:
                    System.out.print("Enter flower name to remove: ");
                    String removeName = scanner.nextLine();
                    shop.removeFlower(removeName);
                    break;

                case 5:
                    shop.displayAllFlowers();
                    break;
                    
                case 6:
                    LocalDate searchDate = null;
                    boolean validSearchDate = false;
                    while (!validSearchDate) {
                        System.out.print("Enter expiry date to search (YYYY-MM-DD): ");
                        String dateStr = scanner.nextLine();
                        try {
                            searchDate = LocalDate.parse(dateStr, formatter);
                            validSearchDate = true;
                        } catch (Exception e) {
                            System.out.println("Invalid date format. Please use YYYY-MM-DD format.");
                        }
                    }
                    shop.displayFlowersByExpiryDate(searchDate);
                    break;
                    
                case 7:
                    shop.displayExpiredFlowers();
                    break;

                case 0:
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
