package resourcemanagement.ftf.parseandenhance.service;

import resourcemanagement.ftf.parseandenhance.resource.OpenUrlParserResponse;

import java.util.Map;

public class OpenUrlParserService {
    public OpenUrlParserResponse parse(Map<String, String> preParsedMap) {
        parseOutAdditionalValues(preParsedMap);
        return new OpenUrlParserResponse(preParsedMap);
    }


    private void parseOutAdditionalValues(Map<String, String> map) {

        String[] trailingValuesInOpenUrlHeading = map.get("openurl").split("\\?");
        map.put(trailingValuesInOpenUrlHeading[1].split("=")[0], trailingValuesInOpenUrlHeading[1].split("=")[1]);
        map.remove("openurl", map.get("openurl"));
    }
}
