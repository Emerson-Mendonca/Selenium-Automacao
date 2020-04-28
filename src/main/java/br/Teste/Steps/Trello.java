package br.Teste.Steps;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class Trello {

    private WebDriver driver;

    String user;

    @Before
    public void setUpBeforeClass() {
        File file = new File("src\\main\\resources\\webdriver\\chromedriver.exe");
        // File file = new File("src\\main\\resources\\webdriver\\geckodriver64x.exe");
        String path = file.getPath();

        System.setProperty("webdriver.chrome.driver", path);
        // System.setProperty("webdriver.gecko.driver", path);

        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
    }

    @Dado("que ao loga no trello email {string} e senha {string}.")
    public void queAoLogaNoTrelloEmailESenha(String email, String senha) throws InterruptedException {
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://trello.com/login?returnUrl=%2Fb%2FqeGP9eRk%2Ftrello-automation");

        driver.findElement(By.name("user")).sendKeys(email);

        Thread.sleep(2100);

        driver.findElement(By.id("login")).click();

        Thread.sleep(1200);

        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(senha);

        driver.findElement(By.id("login-submit")).click();

    }

    @E("Valida o nome do usuario {string}.")
    public void validaONomeDoUsuario(String nome) {
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@title='trello-selenium (userselenium1)']")).click();

        user = driver.findElement(By.xpath("//h1[@class='_2Un9i9htRmbUrY']")).getText();

        assertEquals(nome, user);
    }

    @Então("desloga usuario.")
    public void deslogaUsuario() {
        driver.findElement(By.xpath("//button[@data-test-id='header-member-menu-logout']")).click();

        driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[@href='/login']")).isEnabled();

    }

    @After
    public void tearDownClass() {
        // driver.close();
        driver.quit();

    }

}