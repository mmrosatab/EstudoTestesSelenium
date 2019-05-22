# EstudoTestesSelenium

Este repositório se destina ao estudo de testes com Selenium utilizando a IDE eclipse visando explorar desde a configuraçao da IDE eclipse até a implementação dos testes.

#### O que é necessário?

+ [IDE Eclipse]
+ [Selenium]
+ [Gecko Driver]

#### Configurando o eclipse

* Crie um Java Project
* Baixe o zip do Selenium
  * Importe os .jars para dentro projeto
  
  ![add-external-jars](https://user-images.githubusercontent.com/9852787/58213769-b47ef280-7cc9-11e9-88a4-e7a449f06821.png)
  ![importJars](https://user-images.githubusercontent.com/9852787/58213770-b47ef280-7cc9-11e9-9d2b-b04ac76e9dbc.png)
  
* Crie uma classe java, dentro desta classe adicione um main e dentro do main coloque a linha de código abaixo alterando somente o diretório onde o Gecko Driver está localizado em sua máquina.

  * System.setProperty("webdriver.gecko.driver", "/home/mmrosa/MEGA/MEGAsync/Faculdade/20191/COMP3/programas/geckodriver");

* Escreva o resto do seu código para teste e execute.
