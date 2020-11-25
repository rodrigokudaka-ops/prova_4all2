package testes;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class informacoesUsuarioTest {
    @Test
    public void testAcessarSite () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rkudaka\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        navegador.get("https://shopcart-challenge.4all.com/");

        navegador.findElement(By.linkText("category-1")).click();

        navegador.findElement(By.linkText("add-product-4-btn")).click();

        navegador.findElement(By.linkText("add-product-5-btn")).click();
        //carrinho
        navegador.findElement(By.linkText("cart-btn")).click();

        navegador.findElement(By.linkText("finish-checkout-button")).click();

        navegador.findElement(By.linkText("Fechar")).click();

        Assert.assertEquals();

        navegador.quit();
    }

}
