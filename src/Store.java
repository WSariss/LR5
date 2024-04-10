public class Store {
    // Змінні класу з приватним модифікатором доступу
    private String name;      // Назва магазину
    private String location;  // Місцезнаходження магазину
    private int numOfItems;   // Кількість товарів в магазині
    // Статична змінна для підрахунку загальної кількості товарів у всіх магазинах
    private static int totalItems = 0;

    // Конструктор класу Store
    public Store(String name, String location, int numOfItems) {
        this.name = name;
        this.location = location;
        this.numOfItems = numOfItems;
        totalItems += numOfItems; // Додавання кількості товарів цього магазин до загальної кількості товарів
    }

    // Методи для отримання назви магазину з модифікатором доступу public,
    // для того, щоб змінні були доступні ззовні класу.
    public String getName() {  // Зазначено модифікатор "public" для доступу до назви магазину
        return name;
    }

    public void setName(String name) {  // Зазначено модифікатор "public" для зміни назви магазину
        this.name = name;
    }

    // Методи для отримання місцезнаходження магазину також мають модифікатор public,
    // для доступу до цих змінних ззовні класу.
    public String getLocation() {  // Зазначено модифікатор "public" для доступу до місцезнаходження магазину
        return location;
    }

    public void setLocation(String location) {  // Зазначено модифікатор "public" для зміни місцезнаходження магазину
        this.location = location;
    }

    // Методи для отримання кількості товарів в магазині також мають модифікатор public,
    // для доступу до цих змінних ззовні класу.
    public int getNumOfItems() {  // Зазначено модифікатор "public" для доступу до кількості товарів в магазині
        return numOfItems;
    }

    public void setNumOfItems(int numOfItems) {  // Зазначено модифікатор "public" для зміни кількості товарів в магазині
        this.numOfItems = numOfItems;
    }

    // Метод для виведення інформації про магазин,
    // також має модифікатор public тому, що
    // змінні повні бути доступні для виведення ззовні класу.
    public void displayInfo() {  // Зазначено модифікатор "public" для виведення інформації про магазин
        System.out.println("Store Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Items: " + numOfItems);
    }

    public static void displayTotalItems(){
        System.out.println("Total items in all stores: " + totalItems);
    }

    // Статичний метод для порівняння кількості товарів удвох магазинах
    public static void compareStores(Store store1, Store store2) {
        if (store1.getNumOfItems() > store2.getNumOfItems()) {
            System.out.println(store1.getName() + "has more items than" + store2.getName());
        } else if (store1.getNumOfItems() < store2.getNumOfItems()) {
            System.out.println(store2.getName() + "has more items than" + store1.getName());
        } else {
            System.out.println("Both stores have the same number of items.");
        }
    }

    public static void main(String[] args) {
        // Створення об'єкту першого магазину
        Store store1 = new Store("Store A", "Location A", 100);

        // Виведення інформації про перший магазин
        store1.displayInfo();

        // Створення об'єкту другого магазину
        Store store2 = new Store("Store B", "Location B", 200);

        // Виведення інформації про другий магазин
        store2.displayInfo();

        // Виведення загальної кількості товарів у всіх магазинах
        Store.displayTotalItems();

        // Порівняння кількості товарів у двох магазинах
        Store.compareStores(store1, store2);
    }
}
