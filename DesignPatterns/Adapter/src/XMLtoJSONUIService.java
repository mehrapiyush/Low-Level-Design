public class XMLtoJSONUIService {
    public JSON convertFromXmlToJson(XML xmlData) {
        System.out.println("Converting XML to JSON");
        JSON json = new JSON();
        // Assume this JSON format
        json.setJson(xmlData.getFileName()+ xmlData.getFilePath()+ "\n" + xmlData.getData());
        return json;
    }
}
