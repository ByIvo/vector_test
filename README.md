# vector_test
Teste de manipulação de vetores

#Objetivos

Através da informação de um múltiplo de 10 entre 10 e 1000 (_**entradaUsuario**_), o sistema deve preencher um array de 10 posições considerando:

* Quando a posição for múltiplo de 3, preencher usando a fórmula _**posição * (.3 * entradaUsuario)**_;
* Quando a posição NÃO for múltiplo de 3, preencher usando a fórmula _**posição * (.1 * entradaUsuário)**_.

Após isso, é possível somar os números das posições pares ou ímpares.

OBS: Considera-se a indexação da _**posição**_ iniciando em 1, ou seja, 1 até 10.

## Exemplo:

* O usuário informa o valor 200.
* Um array é preenchido, segundo as regras acima explicadas, desta maneira: {20,40,180,80,100,360,140,160,540,200}
* A soma dos pares será: 40 + 80 + 360 + 160 + 200 = 840;
* A soma dos ímpares será: 20 + 180 + 100 + 140 + 540 = 980;
