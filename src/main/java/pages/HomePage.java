package pages;

import estrutura.Basic;

public class HomePage extends Basic {


    public void acessarSite(String url){
        acessar(url);
    }
    public void aceitarCookies() throws InterruptedException {
         Thread.sleep(6000); // refatorar
        clicarPorXpath("//a[@class='cookieBarButton cookieBarConsentButton']");
    }

    public void localRetirada(String local){
        escreverPorXpath("//input[@name='storeField']",local);
        espera("//li[contains(.,'Shopping')][1]");
        clicarPorXpath("//li[contains(.,'Shopping')][1]");
    }

    public void dataRetirada(){
        clicarPorXpath("//*[@id='date-out']");
        clicarPorXpath("//table//tr[5]/td[5]");
    }
    public void dataDevolucao(){
        clicarPorXpath("//input[@id='date-dev']");
        clicarPorXpath("//table//tr[5]/td[6]");
    }
    public void horaRetirada(String hora){
        escreverPorXpath("//input[@id='hour-out']",hora);
    }
    public void horaDevolucao(String hora){
        escreverPorXpath("//input[@id='hour-dev']",hora);
    }

    public void btnAlugar(){
        clicarPorXpath("//a[@class='primary-button']");
    }
}
