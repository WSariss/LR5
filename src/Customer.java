public class Customer {
    private String name;    // Ім'я покупця
    private String address; // Адреса покупця
    private int age;        // Вік покупця

    // Конструктор класу Customer
    public Customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // Метод для встановлення імені покупця
    public void setName(String name) {
        this.name = name;
    }

    // Метод для отримання адреси покупця
    public String getAddress() {
        return address;
    }

    // Метод для встановлення адреси покупця
    public void setAddress(String address) {
        this.address = address;
    }

    // Метод для отримання віку покупця
    public int getAge() {
        return age;
    }

    // Метод для встановлення віку покупця
    public void setAge(int age) {
        this.age = age;
    }

    // Метод для виведення інформації про покупця
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Створення об'єкту першого покупця
        Customer customer1 = new Customer("John Doe", "123 Main St", 30);

        // Виведення інформації про першого покупця
        customer1.displayInfo();

        // Створення об'єкту другого покупця
        Customer customer2 = new Customer("Jane Smith", "456 Elm St", 25);

        // Виведення інформації про другого покупця
        customer2.displayInfo();
    }
}
