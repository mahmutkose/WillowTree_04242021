package exp.willowTree.pages;

import exp.willowTree.utilities.BrowserUtils;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class GameIntroPage extends BasePage {


    @FindBy(xpath = "/html/body/div/div[1]/h1")
    public static WebElement nameGameText;
    @FindBy(xpath = "//*[@id=\"name\"]")
    public static WebElement QuestionName;
//================================================================
@FindBy(xpath = "//*[@id=\"gallery\"]/div/div[1]/img")
public static WebElement pictureOneimageText;

    @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[2]/img")
    public static WebElement pictureTwoimageText;

    @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[3]/img")
    public static WebElement pictureThreeimageText;

    @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[4]/img")
    public static WebElement pictureFourimageText;

    @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[5]/img")
    public static WebElement pictureFiveimageText;


    //==============================================================
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
    //====================================================================
    @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[1]/div[1]")
    public static WebElement pictureOneClick;

    @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[2]/div[1]")
    public static WebElement picturetwoClick;

    @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[3]/div[1]")
    public static WebElement pictureThreeClick;

    @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[4]/div[1]")
    public static WebElement pictureFourClick;

    @FindBy(xpath = "//*[@id=\"gallery\"]/div/div[5]/div[1]")
    public static WebElement pictureFiveClick;

    //===================================================================
    @FindBy(xpath = "//*[@id=\"stats\"]/span[1]")
    public static WebElement counterTries;

    @FindBy(xpath = "//*[@id=\"stats\"]/span[2]")
    public static WebElement counterCorrect;

    @FindBy(xpath = "//*[@id=\"stats\"]/span[3]")
    public static WebElement counterStreak;


    //=========================================================================
    //String[] pictureNameArray={p1Name,p2Name,p3Name,p4Name,p5Name};

    //===========================================================================
    public void findIncorrectAnswer() {
        String questName = QuestionName.getText();
        BrowserUtils.wait(2);
        String p1Name = pictureOneName.getText();
        String p2Name = pictureTwoName.getText();
        String p3Name = pictureThreeName.getText();
        String p4Name = pictureFourName.getText();
        String p5Name = pictureFiveName.getText();

        BrowserUtils.wait(1);
        if (questName.equals(p1Name)) {
            System.out.println("Correct Answer Picture 1");

        } else {
            pictureOneClick.click();
        }
        BrowserUtils.wait(1);
        if (questName.equals(p2Name)) {
            System.out.println("Correct Answer Picture 2");
        } else {
            picturetwoClick.click();
        }
        BrowserUtils.wait(1);
        if (questName.equals(p3Name)) {
            System.out.println("Correct Answer Picture 3");
        } else {
            pictureThreeClick.click();
        }
        BrowserUtils.wait(1);
        if (questName.equals(p4Name)) {
            System.out.println("Correct Answer Picture 4");
        } else {
            pictureFourClick.click();
        }
        BrowserUtils.wait(1);
        if (questName.equals(p5Name)) {
            System.out.println("Correct Answer Picture 5");
        } else {
            pictureFiveClick.click();
        }


    }
    //==========================================================================
    public void findCorrectAnswer() {
        String questName = QuestionName.getText();
        BrowserUtils.wait(2);
        String p1Name = pictureOneName.getText();
        BrowserUtils.wait(3);
        String p2Name = pictureTwoName.getText();
        BrowserUtils.wait(2);
        String p3Name = pictureThreeName.getText();
        BrowserUtils.wait(2);
        String p4Name = pictureFourName.getText();
        BrowserUtils.wait(2);
        String p5Name = pictureFiveName.getText();

        if (questName.equals(p1Name)) {
            pictureOneClick.click();
            BrowserUtils.wait(2);
        } else if (questName.equals(p2Name)) {
            picturetwoClick.click();
            BrowserUtils.wait(2);
        } else if (questName.equals(p3Name)) {
            pictureThreeClick.click();
            BrowserUtils.wait(2);
        } else if (questName.equals(p4Name)) {

            pictureFourClick.click();

        } else if (questName.equals(p5Name)) {
            System.out.println("Correct Answer Picture 5");
            pictureFiveClick.click();
            BrowserUtils.wait(2);
        } else {
            throw new RuntimeException("Not match any answer!");
        }

    }


//==========================================================================

    public void verifyCounterAfter4Streak() {
        String counterZero=counterStreak.getText();
        String counterFour="";
        for (int i = 0; i <4 ; i++) {
            BrowserUtils.wait(2);
            findCorrectAnswer();
            BrowserUtils.wait(2);
            counterFour=counterStreak.getText();
            BrowserUtils.wait(2);
        }
        System.out.println("counterZero = " + counterZero);
        System.out.println("counterFour = " + counterFour);

    }
//==========================================================================

    public void assertImages(){
        BrowserUtils.wait(2);
        String img1= pictureOneimageText.getAttribute("src");
        BrowserUtils.wait(2);
        System.out.println("img1 = " + img1);
        String img2=pictureTwoimageText.getAttribute("src");
        System.out.println("img2 = " + img2);
        BrowserUtils.wait(2);
        String img3=pictureThreeimageText.getAttribute("src");
        System.out.println("img3 = " + img3);
        BrowserUtils.wait(2);
        String img4=pictureFourimageText.getAttribute("src");
        System.out.println("img4 = " + img4);
        BrowserUtils.wait(1);
        String img5=pictureFiveimageText.getAttribute("src");
        System.out.println("img5 = " + img5);
        BrowserUtils.wait(1);
        Set<String>images=new TreeSet<>();
        images.addAll(Arrays.asList(img1,img2,img3,img4,img5));
        System.out.println("images.size() = " + images.size());
        Assert.assertEquals(images.size(),5);
        BrowserUtils.wait(2);


    }

    public  void compareImgAndNamesBetweenTwoSession(){
        BrowserUtils.wait(2);
        String img1= pictureOneimageText.getAttribute("src");
        System.out.println("img1 = " + img1);
        BrowserUtils.wait(2);
        String img2=pictureTwoimageText.getAttribute("src");
        System.out.println("img2 = " + img2);
        BrowserUtils.wait(1);
        String img3=pictureThreeimageText.getAttribute("src");
        System.out.println("img3 = " + img3);
        BrowserUtils.wait(2);
        String img4=pictureFourimageText.getAttribute("src");
        System.out.println("img4 = " + img4);
        BrowserUtils.wait(2);
        String img5=pictureFiveimageText.getAttribute("src");
        System.out.println("img5 = " + img5);
        BrowserUtils.wait(2);
        System.out.println("============Now verifying Changing of photos between sessions============");
        findCorrectAnswer();

        BrowserUtils.wait(4);
        String img11= pictureOneimageText.getAttribute("src");
        System.out.println("img11 = " + img11);
        BrowserUtils.wait(3);
        String img22=pictureTwoimageText.getAttribute("src");
        System.out.println("img22 = " + img22);
        BrowserUtils.wait(3);
        String img33=pictureThreeimageText.getAttribute("src");
        System.out.println("img33 = " + img33);
        BrowserUtils.wait(3);
        String img44=pictureFourimageText.getAttribute("src");
        System.out.println("img44 = " + img44);
        BrowserUtils.wait(2);
        String img55=pictureFiveimageText.getAttribute("src");
        System.out.println("img55 = " + img55);
        BrowserUtils.wait(3);
        Set<String>images1=new TreeSet<>();
        BrowserUtils.wait(3);
        images1.addAll(Arrays.asList(img1,img2,img3,img4,img5,img11,img22,img33,img44,img55));
        BrowserUtils.wait(3);


        Assert.assertEquals("There is at least one duplication between sessions",10,images1.size());


    }






}
















