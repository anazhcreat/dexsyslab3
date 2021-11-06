import java.util.ArrayList;
import java.util.Scanner;

public class Pogreb {
    private ArrayList<BochkaInfo> boochki = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    Pogreb() {
        boochki.add(new BochkaInfo("Шампань", "урожай 1092 года"));
        boochki.add(new BochkaInfo("Самогон от деда", "урожай 2021 года"));
        boochki.add(new BochkaInfo("Шато Марго", "урожай 1787 года"));
        boochki.add(new BochkaInfo("Роял де Мария", "урожай 1934 года"));
        boochki.add(new BochkaInfo("Романе-Конти", "урожай 1945 года"));
    }

    public void getBochkaByEtiketka(String etiketka) {
        for (BochkaInfo bochkaInfo : boochki) {
            if (bochkaInfo.getEtiketka().equals(etiketka)) {
                System.out.printf("Достали бочку [%s], с этикеткой [%s]\n\n", bochkaInfo.getInfo(), bochkaInfo.getEtiketka());
                boochki.remove(bochkaInfo);
                return;
            }
        }
        System.out.printf("Не найдено бочки с этикеткой [%s]", etiketka);
    }

    public void addBochka() {
        System.out.println("Введите название этикетки бочки, которую хотите добавить: ");
        String etiketka = in.nextLine();
        if (!isThereEtiketka(etiketka)) {
            System.out.println("Введите информацию о бочке: ");
            String info = in.nextLine();
            boochki.add(new BochkaInfo(etiketka, info));
            System.out.printf("В погреб добавлена бочка - этикетка: [%s], информация: [%s]\n", etiketka, info);
        } else {
            System.out.printf("Бочка с этикеткой [%s] уже есть\n", etiketka);
        }
    }

    public void getEtiketki() {
        System.out.println("Доступные бочки в погребе:");
        for (BochkaInfo bochkaInfo : boochki) {
            System.out.println(bochkaInfo.getEtiketka());
        }
        System.out.println(); // перенос строки
    }

    public void getAllBochks() {
        System.out.println("Достали все бочки из погреба:");
        for (BochkaInfo bochkaInfo : boochki) {
            System.out.println(bochkaInfo.getEtiketka());
            }
        boochki.clear();
    }

    private boolean isThereEtiketka(String etiketka) {
        for (BochkaInfo bochkaInfo : boochki) {
            if (bochkaInfo.getEtiketka().equals(etiketka)) {
                return true;
            }
        }
        return false;
    }
}
