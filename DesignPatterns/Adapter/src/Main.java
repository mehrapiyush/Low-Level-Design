//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        XMLtoJSONUIService xmLtoJSONUIService = new XMLtoJSONUIService();
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