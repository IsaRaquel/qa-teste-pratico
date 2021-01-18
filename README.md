# qa-teste-pratico

### 1)

Cenário: Verificar se o cliente recebe a mensagem quando um produto comumente comprado por ele está promoção

Dado:
Quando:
Então:

Cenário: Verificar se o cliente não recebe a mensagem quando um produto que nunca comprou está em promoção

Dado:
Quando:
Então:

Cenário: Verificar se o cliente não recebe a mensagem quando um produto que comprou um única vez está em promoção

Dado:
Quando:
Então:

Cenário: Verificar se o cliente recebe a mensagem quando três produtos comumente comprados estão em promoção

Dado:
Quando:
Então:

### 2)

Teste Unitarios feitos em java usando JUnit: <a href="https://github.com/IsaRaquel/qa-teste-pratico/tree/main/src">Testes Unitarios</a>

### 3)

SELECT p.nome, COUNT(*)
FROM produto_compra AS pc
JOIN produto AS p ON p.id = pc.id_produto
JOIN compra AS c ON c.id= pc.id_compra
JOIN cliente AS cl ON cl.id=c.id_cliente
where cl.id=1 And c.data >= DATE_ADD(CURDATE(), INTERVAL -90 DAY)
GROUP BY id_produto LIMIT 5

### 4)

Para a definição do pronto seria interessante acrescentar um etapa antes da disponibilização em produção, a sugiro que a definição de pronto seja está:

1. A funcionalidade/correção foi implementada
2. A funcionalidade/correção foi testada no ambiente de QA
3. A funcionalidade/correção foi validada em HOMOLOG pelo cliente.
4. A funcionalidade/correção está disponível em PROD.

A realização do teste de aceitação realizada pelo cliente é importante para garantir que está tudo conforme foi acordado.

Porém também se faz necessário que os erros apontados sejam melhor detalhados para os desenvolvedores. Para isso é necessário que a equipe de teste analise os erros para identificar qual o real problema (Ex: entender se o problema é no front ou no back) e os descrever melhor, assim os  existir um padrão de report de BUGs que os QAs da equipe possam utilizar, como o exemplo a seguir:

| Tópico               | Descrição                                                                           |
|----------------------|-------------------------------------------------------------------------------------|
| Título               | Título que retoma o erro                                                            |
| Descrição            | Descrição mais detalhada do problema                                                |
| Passos               | Um passo a passo para reproduzir o problema                                         |
| Resultado Atual:     | O que acontece ao se reproduzir o passo a passo atualmente                          |
| Resultado esperado:  | O que deveria acontecer ao se reproduzir o passo a passo e não existisse o problema |
| Evidências:          | Imagens, vídeos ou qualquer coisa que provam que o problema está ocorrendo          |
| Logs           	   | Logs de erros                                                                       |
| Ambiente             | Ambiente em que foi testado                                                         |
| Navegador            | Se for uma aplicação web dizer qual navegador e versão foi encontrado o problema    |
| Sistema Operacional: | O sistema operacional onde foi encontrado o problema                                |
| Versão testada:      | A versão do sistema que foi testada                                                 |


