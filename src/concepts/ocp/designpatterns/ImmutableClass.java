package concepts.ocp.designpatterns;

import java.util.ArrayList;
import java.util.List;

//Rule No.5
public final class ImmutableClass {
    /*
     * Immutable classes are classes which state cannot change
     * The objects created from immutable classes are 'read-only' objects and can be shared and used by multiple classes
     *
     * There are 5 rules to create an immutable class
     *
     * 1. Use a constructor to set all properties of the object
     * 2. Mark all the instance variables private and final
     * 3. Don't define any setter methods
     * 4. Don't allow referenced mutable objects to be modified or accessed directly
     * 5. Prevent methods from being overridden.
     */

    // Rule No. 1
    public ImmutableClass (String message, List<String> historyMessages){
        this.message = message;
        if(historyMessages == null){
            throw new RuntimeException("Histpry messages canot be null");
        }
        // Rule No. 4
        this.historyMessages = new ArrayList<>(historyMessages);
    }

    // Rule No. 2
    private final String message;

    private final List<String> historyMessages;

    //Rule No. 3
    public String getMessage() {
        return message;
    }

    //Rule No. 4
    public String getHistoryMessage(int index){
        return historyMessages.get(index);
    }

}
