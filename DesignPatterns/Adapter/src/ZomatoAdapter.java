public class ZomatoAdapter implements IZomatoApp{
    private XMLtoJSONUIService xmLtoJSONUIService;
    public ZomatoAdapter(XMLtoJSONUIService xmLtoJSONUIService) {
        this.xmLtoJSONUIService = xmLtoJSONUIService;
    }
    @Override
    public void displayMenus(XML data) {
        JSON json = xmLtoJSONUIService.convertFromXmlToJson(data);
        System.out.println(json.getJson());
    }

    @Override
    public void displaYRecommendations(XML data) {
        JSON json = xmLtoJSONUIService.convertFromXmlToJson(data);
        System.out.println(json.getJson());
    }
}
