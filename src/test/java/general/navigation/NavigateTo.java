package general.navigation;

import google.navigation.GoogleHomePage;
import linkedIn.navigation.LinkedInHomePage;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import starter.navigation.WikipediaHomePage;

public class NavigateTo {
    public static Performable theWikipediaHomePage() {
        return Task.where("{0} opens the Wikipedia home page",
                Open.browserOn().the(WikipediaHomePage.class));
    }

    public static Performable theGoogleHomePage() {
        return Task.where("{0} opens the Google home page",
                Open.browserOn().the(GoogleHomePage.class));
    }

    public static Performable theLinkedInHomePage() {
        return Task.where("{0} opens the LinkedIn home page",
                Open.browserOn().the(LinkedInHomePage.class));
    }
}
