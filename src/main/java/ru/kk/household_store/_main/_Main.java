package ru.kk.household_store._main;

import ru.kk.household_store.model.entity.Catalog;
import ru.kk.household_store.model.entity.Product;
import ru.kk.household_store.model.entity.User;
import ru.kk.household_store.model.entity.UserData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;


public class _Main {
    public static void main(String[] args) {
        HashMap<Integer, Product> products = new HashMap<>();
        products.put(1, new Product("Шкаф KLEEP 3х-дверный, белый", 12906.12, 3000));
        products.put(2, new Product("Диван-кровать BARSLOV 3х-местный, светло-бирюзовый", 95393.03, 45));
        products.put(3, new Product("Комод Kullen с 6 ящиками, бежевый", 11110.48, 4480));
        products.put(4, new Product("Игровой стол FREDDE, чёрный", 25700.01, 1500));
        products.put(5, new Product("Кресло с откидной спинкой EKOLSUND, тёмно-розовое", 42534.07, 2008));
        products.put(6, new Product("Половник для супа FULLANDAN, серый", 84.2, 2000));
        products.put(7, new Product("Кастрюля с крышкой MIDDAGSMAT, 5л, прозрачное стекло/нержавеющая сталь", 1122.27, 445));
        products.put(8, new Product("Дуршлаг KLOCKREN, 5л", 1346.73, 348));
        products.put(9, new Product("Форма для запекания GLADELIG, 2 шт., синяя", 3254.59, 168));
        products.put(10, new Product("Разделочная доска PROPPMATT, бук", 897.82, 500));
        products.put(11, new Product("Простынь на резинке ULLVIDE, двойная, насыщенно-красная", 1739.52, 15000));
        products.put(12, new Product("Плотные шторы LONNSTAVMAL, 1 пара, светло-оливковые", 7855.9, 8000));
        products.put(13, new Product("Чехол на подушку SVARTPOPPEL, синий", 897.82, 17000));
        products.put(14, new Product("Плед HOLMVI, серый", 785.59, 2700));
        products.put(15, new Product("Одеяло DAJLIEN светло-зеленое", 2244.54, 1785));
        products.put(16, new Product("Настольная лампа TARNABY,с регулируемой яркостью, бежевая", 2132.31, 6000));
        products.put(17, new Product("Светодиодный настенный светильник FUBBLA, белый", 2805.68, 5780));
        products.put(18, new Product("Торшер BARLAST, черный", 1010.04, 1300));
        products.put(19, new Product("Светодиодная лента ATTENSTEN, 1м, белая", 561.14, 400));
        products.put(20, new Product("Светодиодная декоративная настольная лампа WELERT, желтое стекло/на батарейках", 561.14, 3000));
        products.put(21, new Product("Полотенцесушитель BROGRUND, нержавеющая сталь", 1346.73, 88));
        products.put(22, new Product("Дозатор для мыла EKOLN, бежевый", 421, 4010));
        products.put(23, new Product("Подставка для зубных щеток DRAGAN, бамбук", 785.82, 1176));
        products.put(24, new Product("Коврик для ванной ALSTERN, золотисто-жёлтый", 730, 25));
        products.put(25, new Product("Занавеска для душа SVARTSTARR, белый/серый", 1683.91, 11));
        /*Выведете в консоль информацию обо всех товарах: */
        Set<HashMap.Entry<Integer, Product>> productEntrySet = products.entrySet();
        productEntrySet
                .forEach(entry -> {
                    System.out.println("Индекс товара: " + entry.getValue().getIdProduct());
                    System.out.println("Наименование товара: " + entry.getValue().getNameProduct());
                    System.out.println("Цена товара: " + entry.getValue().getPriceProduct());
                    System.out.println("Количество товара на складе: " + entry.getValue().getQuantityInStock());
                    System.out.println("-----------------------");
                });

        HashMap<Integer, Product> catalogFurniture = new HashMap<>();
        catalogFurniture.put(1, products.get(1));
        catalogFurniture.put(2, products.get(2));
        catalogFurniture.put(3, products.get(3));
        catalogFurniture.put(4, products.get(4));
        catalogFurniture.put(5, products.get(5));
        HashMap<Integer, Product> catalogKitchenware = new HashMap<>();
        catalogKitchenware.put(6, products.get(6));
        catalogKitchenware.put(7, products.get(7));
        catalogKitchenware.put(8, products.get(8));
        catalogKitchenware.put(9, products.get(9));
        catalogKitchenware.put(10, products.get(10));
        HashMap<Integer, Product> catalogTextiles = new HashMap<>();
        catalogTextiles.put(11, products.get(11));
        catalogTextiles.put(12, products.get(12));
        catalogTextiles.put(13, products.get(13));
        catalogTextiles.put(14, products.get(14));
        catalogTextiles.put(15, products.get(15));
        HashMap<Integer, Product> catalogLighting = new HashMap<>();
        catalogLighting.put(16, products.get(16));
        catalogLighting.put(17, products.get(17));
        catalogLighting.put(18, products.get(18));
        catalogLighting.put(19, products.get(19));
        catalogLighting.put(20, products.get(20));
        HashMap<Integer, Product> catalogBathroomProducts = new HashMap<>();
        catalogBathroomProducts.put(21, products.get(21));
        catalogBathroomProducts.put(22, products.get(22));
        catalogBathroomProducts.put(23, products.get(23));
        catalogBathroomProducts.put(24, products.get(24));
        catalogBathroomProducts.put(25, products.get(25));

        Catalog furniture = new Catalog("Мебель", new ArrayList<>(catalogFurniture.values()));
        Catalog kitchenware = new Catalog("Кухонная утварь", new ArrayList<>(catalogKitchenware.values()));
        Catalog textiles = new Catalog("Текстиль", new ArrayList<>(catalogTextiles.values()));
        Catalog lighting = new Catalog("Освещение", new ArrayList<>(catalogLighting.values()));
        Catalog bathroomProducts = new Catalog("Товары для ванной", new ArrayList<>(catalogBathroomProducts.values()));

        List<Catalog> allCatalogs = new ArrayList<>();
        allCatalogs.add(furniture);
        allCatalogs.add(kitchenware);
        allCatalogs.add(textiles);
        allCatalogs.add(lighting);
        allCatalogs.add(bathroomProducts);
//Выведете в консоль информацию обо всех разделах каталога и товарах которые лежат в каждом разделе
        allCatalogs.forEach(catalog -> {
            System.out.println("Каталог: " + catalog.getCatalogName() + " ID каталога: " + catalog.getCatalogId());
            catalog.getProducts().forEach(product -> System.out.println("ID-" + product.getIdProduct() + " Название товара: " + product.getNameProduct() + " Цена товара: " + product.getPriceProduct() + " Количество на складе: " + product.getQuantityInStock()));
        });

        User user1 = new User("Иванов Петр", "ivanovP23@gmail.com", "Мужской", "01.11.1986");
        User user2 = new User("Петрова Маргарита", "ritaAHHA89@mail.ru", "Женский", "05.08.1989");
        User user3 = new User("Сидоров Владимир", "sidoVlad12@gmail.com", "Мужской", "21.12.1996");
        User user4 = new User("Панкратова Екатерина", "ekPankr2000@gmail.com", "Женский", "09.01.2000");
        User user5 = new User("Ларина Татьяна", "12345lar@yandex.ru", "Женский", "18.05.1979");
        Map<Long, User> users = new HashMap<>();
        users.put(user1.getIdUser(), user1);
        users.put(user2.getIdUser(), user2);
        users.put(user3.getIdUser(), user3);
        users.put(user4.getIdUser(), user4);
        users.put(user5.getIdUser(), user5);
        //   Выведите в консоль информация о всех пользователях:
        Set<Map.Entry<Long, User>> usersEntrySet = users.entrySet();
        usersEntrySet
                .forEach(entry -> {
                    System.out.println("Информация о пользователe:");
                    System.out.println("ID пользователя:" + entry.getValue().getIdUser());
                    System.out.println("Имя и фамилия пользователя:" + entry.getValue().getNameUser());
                    System.out.println("Email: " + entry.getValue().getEmailUser());
                    System.out.println("Пол: " + entry.getValue().getGender());
                    System.out.println("Дата рождения: " + entry.getValue().getBirthDate());
                    System.out.println("-----------------------");
                });

//       выведите в консоль информацию о том, что положили в корзину такой-то товар
        Random random = new Random();
        for (User user : users.values()) {
            Catalog selectedCatalog = allCatalogs.get(random.nextInt(allCatalogs.size()));

            List<Product> userProducts = new ArrayList<>(selectedCatalog.getProducts());
            Product selectedProduct = userProducts.get(random.nextInt(userProducts.size()));
            System.out.println(
                    "Пользователь: " + user.getIdUser() + " " + user.getNameUser() + " положил в корзину товар c id = " + selectedProduct.getIdProduct() + " " + selectedProduct.getNameProduct() +
                            " из раздела каталога " + "ID " + selectedCatalog.getCatalogId() + " " + selectedCatalog.getCatalogName());

        }
        try {
            System.out.println();
            User newUser = createUser("Федоров Никита", "fedNikit@rambler.ru", "Мужской", "01.05.1980");
            System.out.println(newUser + " создался в базе данных\n");
            Product newProduct = createProduct("Постельное белье ERGA, темно-красные", 999.99, 10);
            System.out.println(newProduct + " создался в базе данных\n");
            Catalog newCatalog = createCatalog("Текстиль для спальни", new ArrayList<>());
            System.out.println("Новый каталог создан: " + newCatalog + "\n");
        } catch (CreationException e) {
            System.out.println("Ошибка при создании - " + e.getMessage() + "\n");
        }
        try {
            readEntityByIdUser(3907, users, "Степан Федоров", "fedor@mail.ru", "Мужской", "12.05.1998");
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            readEntityByIdProduct(23, products.get(23));
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            readEntityByIdCatalog(3322, furniture);
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            updateProductById(13, products, 324);
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }
        try {
            updateUserById(385027797876494473L, users, "Петров Владимир", "petrovV222LD@gmail.com");
        } catch (EntityNotFoundException e) {
            System.out.println(e.getMessage());
        }
        String productInfo = """
                Стол письменный YAVNE, коричневый_7800.50 рублей_количество на складе: 690 штук
                Шкаф для посуды MELLTORP, белый_5500.00 рубля_количество на складе: 350 штук
                Кресло розовое BERGMUND_3200.00 рублей_количество на складе: 135 штук
                Мягкий коврик на ванну TOFTBO, серый_250.00 рублей_количество на складе: 1200 штук
                Подушка для сна KONSLIG, 50x60 см, пух/перо_1200.00 рублей_количество на складе: 900 штук
                Чашки LAGAD, 6 штук, прозрачное стекло_500.00 рублей_количество на складе: 250 штук
                Кофейный столик KLUBBO, черный_1500.00 рублей_количество на складе: 800 штук
                Ваза для цветов OVANLIG, стеклянная, прозрачная_700.00 рублей_количество на складе: 300 штук
                Тарелки BLOMNING, 12 штук, цветные_1600.00 рублей_количество на складе: 480 штук
                Набор кастрюль и сковородок FLITIGHET, 5 предметов, нержавеющая сталь_2500.00 рублей_количество на складе: 400 штук
                """;

        // Чтение текстовых файлов с использованием Stream
        File productsFile = new File("products.txt");
        try (FileWriter fileWriter = new FileWriter(productsFile);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            writer.write(productInfo);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        try {
            // Чтение файла с товарами
            try (Stream<String> FileLines = Files.lines(Paths.get("products.txt"))) {
                FileLines.map(line -> line.split("_"))
                        .forEach(fields -> {
                            // Обработка данных
                            String nameProduct = fields[0];
                            double priceProduct = Double.parseDouble(fields[1].split(" ")[0]);
                            int quantityInStock = Integer.parseInt(fields[2].split(": ")[1].split(" ")[0]);
                            // Создание объектов продуктов или добавление их в коллекцию
                            Product product = new Product(nameProduct, priceProduct, quantityInStock);
                            products.put(product.getIdProduct(), product);
                            System.out.println(product);
                        });
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        Map<Long, UserData> usersData = new HashMap<>();
        usersData.put(4466123456L, new UserData(4466123456L, "Ларионова Жанна"));
        usersData.put(8655789012L, new UserData(8655789012L, "Ахметов Гаспар"));
        usersData.put(8744345678L, new UserData(8744345678L, "Смирнова Елена"));
        usersData.put(7811901234L, new UserData(7811901234L, "Удальцов Максим"));
        usersData.put(1113567890L, new UserData(1113567890L, "Дмитриева Антонина"));

        // Добавьте информацию о других пользователях

        File usersFile = new File("users.txt");

        try (FileWriter fileWriter = new FileWriter(usersFile);
             BufferedWriter writer = new BufferedWriter(fileWriter)) {
            for (Map.Entry<Long, UserData> entry : usersData.entrySet()) {
                writer.write(entry.getKey() + " " + entry.getValue().getUserFullName() + "\n");
            }
            System.out.println("Данные успешно записаны");
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    //CRUD methods
    public static User createUser(String nameUser, String emailUser, String gender, String birthDate) throws CreationException {
        if (nameUser == null || nameUser.isEmpty()) {
            throw new CreationException("Имя пользователя не может быть пустым\n");
        }
        if (emailUser == null || emailUser.isEmpty()) {
            throw new CreationException("Email пользователя не может быть пустым\n");
        }
        if (gender == null || gender.isEmpty()) {
            throw new CreationException("Пол пользователя не может быть пустым\n");
        }
        if (birthDate == null || birthDate.isEmpty()) {
            throw new CreationException("Дата рождения пользователя не может быть пустой\n");
        }

        return new User(nameUser, emailUser, gender, birthDate);
    }

    public static Product createProduct(String nameProduct, double priceProduct, int quantityInStock) throws CreationException {
        if (nameProduct == null || nameProduct.isEmpty()) {
            throw new CreationException("Название товара не может быть пустым\n");
        }
        if (priceProduct <= 0) {
            throw new CreationException("Цена товара должна быть больше 0\n");
        }
        if (quantityInStock < 0) {
            throw new CreationException("Количество товаров на складе на складе не может быть отрицательным\n");
        }
        return new Product(nameProduct, priceProduct, quantityInStock);
    }

    public static Catalog createCatalog(String catalogName, List<Product> products) throws CreationException {
        if (catalogName == null || catalogName.isEmpty()) {
            throw new CreationException("Название каталога не может быть пустым\n");
        }
        if (products == null || products.isEmpty()) {
            throw new CreationException("Каталог должен содержать хотя бы один товар");
        }
        return new Catalog(catalogName, products);
    }

    public static void readEntityByIdUser(long idUser, Map<Long, User> users, String nameUser, String emailUser, String gender, String birthDate) throws
            EntityNotFoundException {
        if (users.containsKey(idUser)) {
            User user = users.get(idUser);
            user.setNameUser(user.getNameUser());
            user.setEmailUser(user.getEmailUser());
            user.setGender(user.getGender());
            user.setBirthDate(user.getBirthDate());
            System.out.println("Информация о пользователе с id=" + idUser + " успешно обновлена\n");
        } else {
            throw new EntityNotFoundException("Пользователь с id=" + idUser + " не найден\n");
        }
    }

    public static void readEntityByIdProduct(int idProduct, Object entity) throws EntityNotFoundException {
        if (entity instanceof Product product) {
            if (product.getIdProduct() == idProduct) {
                System.out.println("Найден товар: " + product);
            } else {
                throw new EntityNotFoundException("Товар с id=" + idProduct + " не найден\n");
            }
        }
    }

    public static void readEntityByIdCatalog(long catalogId, Object entity) throws EntityNotFoundException {
        if (entity instanceof Catalog catalog) {
            if (catalog.getCatalogId() == catalogId) {
                System.out.println("Найден каталог: " + catalog);
            } else {
                throw new EntityNotFoundException("Каталог с id=" + catalogId + " не найден\n");
            }
        }
    }

    public static void updateUserById(long id, Map<Long, User> users, String newName, String newEmail) throws EntityNotFoundException {
        if (users.containsKey(id)) {
            User user = users.get(id);
            user.setNameUser(newName);
            user.setEmailUser(newEmail);
            System.out.println("Информация о пользователе с id=" + id + " успешно обновлена\n");
        } else {
            throw new EntityNotFoundException("Пользователь с id=" + id + " не найден\n");
        }
    }

    public static void updateProductById(int id, Map<Integer, Product> products, int updatedInfo) throws EntityNotFoundException {
        if (products.containsKey(id)) {
            Product product = products.get(id);
            product.setQuantityInStock(updatedInfo);
            System.out.println("Количество товара с id=" + id + " успешно обновлено\n");
        } else {
            throw new EntityNotFoundException("Товар с id=" + id + " не найден\n");
        }
    }

    public static boolean deleteUserById(long id, Map<Long, User> users) throws EntityNotFoundException {
        if (users.containsKey(id)) {
            users.remove(id);
            System.out.println("Пользователь с ID " + id + " был удален.");
            return true;
        } else {
            throw new EntityNotFoundException("Пользователь с ID " + id + " не найден.");
        }
    }

    public static boolean deleteProductById(int id, Map<Integer, Product> products) throws EntityNotFoundException{
        if (products.containsKey(id)) {
            products.remove(id);
            System.out.println("Продукт с ID " + id + " был удален.");
            return true;
        } else {
            throw new EntityNotFoundException("Продукт с ID " + id + " не найден.");
        }
    }

    public static boolean deleteCatalogById(long id, List<Catalog> catalogs) throws EntityNotFoundException{
        boolean removed = catalogs.removeIf(catalog -> catalog.getCatalogId() == id);
        if (removed) {
            System.out.println("Каталог с ID " + id + " был удален.");
        } else {
            throw new EntityNotFoundException("Каталог с ID " + id + " не найден.");
        }
        return removed;
    }
}

class CreationException extends Exception {
    public CreationException(String message) {
        super(message);
    }
}

class EntityNotFoundException extends Exception {
    public EntityNotFoundException(String message) {
        super(message);
    }
}


