package managerFactory;

public class DriverManagerFactory {
	public static DriverManager getManager(String browserType) {

		if (browserType.equals(BrowserTypes.Chrome)) {
			return new ChromeDriverManager();
		}
		if (browserType.equals(BrowserTypes.Safari)) {
			return new SafariDriverManager();
		}

		throw new RuntimeException(browserType + " is not a supported browser.");

	}
}
