package Config;

import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;

public class WebDriverProvider {

    static WebDriverConfig config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

    public static void config() {
        Configuration.baseUrl = WebDriverProvider.config.getBaseUrl();
        Configuration.browser = WebDriverProvider.config.getBrowser().toString();
        Configuration.browserVersion = WebDriverProvider.config.getBrowserVersion();
        String remoteUrl = WebDriverProvider.config.getRemote();
        if (remoteUrl != null) {
            Configuration.remote = remoteUrl;
        }

       /* DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities; */
    }
}
