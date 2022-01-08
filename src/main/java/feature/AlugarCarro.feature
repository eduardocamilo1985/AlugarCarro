#language: pt
Funcionalidade: Aluguel de carro
  Como um usuario
  Gostaria de alugar um carro
  Para poder me transportar

  Cenário: Deve alugar um carro com sucesso
    Dado que o usuario preenche os dados de locacao
    Quando ele seleciona um carro
    Então é apresentado a página de resumo

