package estrutura;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static estrutura.DriverFactory.getDriver;
import static estrutura.DriverFactory.killDriver;

public class Basic {

    public void acessar(String url){
        getDriver().get(url);
    }

    public void fecharNavegador(){
        killDriver();
    }

    public void escreverPorXpath(String xpath, String texto){
        getDriver().findElement(By.xpath(xpath)).sendKeys(texto);
    }

    public void clicarPorXpath(String xpath){
        getDriver().findElement(By.xpath(xpath)).click();
    }
    public void clicarPorLinkText (String link){
        getDriver().findElement(By.linkText(link)).click();
    }
    public void espera(String xpath){
        WebDriverWait espera = new WebDriverWait(getDriver(),30);
      //  espera.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        espera.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }
    public String obterTexto(String xpath){
        return getDriver().findElement(By.xpath(xpath)).getText();
    }


}
