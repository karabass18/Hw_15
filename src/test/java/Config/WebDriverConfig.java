package Config;


import org.aeonbits.owner.Config;

@Config.Sources(value = {
        "classpath:${env}.configuration"
})

public interface WebDriverConfig extends Config {

        @Key("baseUrl")
        @DefaultValue("https://github.com")
        String getBaseUrl();

        @Key("remoteUrl")
        //@DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
        String getRemote();

        @Key("browser")
        @DefaultValue("chrome")
        String getBrowser();

        @Key("browserVersion")
        @DefaultValue("100.0")
        String getBrowserVersion();


}
