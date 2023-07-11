import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.mobile.driver.MobileDriverType
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

// Set the Browserstack credentials: USERNAME and ACCESS_KEY
String browserStackServerURL = "https://mouhamedfamarasa_rmROKy:icEUU7Qmtw7dh7dRsY4b@hub-cloud.browserstack.com/wd/hub";

DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities.setCapability("device", device);
capabilities.setCapability("app", "bs://a184dfcad99aa72e97a7144e92719192a8a2d953");

//Set the app_url (returned on uploading app on Browserstack) in the 'app' capability
//capabilities.setCapability('app', 'bs://4b851fb17ce5d524529ea8035f299a8509498e71","custom_id":"occazio","shareable_id":"mouhamedfamarasa_rmROKy/occazio');

AppiumDriverManager.createMobileDriver(MobileDriverType.ANDROID_DRIVER, capabilities, new URL(browserStackServerURL));

Mobile.tap(findTestObject('SpyOccazio/android.widget.Button - DMARRER'), 0)

Mobile.swipe(950, 950, 100, 950)

Mobile.swipe(950, 950, 100, 950)

Mobile.swipe(950, 950, 100, 950)

Mobile.swipe(950, 950, 100, 950)

Mobile.tap(findTestObject('Object Repository/Occazio Unboarding/android.widget.SeekBar - 1.0'), 0)

Mobile.tap(findTestObject('Object Repository/Occazio Unboarding/android.widget.Button - VALIDER'), 0)

Mobile.tap(findTestObject('Object Repository/Occazio Unboarding/android.widget.TextView - DCOUVRIR'), 0)

Mobile.closeApplication()

