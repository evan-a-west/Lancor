package google.search;

import net.serenitybdd.screenplay.targets.Target;

public class googleSearchResults {
    private static final String usefulSearchResults = "div.v7W49e>div>div.g %s, div.v7W49e>div>div>div.g %s, div.v7W49e>div>div>div>div.g %s";
    //Example CSS for Search Result -> Site Name: "div.v7W49e>div>div.g div.TbwUpd.NJjxre.iUh30.apx8Vc.ojE3Fb span.VuuXrf, div.v7W49e>div>div>div.g div.TbwUpd.NJjxre.iUh30.apx8Vc.ojE3Fb span.VuuXrf, div.v7W49e>div>div>div>div.g div.TbwUpd.NJjxre.iUh30.apx8Vc.ojE3Fb span.VuuXrf"
    
    //General Google Search Result fields
    public static final Target GENERAL_RESULT__HEADER =  Target.the("Search Result Header").locatedBy(".LC20lb.MBeuO.DKV0Md");
    public static final Target GENERAL_RESULT__SOURCE_SITE =  Target.the("Search Result Header").locatedBy("span.VuuXrf");
    public static final Target GENERAL_RESULT__LINK =  Target.the("Search Result Header").locatedBy("div.yuRUbf > a");

    //Fields specific to LinkedIn Search Results in Google
    public static final Target LINKEDIN_RESULT__LOCATION =  Target.the("Search Result Header").locatedBy("div.MUxGbd.wuQ4Ob.WZ8Tjf > span:nth-child(1)");
    public static final Target LINKEDIN_RESULT__JOB_TITLE =  Target.the("Search Result Header").locatedBy("div.MUxGbd.wuQ4Ob.WZ8Tjf > span:nth-child(2)");
    public static final Target LINKEDIN_RESULT__COMPANY =  Target.the("Search Result Header").locatedBy("div.MUxGbd.wuQ4Ob.WZ8Tjf > span:nth-child(3)");
}

