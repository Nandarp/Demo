package com.framework.browserfactory;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.framework.base.constants.DriverMode;
import com.framework.driver.DriverConfig;
import com.framework.util.FileUtility;
import com.framework.util.OSUtility;
import com.framework.util.TestLogging;

//import com.framework.helper.FileUtility;
//import com.framework.helper.OSUtility;
public class FirefoxCapabilitiesFactory implements ICapabilitiesFactory {
	private static boolean isProfileCreated = false;
	private static Object lockProfile = new Object();

	/*
	 * This method is used to configure the Firefox profile It can set path of
	 * Firefox executable file. using getFirefoxBinPath It can set path for User
	 * Agent Override Capabilities It can set path for general.useragent.override
	 * capabilities It can set the path for downloaded files by setting
	 * browser.download.dir capabilities with required folder list It can
	 * enable/disable Javascript for user It can set capabilities for permission
	 * denied issues
	 */

	protected void configProfile(final FirefoxProfile profile, final DriverConfig webDriverConfig) {
		profile.setAcceptUntrustedCertificates(webDriverConfig.isSetAcceptUntrustedCertificates());
		profile.setAssumeUntrustedCertificateIssuer(webDriverConfig.isSetAssumeUntrustedCertificateIssuer());

		if (webDriverConfig.getFirefoxDriverPath() != null) {
			System.setProperty("webdriver.firefox.bin", webDriverConfig.getFirefoxDriverPath());
		}

		if (webDriverConfig.getUserAgentOverride() != null) {
			profile.setPreference("general.useragent.override", webDriverConfig.getUserAgentOverride());
		}

		if (webDriverConfig.getNtlmAuthTrustedUris() != null) {
			profile.setPreference("network.automatic-ntlm-auth.trusted-uris", webDriverConfig.getNtlmAuthTrustedUris());
		}

		if (webDriverConfig.getBrowserDownloadDir() != null) {
			profile.setPreference("browser.download.dir", webDriverConfig.getBrowserDownloadDir());
			profile.setPreference("browser.download.folderList", 2);
			profile.setPreference("browser.download.manager.showWhenStarting", false);
			profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
					"application/octet-stream,text/plain,application/pdf,application/zip,text/csv,text/html");
		}

		if (!webDriverConfig.isEnableJavascript()) {
			profile.setPreference("javascript.enabled", false);
		}

		// fix permission denied issues
		profile.setPreference("capability.policy.default.Window.QueryInterface", "allAccess");
		profile.setPreference("capability.policy.default.Window.frameElement.get", "allAccess");
		profile.setPreference("capability.policy.default.HTMLDocument.compatMode.get", "allAccess");
		profile.setPreference("capability.policy.default.Document.compatMode.get", "allAccess");
		profile.setPreference("dom.max_chrome_script_run_time", 0);
		profile.setPreference("dom.max_script_run_time", 0);
	}

	/*
	 * This method is used to set all required Capabilities to Firefox Browser It
	 * can set user Defined/default Firefox profile based on requirement It can
	 * enable/disable Javascript content based on requirement It can set take
	 * screenshot capabilities It can enable/disable SSL certs capabilityby default,
	 * It gives secure connections from a web server to a browser. It can set
	 * Browser version capability as required It can set platform capability as
	 * required It can set proxy capability as required
	 * 
	 * @param:webDriverConfig
	 * 
	 * @return:capability
	 */
	public DesiredCapabilities createCapabilities(final DriverConfig webDriverConfig) {
		DesiredCapabilities capability;
		// capability = new DesiredCapabilities();

		capability = DesiredCapabilities.firefox();
		FirefoxOptions options = new FirefoxOptions();
		options.setBinary(webDriverConfig.getFirefoxDriverPath()); // Location where Firefox is installed

		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("moz:firefoxOptions", options);

		capability.setBrowserName(DesiredCapabilities.firefox().getBrowserName());

		/* capability.setCapability("marionette", true); */
		// FirefoxProfile profile = getFirefoxProfile(webDriverConfig);
		// configProfile(profile, webDriverConfig);
		// capability.setCapability(FirefoxDriver.PROFILE, profile);

		if (webDriverConfig.isEnableJavascript()) {
			capability.setJavascriptEnabled(true);
		} else {
			capability.setJavascriptEnabled(false);
		}

		capability.setCapability(CapabilityType.TAKES_SCREENSHOT, true);
		capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		if (webDriverConfig.getBrowserVersion() != null) {
			capability.setVersion(webDriverConfig.getBrowserVersion());
		}

		if (webDriverConfig.getWebPlatform() != null) {
			capability.setPlatform(webDriverConfig.getWebPlatform());
		}

		if (webDriverConfig.getProxyHost() != null) {
			capability.setCapability(CapabilityType.PROXY, webDriverConfig.getProxy());
		}

		System.setProperty("webdriver.gecko.driver", webDriverConfig.getFirefoxDriverPath());

		return capability;
	}

	public void handleExtractResources() throws IOException {
		/*
		 * String dir = this.getClass().getResource("/").getPath(); dir =
		 * FileUtility.decodePath(dir);
		 * 
		 * if (!new File(dir).exists()) {
		 * System.out.println("extracting chrome resources in " + dir);
		 * FileUtility.extractJar(dir, WebDriverExternalResources.class); }
		 * 
		 * if (!new File(dir + OSUtility.getSlash() + "chromedriver.exe").exists()) {
		 * FileUtility.extractJar(dir, WebDriverExternalResources.class); }
		 * 
		 * if (OSUtility.isWindows()) { System.setProperty("webdriver.chrome.driver",
		 * dir + "\\chromedriver.exe"); } else {
		 * System.setProperty("webdriver.chrome.driver", dir + "/chromedriver"); new
		 * File(dir + "/chromedriver").setExecutable(true); }
		 */
	}

	protected FirefoxProfile createFirefoxProfile(final String path) {
		if (path != null) {
			return new FirefoxProfile(new File(path));
		} else {
			return new FirefoxProfile();
		}
	}

	/**
	 * extractDefaultProfile to a folder.
	 *
	 * @param profilePath
	 *            The folder to store the profile
	 *
	 * @throws IOException
	 */
	protected void extractDefaultProfile(final String profilePath) throws IOException {
		synchronized (lockProfile) {
			try {
				if (!isProfileCreated) {
					System.out.println("start create profile");
					FileUtility.deleteDirectory(profilePath);
					FileUtility.extractJar(profilePath, FireFoxProfileMarker.class);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}

		isProfileCreated = true;
	}

	protected synchronized FirefoxProfile getFirefoxProfile(final DriverConfig webDriverConfig) {
		String path = webDriverConfig.getFirefoxProfilePath();
		FirefoxProfile profile;
		String realPath;
		if (webDriverConfig.isUseFirefoxDefaultProfile()) {
			realPath = getFirefoxProfilePath(path);
		} else {
			realPath = null;
		}

		profile = createFirefoxProfile(realPath);
		return profile;
	}

	protected String getFirefoxProfilePath(String path) {
		String realPath = null;
		if (path != null && !new File(path).exists()) {
			TestLogging.log("Firefox profile path:" + path + " not found, use default");
			path = null;
		}

		if (path != null) {

			realPath = path;
		} else {
			try {
				String profilePath = this.getClass().getResource("/").getPath() + "ffprofile";
				profilePath = FileUtility.decodePath(profilePath);

				extractDefaultProfile(profilePath);
				realPath = profilePath + OSUtility.getSlash() + "customFFprofile";

			} catch (Exception e) {
				e.printStackTrace();
				realPath = null;
			}
		}

		System.out.println("Firefox Profile: " + realPath);
		return realPath;
	}
}