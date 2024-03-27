public class Store {
    private String name;      // Назва магазину
    private String location;  // Місцезнаходження магазину
    private int numOfItems;   // Кількість товарів в магазині

    // Конструктор класу Store
    public Store(String name, String location, int numOfItems) {
        this.name = name;
        this.location = location;
        this.numOfItems = numOfItems;
    }

    // Метод для отримання назви магазину
    public String getName() {
        return name;
    }

    // Метод для встановлення назви магазину
    public void setName(String name) {
        this.name = name;
    }

    // Метод для отримання місцезнаходження магазину
    public String getLocation() {
        return location;
    }

    // Метод для встановлення місцезнаходження магазину
    public void setLocation(String location) {
        this.location = location;
    }

    // Метод для отримання кількості товарів в магазині
    public int getNumOfItems() {
        return numOfItems;
    }

    // Метод для встановлення кількості товарів в магазині
    public void setNumOfItems(int numOfItems) {
        this.numOfItems = numOfItems;
    }

    // Метод для виведення інформації про магазин
    public void displayInfo() {
        System.out.println("Store Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Items: " + numOfItems);
    }
}