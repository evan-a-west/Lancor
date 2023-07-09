package google.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class googleLookForCFOInfo {
    public static Performable about(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "' at Google",
                Enter.theValue(searchTerm)
                        .into(googleHomePageSearch.SEARCH_FIELD)
                        .thenHit(Keys.ENTER));
    }
}