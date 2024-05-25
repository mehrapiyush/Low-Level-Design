//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Youtube vide link
        // https://www.youtube.com/watch?v=wA3keqCeKtM&list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&index=17
        // Service for XML to JSOn
        XMLtoJSONUIService xmLtoJSONUIService = new XMLtoJSONUIService();
        // Adapter responsible to convert interface of same XML type to JSON
        ZomatoAdapter zomatoAdapter = new ZomatoAdapter(xmLtoJSONUIService);

        XML menus = new XML();
        menus.setFileName("test.txt");
        menus.setFilePath("src/main/resources/menus.xml");
        menus.setData("Menu1");
        zomatoAdapter.displayMenus(menus);

        XML rec = new XML();
        rec.setFileName("test2.txt");
        rec.setFilePath("src/main/resources/rec.xml");
        rec.setData("Recommendation1");

        zomatoAdapter.displaYRecommendations(rec);
    }
}