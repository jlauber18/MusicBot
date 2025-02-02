
## Esboço da Arquitetura de Software

O comando "lyrics" é utilizado para pesquisar letras de músicas, no projeto apresentamos algumas propostas para melhorar tal função.

## Diagrama de Classe

Trajeto padrão para o comando "lyrics".

<img src="diagramas/1/1-DiagramaClasse.png" width=100% title="Diagrama de Classe"/>

## Issue #1

Uma das propostas do projeto é a adição de uma busca padrão de letra de música.
Ao digitar o comando "lyrics" o software deve mostrar a letra da música que está tocando atualmente mesmo que não seja identificado seu nome.

## Diagrama de Sequência

Efetua a busca padrão.

<img src="diagramas/1/1-Diagrama-de-sequência.png" width=100% title="Diagrama de Sequência"/>

## Diagrama de Sequência Erro 1

Erro que ocorre quando o comando é lido pelo bot, mas nenhuma música está sendo tocada.

<img src="diagramas/1/1-DDS-Erro1.png" width=100% title="Diagrama de Sequência Erro 1"/>

## Diagrama de Sequência Erro 2

Erro que ocorre quando a letra da música não é encontrada.

<img src="diagramas/1/1-DDS-Erro2.png" width=100% title="Diagrama de Sequência Erro 2"/>

## Issue #5

Outra proposta do projeto é a busca precisa da letra de uma música.
Ao digitar o título da música ou utilizar a busca padrão, o bot deve ignorar caracteres especiais e procurar por nomes/títulos semelhantes para evitar erros durante a busca da letra.

## Diagrama de Sequência

<img src="diagramas/5/5-Diagrama-de-sequência.png" width=100% title="Diagrama de Sequência"/>

## Diagrama de Sequência Erro

Erro que ocorre quando o comando é lido pelo bot, mas nenhuma música está sendo tocada.

<img src="diagramas/5/5-DDS-erro.png" width=100% title="Diagrama de Sequência Erro 1"/>
