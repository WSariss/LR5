public class Customer {
    // Змінні класу з приватним модифікатором доступу
    private String name;    // Ім'я покупця
    private String address; // Адреса покупця
    private int age;        // Вік покупця

    // Конструктор класу Customer
    public Customer(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // Метод для встановлення імені покупця має модифікатор public тому, що
    // потрібно, щоб змінні були доступні для всіх.
    public void setName(String name) {  // Зазначено модифікатор "public" для зміни імені покупця
        this.name = name;
    }

    // Метод для отримання адреси покупця також має модифікатор public тому, що
    // потрібно, щоб змінні були доступні для всіх.
    public String getAddress() {  // Зазначено модифікатор "public" для доступу до адреси покупця
        return address;
    }

    // Метод для встановлення адреси покупця також має модифікатор public тому, що
    // потрібно, щоб змінні були доступні для всіх.
    public void setAddress(String address) {  // Зазначено модифікатор "public" для зміни адреси покупця
        this.address = address;
    }

    // Метод для отримання віку покупця також має модифікатор public тому, що
    // потрібно, щоб змінні були доступні для всіх.
    public int getAge() {  // Зазначено модифікатор "public" для доступу до віку покупця
        return age;
    }

    // Метод для встановлення віку покупця також має модифікатор public тому, що
    // потрібно, щоб змінні були доступні для всіх.
    public void setAge(int age) {  // Зазначено модифікатор "public" для зміни віку покупця
        this.age = age;
    }

    // Метод для виведення інформації про покупця, також має модифікатор public тому, що
    // змінні повні бути доступні для виведення ззовні класу.
    public void displayInfo() {  // Зазначено модифікатор "public" для виведення інформації про покупця
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
