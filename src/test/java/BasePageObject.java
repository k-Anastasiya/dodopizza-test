import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePageObject {

    private WebDriver driver;

    public BasePageObject(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    public static final String WEBSITEURL = "https://dodopizza.by/minsk";


    @FindBy(xpath = "//a[text()='Пицца']")
    WebElement buttonPizza;
    @FindBy(xpath = "//*[@id='pizzas']/article[8]/footer/button")
    WebElement buttonChoosePizzaFourSeasons;
    @FindBy(xpath = "/html/body/div[5]/div/div[2]/div/div/div[2]/div[2]")
    WebElement buttonAddToBasket;
    @FindBy(xpath = "//button[text()='Корзина']")
    WebElement buttonBasket;
    @FindBy(xpath = "//h3[contains(text(), 'Четыре сезона')]")
    WebElement fourSeasonsPizza;


    public void clickButtonPizza() {
        buttonPizza.click();
    }

    public void clickButtonPizzaFourSeasons() {
        buttonChoosePizzaFourSeasons.click();
    }

    public void clickButtonAddToBasket(){
        buttonAddToBasket.click();
    }

    public void clickButtonBasket() {
        buttonBasket.click();
    }

    public boolean isDisplayedPizzaFourSeasonIntoBasket() {
        return fourSeasonsPizza.isDisplayed();
    }
}
