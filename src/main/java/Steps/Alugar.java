package Steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Ent�o;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.HomePage;
import pages.ReservaPage;


public class Alugar {
    HomePage home = new HomePage();
    ReservaPage reserva = new ReservaPage();

    @Dado("que o usuario preenche os dados de locacao")
    public void preencheDadosdeLocacao() throws InterruptedException {
        home.acessarSite("http://www.unidas.com.br");
        home.aceitarCookies();
        home.localRetirada("Shopping Nova Iguacu");
        home.dataRetirada();
        home.dataDevolucao();
        home.btnAlugar();
    }
    @Quando("ele seleciona um carro")
    public void selecionarCarro() throws InterruptedException {
        reserva.selecionaCarro();
    }
    @Ent�o("� apresentado a p�gina de resumo")
    public void �_apresentado_a_p�gina_de_resumo() {
        Assert.assertEquals("Resumo da reserva",reserva.confereTituloResumo());
        reserva.finalizar();
   }
}
