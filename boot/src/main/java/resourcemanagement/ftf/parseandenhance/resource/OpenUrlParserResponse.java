package resourcemanagement.ftf.parseandenhance.resource;

import java.util.Map;
import java.util.UUID;

/***
 * Represents a parsed OpenUrlParserResponse class.
 *
 * The id is for any and all logging operations.
 */
public class OpenUrlParserResponse {
    private UUID _id;
    private Map<String, String> _facts;

    public OpenUrlParserResponse(Map<String, String> facts) {
        _id = UUID.randomUUID();
        this._facts = facts;
    }

    /**
     * @return the unique identifier for this transaction.
     */
    public UUID getId() {
        return _id;
    }

    /**
     * @return the list of parsed facts for this OpenUrlRequest
     */
    public Map<String, String> getFacts() {
        return _facts;
    }
}
