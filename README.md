# qa-teste-pratico

<h3> 1)</h3>

<h4>Cenário: Verificar se o cliente recebe a mensagem quando um produto comumente comprado por ele está promoção</h4>

**Dado:** Que o cliente tem um produto comumente comprado<br>
**E:** O cliente não comprou o produto nos últimos 5 dias<br>
**Quando:** O produto entra em promoção<br>
**Então:** O cliente recebe um mensagem informando que o produto entrou em promoção<br>

<h4>Cenário: Verificar se o cliente não recebe a mensagem quando um produto que nunca comprou está em promoção</h4>

**Dado:** Que o cliente tem um produto comumente comprado<br>
**E:** O cliente não comprou o produto nos últimos 5 dias<br>
**Quando:** Um produto que o cliente não costuma comprar entra em promoção<br>
**Então:** O cliente não deve recebe um mensagem informando que o produto entrou em promoção<br>


<h4>Cenário: Verificar se o cliente não recebe a mensagem quando um produto que comprou um única vez está em promoção</h4>

**Dado:** Que o cliente tem três produto comumente comprado<br>
**E:** Tem um produto que comprou uma única vez<br>
**E:** O cliente não comprou o produto nos últimos 5 dias<br>
**Quando:** O produto comprado uma única vez entra em promoção<br>
**Então:** O cliente não deve recebe um mensagem informando que o produto entrou em promoção<br>

<h4>Cenário: Verificar se o cliente recebe a mensagem quando tem três produtos comumente comprados estão em promoção</h4>

**Dado:** Que o cliente tem três produtos comumente comprados<br>
**E:** O cliente não comprou os produtos nos últimos 5 dias<br>
**Quando:** Os produtos entram em promoção<br>
**Então:** O cliente recebe um mensagem informando que os produtos entraram em promoção<br>

<h4>Cenário: Verificar se o cliente recebe a mensagem quando comprou o produto nos últimos 5 dias</h4>

**Dado:** Que o cliente tem um produtos comumente comprados<br>
**E:** O cliente comprou a produto nos últimos 5 dias<br>
**Quando:** O produto entra em promoção<br>
**Então:** O cliente não deve recebe um mensagem informando que o produto entrou em promoção<br>

<h4>Cenário: Verificar se o cliente recebe a mensagem quando três produtos comumente comprados estão em promoção e um foi comprado nos últimos cinco dias</h4>

**Dado:** Que o cliente tem três produtos comumente comprados<br>
**E:** O cliente comprou um produto nos últimos 5 dias<br>
**Quando:** Os produtos entram em promoção<br>
**Então:** O cliente recebe um mensagem informando que dois produtos entraram em promoção<br>
**E:** O produto comprado nos últimos 5 dias não é listado<br>



### 2)

Teste unitários feitos em java usando JUnit: <a href="https://github.com/IsaRaquel/qa-teste-pratico/tree/main/src">**Testes Unitários**</a>

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

Porém também se faz necessário que os erros apontados sejam melhor detalhados para os desenvolvedores. Para isso é necessário que a equipe de teste analise os erros para identificar qual o real problema (Ex: entender se o problema é no front ou no back) e os descrever melhor, assim os  existir um padrão de reporte de BUGs que os QAs da equipe possam utilizar, como o exemplo a seguir:

| **Tópico do Reporte**               |                **Descrição**                                                            |
|----------------------|-------------------------------------------------------------------------------------|
| **Título**               | Título que resume o erro                                                            |
| **Descrição**            | Descrição mais detalhada do problema                                                |
| **Passos**               | Um passo a passo para reproduzir o problema                                         |
| **Resultado Atual**     | O que acontece ao se reproduzir o passo a passo atualmente                          |
| **Resultado esperado**  | O que deveria acontecer ao se reproduzir o passo a passo e não existisse o problema |
| **Evidências**          | Imagens, vídeos ou qualquer coisa que provam que o problema está ocorrendo          |
| **Logs**           	   | Logs de erros                                                                       |
| **Ambiente**             | Ambiente em que foi testado                                                         |
| **Navegador**            | Se for uma aplicação web, dizer qual navegador e versão foi encontrado o problema    |
| **Sistema Operacional** | O sistema operacional onde foi encontrado o problema                                |
| **Versão testada**      | A versão do sistema que foi testada                                                 |


