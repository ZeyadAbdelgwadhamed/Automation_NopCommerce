package Utilits;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.FileOutputStream;
import java.nio.file.FileSystem;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ScreenShoots {

    public static void TakeScreenShoots(WebDriver driver,String ScreenName)
    {
        Path Route =Paths.get("F:\\Automation_Test\\LastVersionNepCommerceMotaze\\ScreenShoots",ScreenName+".png");
        try {

                FileOutputStream ZezO=new FileOutputStream(Route.toString());
                ZezO.write(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
                ZezO.close();
        }
        catch (Exception e) {
            System.out.println("TackScreenShoots"+e.getMessage());
        }

    }
}
