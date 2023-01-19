package tests.day18_htmlReports;

import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {


    @DataProvider
    public static Object[][] AmazonAranacakKelime() {
        /*
            @DataProvider istedigimiz test method'una test datasi saglamak icin kullanilir
            sadece bir sarti vardir
            iki katli bir Object array'i dondurmelidir
         */
        Object[][] amazonAranacakKelimeArrayi=
                {{"Nutella"}, {"Java"}, {"Apple"}, {"Samsung"}, {"armut"}};

        return amazonAranacakKelimeArrayi;
    }

    // amazona gidelim
    // Nutella, Java, Apple, Samsung, armut kelimeleri icin arama yapalim
    // sonuclarin bu kelimeleri icerdigini test edelim

    @Test(dataProvider = "AmazonAranacakKelime")
    public void aramaTesti(String aranacakKelime){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

        AmazonPage amazonPage= new AmazonPage();

        amazonPage.amazonAramaKutusu.sendKeys(aranacakKelime+ Keys.ENTER);

        String actualSonucYazisi= amazonPage.aramaSonucuElementi.getText();

        Assert.assertTrue(actualSonucYazisi.contains(aranacakKelime));
    }

}
