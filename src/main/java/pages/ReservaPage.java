package pages;

import estrutura.Basic;

public class ReservaPage extends Basic {
    public void selecionaCarro() throws InterruptedException {
        Thread.sleep(5000); // deve ser refatorado
        clicarPorXpath("//div/span[contains(text(),'Pagar')]");
    }
    public void opCarbonoNeutro(){
        clicarPorXpath("//div[@class='head carbon-head']//label");
    }
    public void opProtecaoCompleta(){
        clicarPorXpath("//div[contains(text(),'Proteção Completa')]//following::label[1]");
    }

    public void opProtecaoSuperZero(){
        clicarPorXpath("//div[contains(text(),'Proteção Super Zero')]//following::label[1]");
    }
    public void opProtecaoTerceiros(){
        clicarPorXpath("//div[contains(text(),'Proteção A Terceiros')]//following::label[1]");
    }
    public void opProtecaoOcupantesETerceiros(){
        clicarPorXpath("//div[contains(text(),'Proteção Ocupantes E Terceiros')]//following::label[1]");
    }
    public void opProtecaoParcial(){
        clicarPorXpath("//div[contains(text(),'Proteção Parcial')]//following::label[1]");
    }
    public String retiradaDevolucaoIguais(){
        return obterTexto("//div[@class='item'][1]");
    }
    public String confereTituloResumo(){
        return obterTexto("//h1[contains(text(),'Resumo da reserva')]");
    }
    public void finalizar(){
        fecharNavegador();
    }








}
