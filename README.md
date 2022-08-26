
API elaborada e desenvolvida para participação do "Challenge Backend" do Itaú. 
Foi estipulado o prazo de 7 dias para desenvolvimento e entrega. Abaixo, orientações dadas no repositório referente ao challenge e, após, instruções sobre como baixar e rodar a aplicação.

## 🚀 Instruções para desenvolvimento: 

Considere uma senha sendo válida quando a mesma possuir as seguintes definições:

- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
- Considere como especial os seguintes caracteres: !@#$%^&*()-+
  - Não possuir caracteres repetidos dentro do conjunto

Exemplo:

``` 
IsValid("") // false  
IsValid("aa") // false  
IsValid("ab") // false  
IsValid("AAAbbbCc") // false  
IsValid("AbTp9!foo") // false  
IsValid("AbTp9!foA") // false
IsValid("AbTp9 fok") // false
IsValid("AbTp9!fok") // true
```

` Nota: Espaços em branco não devem ser considerados como caracteres válidos. `

## 🤯 Problema:
Construa uma aplicação que exponha uma api web que valide se uma senha é válida.

Input: Uma senha (string).
Output: Um boolean indicando se a senha é válida.

Embora nossas aplicações sejam escritas em Kotlin e C# (.net core), você não precisa escrever sua solução usando elas. Use a linguagem de programação que considera ter mais conhecimento.

Para mais detalhes, acesse o repositório original do challenge, [clicando aqui](https://github.com/itidigital/backend-challenge).

## 🔔 Requisitos:

SDK Java 11 [(DOWNLOAD)](https://www.oracle.com/java/technologies/downloads/#java11)

Maven [(DOWNLOAD)](https://maven.apache.org/download.cgi)

## 💻 Primeiros passos:

Clone do projeto Git: 

`
git clone https://github.com/RebecaKarinne/itau-password.git
`

No terminal da sua IDE, ou no CMD dentro do diretório do projeto, execute: 

`
./mvnw spring-boot:run
`

Em seguida, vá até sua ferramenta de testes locais (recomendo o PostMan) e execute o GET:

`
localhost:8080/validate-password
`

Com o seguinte parâmetro no Body: 

`
{
    "password": "AbTp9!fok"
}
`

Vá alterando o parâmetro entre os descritos no início deste documento, em "Exemplos".


## 🎯 Informações extras:

- Em toda a aplicação, foi utilizada a linguagem Java;
- Foi utilizado o Regex (expressões regulares) para todas as validações;
- Foi utilizado o PostMan para testes locais;
- Para testes unitários, foi utilizado o JUnit.







