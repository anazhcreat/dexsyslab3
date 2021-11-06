public class Main {
    public static void main(String[] args) {
        Pogreb pogreb = new Pogreb();
        pogreb.getEtiketki();
        pogreb.getBochkaByEtiketka("Самогон от деда");
        pogreb.addBochka();
        pogreb.getAllBochks();
    }
}
