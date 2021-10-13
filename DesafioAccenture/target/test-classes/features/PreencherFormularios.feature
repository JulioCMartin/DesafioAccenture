#language: pt
#coding:utf-8
Funcionalidade: Preencher formularios

  @preencherFormularios
  Cenario: preencheminto dos formularios envio e valida com sucesso
    Dado que estou no site
    Quando preencho todos os formularios 
    E envio para email
    Entao valido mensagem enviada com sucesso
