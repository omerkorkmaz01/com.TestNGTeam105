package tests.day19_crossBrowser;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.*;

import javax.sql.rowset.serial.SerialStruct;
import javax.swing.*;
import java.util.StringTokenizer;

public class C01_AmazonSearch extends TestBaseCross {
    @Test
    public void test01(){
    // amazon anasayfaya gidelim
        driver.get(ConfigReader.getProperty("amazonUrl"));
    // Nutella icin arama yapalim
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearctetbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    // Sonuclarin Nutella icerdigini test edelim
        WebElement sonuzYaziElementi=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String actualSonucYaziElementi= sonuzYaziElementi.getText();
        String expectedKelime="Nutella";

        Assert.assertTrue(actualSonucYaziElementi.contains(expectedKelime));

    }
}
