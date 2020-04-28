$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/trello.feature");
formatter.feature({
  "name": "Trello-automation",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Realizar e modificar o Statos do postite",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@Trello"
    }
  ]
});
formatter.step({
  "name": "que ao loga no trello email \"trello-selenium@mailsac.com\" e senha \"Trello10@#\".",
  "keyword": "Dado "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Valida o nome do usuario \"trello-selenium (userselenium1)\".",
  "keyword": "E "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "desloga usuario.",
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});