import java.util.*;

public class Items {
    Scanner input = new Scanner(System.in);
    ArrayList<Items> phone = new ArrayList<>();
    ArrayList<Items> computer = new ArrayList<>();
    LinkedHashMap<String, String> compValues = new LinkedHashMap<>();
    LinkedHashMap<String, String> phoneValues = new LinkedHashMap<>();
    String brand;//2 type of item
    String name;//2 type of item
    int idC = 1;
    int idP = 1;
    int cost;//2 type of item
    int discount;//2 type of item
    int stock;//2 type of item
    String memory;//2 type of item
    String screenSize;//2 type of item
    String battery;
    String ram;//2 type of item
    String color;

    Items() {
        compValues.put("Brand", null);
        compValues.put("Name", null);
        compValues.put("Cost(sayı değeri)", null);
        compValues.put("Discount(sayı değeri)", null);
        compValues.put("Stock(sayı değeri)", null);
        compValues.put("Memory", null);
        compValues.put("Secreen Size", null);
        compValues.put("Ram", null);
        phoneValues.put("Brand", null);
        phoneValues.put("Name", null);
        phoneValues.put("Cost", null);
        phoneValues.put("Discount", null);
        phoneValues.put("Stock", null);
        phoneValues.put("Memory", null);
        phoneValues.put("Secreen Size", null);
        phoneValues.put("Battery", null);
        phoneValues.put("Ram", null);
        phoneValues.put("Color", null);
    }

    public void firstItemMaker() {
        Items p1 = new Items();
        Items c1 = new Items();
        p1.phoneMaker("Samsung", "SAMSUNG GALAXY A51", 3199, 10, 50, "32 Gb", "16inc", "7000amp", "4gb", "mavi");
        c1.computerMaker("Huawei", "HUAWEI Matebook 14", 7000, 20, 10, "512GB", "17inc", "16GB");
        this.computer.add(c1);
        this.phone.add(p1);

    }

    public void phoneMaker(String brand, String name, int cost, int discount, int stock, String memory, String screenSize, String battery, String ram, String color) {
        this.brand = brand;
        this.name = name;
        this.cost = cost;
        this.discount = discount;
        this.stock = stock;
        this.memory = memory;
        this.screenSize = screenSize;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public void computerMaker(String brand, String name, int cost, int discount, int stock, String memory, String screenSize, String ram) {
        Items b = new Items();
        this.brand = brand;
        this.name = name;
        this.cost = cost;
        this.discount = discount;
        this.stock = stock;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
        this.battery = null;
        this.color = null;
    }

    public void panel() {
        boolean u = true;
        while (u) {
            System.out.print("""
                    Patika Ürün Yönetim Paneli!
                    1 - Notebook İşlemleri
                    2 - Cep Telefonu İşlemleri
                    0 - Çıkış Yap
                    Tercihiniz : """);
            int a = input.nextInt();
            switch (a) {
                case 1:
                    print(computer,1);
                    options();
                    int b = input.nextInt();
                    switch (b) {
                        case 1 -> userCompMaker();
                        case 2 -> placementComp();
                        case 3 -> deleteComp();
                        default -> System.out.println("Lütfen geçerli bir rakam giriniz");
                    }
                    break;
                case 2:
                    print(phone,2);
                    options();
                    int c = input.nextInt();
                    switch (c) {
                        case 1 -> userPhoneMaker();
                        case 2 -> placementPhone();
                        case 3 -> deletePhone();
                    }
                    break;
                case 0:
                    System.out.println("Çıkış yapıldı");
                    u = false;
                    break;
                default:
                    System.out.println("Lütfen geçerli bir rakam giriniz");
                    break;
            }
        }
    }

    public void options() {
        System.out.println("""
                1 - Ürün ekle
                2 - Ürün listeleme seçeneği
                3 - Ürün silme
                4 - Ana menüye dön""");
    }

    public void placementComp() {
        System.out.println("""
                Lütfen sıralamak isteğiniz tipi seçiniz:
                1. Fiyata göre sırala(Küçükten büyüğe)
                2. ID numarasına göre sırala
                3. Markaya göre sırala""");
        int a = input.nextInt();
        switch (a) {
            case 1 -> computer.sort(new CostComparator());
            case 2 -> computer.sort(new CostComparator() {
                @Override
                public int compare(Items o1, Items o2) {
                    return o1.idC - o2.idC;
                }
            });
            case 3 -> phone.sort(new CostComparator() {
                @Override
                public int compare(Items o1, Items o2) {
                    return o1.brand.compareTo(o2.brand);
                }
            });
        }
    }

    public void placementPhone() {
        System.out.println("""
                Lütfen sıralamak isteğiniz tipi seçiniz:
                1. Fiyata göre sırala(Küçükten büyüğe)
                2. ID numarasına göre sırala
                3. Markaya göre sırala""");
        int a = input.nextInt();
        switch (a) {
            case 1 -> phone.sort(new CostComparator());
            case 2 -> phone.sort(new CostComparator() {
                @Override
                public int compare(Items o1, Items o2) {
                    return o1.idP - o2.idP;
                }
            });
            case 3 -> phone.sort(new CostComparator() {
                @Override
                public int compare(Items o1, Items o2) {
                    return o1.brand.compareTo(o2.brand);
                }
            });
        }
    }

    public void print(ArrayList<Items> item, int b) {

        if (b == 1) {
            System.out.println("-------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı                         | Fiyat     | Marka     | Depolama  | Ekran     | Ram   |");
            System.out.println("-------------------------------------------------------------------------------------------------");
            if (this.computer.size() > 0) {
                for (Items a : item) {
                    System.out.printf("| %-3d| %-35s| %-10s| %-10s| %-10s| %-10s| %-6s|\n", a.idC, a.name, a.cost, a.brand, a.memory, a.screenSize, a.ram);
                }
                System.out.println("-------------------------------------------------------------------------------------------------");
            }
        } else {
            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı                         | Fiyat     | Marka     | Depolama  | Ekran     | Pil    | Ram   | Renk      |");
            System.out.println("-------------------------------------------------------------------------------------------------");
            if (this.phone.size() > 0) {
                for (Items a : item) {
                    System.out.printf("| %-3d| %-35s| %-10s| %-10s| %-10s| %-10s| %-6s| %-6s| %-10s|\n", a.idP, a.name, a.cost, a.brand, a.memory, a.screenSize, a.battery, a.ram, a.color);
                }
                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }

    public void userCompMaker() {
        String[] comp = new String[8];
        Iterator<String> itr = compValues.keySet().iterator();
        for (int i = 0; i < comp.length; i++) {
            String l = itr.next();
            System.out.print("Lütfen " + l + " giriniz: ");
            compValues.put(l, input.next());

        }
        itr = compValues.values().iterator();
        Items c1 = new Items();
        c1.computerMaker(itr.next(), itr.next(), Integer.parseInt(itr.next()), Integer.parseInt(itr.next()), Integer.parseInt(itr.next()), itr.next(), itr.next(), itr.next());
        computer.add(c1);
        idC++;
        c1.idC = this.idC;
        System.out.println("Ürün başarılı bir şekilde eklendi");
    }

    public void userPhoneMaker() {
        Iterator<String> itr = phoneValues.keySet().iterator();
        for (int i = 0; i < 10; i++) {
            String l = itr.next();
            System.out.print("Lütfen " + l + " giriniz: ");
            phoneValues.put(l, input.next());
        }
        itr = phoneValues.values().iterator();
        Items p1 = new Items();
        p1.phoneMaker(itr.next(), itr.next(), Integer.parseInt(itr.next()), Integer.parseInt(itr.next()), Integer.parseInt(itr.next()), itr.next(), itr.next(), itr.next(), itr.next(), itr.next());
        this.idP++;
        p1.idP = this.idP;
        this.phone.add(p1);
        System.out.println("Ürün başarılı bir şekilde eklendi");
    }

    public void deleteComp() {
        System.out.println("Lütfen silmek istediğiniz ürünün ID numarasını giriniz");
        int q = input.nextInt();
        Integer t = q;
        int a = 1;
        for (int i = 0; i < this.computer.size(); i++) {
            System.out.println(this.computer.get(i).idC);
            if (this.computer.get(i).idC == t) {
                this.computer.remove(i);
                System.out.println("Ürün başarı ile silindi");
                break;
            }
        }
    }

    public void deletePhone() {
        System.out.println("Lütfen silmek istediğiniz ürünün ID numarasını giriniz");
        int q = input.nextInt();
        int a = 1;
        for (int i = 0; i < phone.size(); i++) {
            if (phone.get(i).idP == q) {
                phone.remove(i);
                System.out.println("Ürün başarı ile silindi");
                break;
            }
        }
    }
}
