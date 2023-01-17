package tests.day14_testNGFramework;

import org.testng.annotations.Test;

public class C01_TestNGIlkTest {
    /*
        TestNG test method'larini isim sirasina gore calistirir
        priority degeri verilen method'lar priority degeri kucukten buyuge dogru calisir
        Esit olan priortiy degelerinde harf sirasina gore calisir
        eger priortiy degeri yazmazsak priortiy=0 kabul edilir

    */

    @Test(priority = 6)
    public void ilkTest(){
        System.out.println("ilk test calisti");
    }
    @Test()
    public void ikinciTest(){
        System.out.println("ikinci test calisti");
    }
    @Test(priority = -9)
    public void ucuncuTest(){
        System.out.println("ucuncu test calisti");
    }
}
