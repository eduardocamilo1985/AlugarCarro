# Projeto de teste automático 🤖: Alugar um carro em site de aluguel de carros 🚗
![unidas](icon/unidasLogo.png) ![info](icon/logoInfo.png)

<!--ts-->
* [Objetivo](#objetivo)
* [Tecnologias utilizadas](#tecnologia)
* [Utilização/estrutura](#utilizacao)

<!--te-->

# <a name="objetivo"></a>Objetivo

Este projeto tem como objetivo simular o aluguel de um carro no site Unidas.com.br usando as ferramentas
**Cucumber** e Selenium WebDriver. O projeto está na sua fase básica e não realiza muitas ações, 
apenas simula os passos básicos para alugar um carro. 

## <a name="tecnologia"></a>Tecnologias utilizadas
![Cucumber](icon/cucumber.png)
![JUnit](icon/Junit.png)
![Selenium](icon/SeleniumWebDriver.png)
![java](icon/java.png)
![IntelliJ](icon/IntelliJ.png)
![Maven](icon/Maven.png)


**Linguagem:** Java

**Frameworks:** Cucumber, JUnit, Selenium WebDriver 3.14

**Integrador/Compilador:** Maven

**IDE:** IntelliJ
## <a name="utilizacao"></a>Utilização/estrutura

Realizar o download do projeto (via git clone ou arquivo zip).

Importar o projeto na sua IDE de desenvolvimento favorita

**Estrutura do projeto**

A estrutura principal do projeto está localizada no diretório src/main/java. Os principais packages são:

* feature - Contém os casos de teste
* Steps — Contém as implementações dos casos de teste
* estrutura — Contém as classes estruturais do projeto (base para outras classes).
* page — Contém o mapeamento dos elementos das páginas.

O projeto utiliza os conceitos de DSL e Page Object

**Explicando algumas classes**

A classe **Basic** contém toda a parte Selenium utilizada.

A classe **RunnerTestJunit** é a classe responsável pela execução dos testes através do JUnit.
Execute essa classe e você verá os testes sendo executados.

A **package Page** contém todo o mapeamento de elementos da aplicação. Para cada página da aplicação web,
existe uma classe chamada NomePaginaPage que estende da classe Basic. Exemplo página que 
contém dados da reserva = ReservaPage.  
