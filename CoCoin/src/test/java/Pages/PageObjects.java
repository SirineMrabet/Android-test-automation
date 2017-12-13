package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by smrabet on 13/12/17.
 */
public class PageObjects {



        public PageObjects (AppiumDriver driver)
        {

            PageFactory.initElements(driver, this);
        }

    public static final String inputMoneyField =  "//*[@class='android.widget.EditText']";
    @FindBy(how = How.XPATH, using = inputMoneyField)
    public WebElement InputMoney;


    public static final String CategoryBreakfast = "//*[@class='android.widget.TextView' and @text='Breakfast']";
    @FindBy(how = How.XPATH, using = CategoryBreakfast)
    public WebElement BreakfastCategory;

    public static final String CategoryLunch = "//*[@class='android.widget.TextView' and @text='Lunch']";
    @FindBy(how = How.XPATH, using = CategoryLunch)
    public WebElement LunchCategory;



    public static final String CategoryDinner = "//*[@class='android.widget.TextView' and @text='Dinner']";
    @FindBy(how = How.XPATH, using = CategoryDinner)
    public WebElement DinnerCategory;


    //////////////////////////// Number to click on /////////////////////////////////////////////////
    public static final String Num0 = "//*[@class='android.widget.TextView' and @text='0']";
    @FindBy(how = How.XPATH, using = Num0)
    public WebElement Nume0;
    public static final String Num1 = "//*[@class='android.widget.TextView' and @text='1']";
    @FindBy(how = How.XPATH, using = Num1)
    public WebElement Nume1;
    public static final String Num2 = "//*[@class='android.widget.TextView' and @text='2']";
    @FindBy(how = How.XPATH, using = Num2)
    public WebElement Nume2;
    public static final String Num3 = "//*[@class='android.widget.TextView' and @text='3']";
    @FindBy(how = How.XPATH, using = Num3)
    public WebElement Nume3;
    public static final String Num4 = "//*[@class='android.widget.TextView' and @text='4']";
    @FindBy(how = How.XPATH, using = Num4)
    public WebElement Nume4;
    public static final String Num5 = "//*[@class='android.widget.TextView' and @text='5']";
    @FindBy(how = How.XPATH, using = Num5)
    public WebElement Nume5;
    public static final String Num6 = "//*[@class='android.widget.TextView' and @text='6']";
    @FindBy(how = How.XPATH, using = Num6)
    public WebElement Nume6;
    public static final String Num7 = "//*[@class='android.widget.TextView' and @text='7']";
    @FindBy(how = How.XPATH, using = Num7)
    public WebElement Nume7;
    public static final String Num8 = "//*[@class='android.widget.TextView' and @text='8']";
    @FindBy(how = How.XPATH, using = Num8)
    public WebElement Nume8;
    public static final String Num9 = "//*[@class='android.widget.TextView' and @text='9']";
    @FindBy(how = How.XPATH, using = Num9)
    public WebElement Nume9;



}
