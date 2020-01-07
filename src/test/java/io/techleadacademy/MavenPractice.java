package io.techleadacademy;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenPractice {

    public static <WebDriver> void main(String[] args) {
       TestData test = new TestData();
        System.out.println(test.firstname());
        System.out.println(test.lastname());
        System.out.println(test.phoneNumbers());
        System.out.println(test.address());

    }
}
