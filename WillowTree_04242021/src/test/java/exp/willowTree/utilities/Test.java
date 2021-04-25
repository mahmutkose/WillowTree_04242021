package exp.willowTree.utilities;

import exp.willowTree.pages.BasePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {




        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get(ConfigurationReader.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement name =driver.findElement(By.xpath("/html/body/div/div[1]/h1"));
        System.out.println("driver.getTitle() = " + driver.getTitle());
        System.out.println("name.getText() = " + name.getText());

     /*   if(questName.equals(p1Name)){
            System.out.println("Correct Answer Picture 1");
            Thread.sleep(6000);
        }else{pictureOneClick.click();}


           Thread.sleep(4000);
        if (questName.equals(p2Name)){
            System.out.println("Correct Answer Picture 2");}
            else{pictureTwoName.click();}
        Thread.sleep(2000);
        if (questName.equals(p3Name)){
            System.out.println("Correct Answer Picture 3");}
          else{pictureThreeName.click();}
        Thread.sleep(3000);

      if (questName.equals(p4Name)){
            System.out.println("Correct Answer Picture 4");
        } else{pictureFourName.click();}
        Thread.sleep(3000);
      if (questName.equals(p5Name)){
            System.out.println("Correct Answer Picture 5");}
             else{pictureFiveName.click();}
        Thread.sleep(1000);

        if (!(questName.equals(p5Name)||!(questName.equals(p4Name)||!(questName.equals(p3Name)||!(questName.equals(p2Name)
                ||!(questName.equals(p1Name)))))))
        { throw new RuntimeException("Not match any answer!");}*/




     /*  @FindBy(xpath = "/html/body/div/div[1]/h1")
        public static WebElement nameGameText;
        @FindBy(xpath = "//*[@id=\"name\"]")
        public static WebElement QuestionName;

        @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[1]/div[2]")
        public static WebElement pictureOneName;

        @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[2]/div[2]")
        public static WebElement pictureTwoName;

        @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[3]/div[2]")
        public static WebElement pictureThreeName;

        @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[4]/div[2]")
        public static WebElement pictureFourName;

        @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[5]/div[2]")
        public static WebElement pictureFiveName;
//===========================================================================================
        @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[1]/div[1]")
        public static WebElement pictureOneClick;

        @FindBy(xpath = "//*[@id=\"stats\"]/span[1]")
        public static WebElement counterTries;

        @FindBy(xpath = "//*[@id=\"stats\"]/span[2]")
        public static WebElement counterCorrect;

        @FindBy(xpath = "//*[@id=\"stats\"]/span[3]")
        public static WebElement counterStreak;*/
//===========================================================================================

/*if (!(questName.equals(p5Name) || !(questName.equals(p4Name) || !(questName.equals(p3Name) || !(questName.equals(p2Name)
                    || !(questName.equals(p1Name))))))) {
                throw new RuntimeException("Not match any answer!");*/







    }






    }













