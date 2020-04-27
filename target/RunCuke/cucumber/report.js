$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/trello.feature");
formatter.feature({
  "name": "Trello-automation",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Realizar e modificar o Statos do postite",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Trello"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que ao loga no trello email \"trello-selenium@mailsac.com\" e senha \"Trello10@#\".",
  "keyword": "Dado "
});
formatter.match({
  "location": "Teste2.queAoLogaNoTrelloEmailESenha(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Valida o nome do usuario \"trello-selenium (userselenium1)\".",
  "keyword": "E "
});
formatter.match({
  "location": "Teste2.validaONomeDoUsuario(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "desloga usuario.",
  "keyword": "Então "
});
formatter.match({
  "location": "Teste2.deslogaUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});