package google.search;

import net.serenitybdd.screenplay.targets.Target;

public class GoogleSearchResults {
    private static final String usefulSearchResults = "div.v7W49e>div>div.g %s, div.v7W49e>div>div>div.g %s, div.v7W49e>div>div>div>div.g %s";
    private static final String websiteName_substring = "div.TbwUpd.NJjxre.iUh30.apx8Vc.ojE3Fb span.VuuXrf";
    private static final String link_substring = "h3.LC20lb.MBeuO.DKV0Md";
    private static final String description_substring = "div.VwiC3b.yXK7lf.MUxGbd.yDYNvb.lyLwlc.lEBKkf";
    // Full example css selector = "div.v7W49e>div>div.g
    // div.TbwUpd.NJjxre.iUh30.apx8Vc.ojE3Fb span.VuuXrf, div.v7W49e>div>div>div.g
    // div.TbwUpd.NJjxre.iUh30.apx8Vc.ojE3Fb span.VuuXrf,
    // div.v7W49e>div>div>div>div.g div.TbwUpd.NJjxre.iUh30.apx8Vc.ojE3Fb
    // span.VuuXrf"

    // General Google Search Result fields
    public static final Target GENERAL_RESULT__WEBSITE_NAME = Target.the("Search Result Header").locatedBy(
            String.format(usefulSearchResults, websiteName_substring, websiteName_substring, websiteName_substring));

    public static final Target GENERAL_RESULT__LINK = Target.the("Search Result Header").locatedBy(
            String.format(usefulSearchResults, link_substring, link_substring, link_substring));

    public static final Target GENERAL_RESULT__DESCRIPTION = Target.the("Search Result Header").locatedBy(
            String.format(usefulSearchResults, description_substring, description_substring, description_substring));

    // Fields specific to LinkedIn Search Results in Google
    // public static final Target LINKEDIN_RESULT__LOCATION = Target.the("Search
    // Result Header")
    // .locatedBy("div.MUxGbd.wuQ4Ob.WZ8Tjf > span:nth-child(1)");
    // public static final Target LINKEDIN_RESULT__JOB_TITLE = Target.the("Search
    // Result Header")
    // .locatedBy("div.MUxGbd.wuQ4Ob.WZ8Tjf > span:nth-child(2)");

    // public static final Target LINKEDIN_RESULT__WEBSITE_NAME = Target.the("Search
    // Result Header").locatedBy("div.MUxGbd.wuQ4Ob.WZ8Tjf > span:nth-child(3)");
}
