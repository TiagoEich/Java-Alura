# ☕ Fundamentos de Java e Programação Orientada a Objetos

Repositório com exercícios e projetos desenvolvidos durante o curso **Java e Spring Boot** da [Alura](https://www.alura.com.br/). O conteúdo acompanha uma progressão do básico da linguagem até consumo de APIs externas e manipulação de arquivos JSON.

---

## 🛠️ Tecnologias Utilizadas

- **Java 21**
- **IntelliJ IDEA**
- **Gson** — serialização e desserialização de JSON
- **Java HTTP Client** — consumo de APIs externas
- **Git & GitHub**

---

## 📚 Conteúdo e Progressão

### 🔹 Fundamentos da Linguagem
Primeiros passos com Java: variáveis, operadores, estruturas condicionais, laços de repetição e leitura de dados com `Scanner`.

### 🔹 Programação Orientada a Objetos
Modelagem de classes com encapsulamento, construtores, getters e setters, herança, polimorfismo e interfaces.

### 🔹 Coleções e Ordenação
Uso de `ArrayList`, `LinkedList`, `Collections.sort` e a interface `Comparable` para ordenação de objetos.

### 🔹 Consumo de APIs Externas
Requisições HTTP com `HttpClient` para APIs públicas:
- **OMDb API** — busca de filmes por título
- **ViaCEP** — consulta de endereço por CEP
- **TheMealDB** — busca de receitas
- **CoinGecko** — cotação de criptomoedas
- **GitHub API** — consulta de perfis de usuário
- **Google Books** — busca de livros

### 🔹 Manipulação de JSON e Arquivos
Conversão de JSON para objetos Java com Gson e escrita de arquivos `.json` e `.txt`.

### 🔹 Tratamento de Exceções
Uso de `try/catch`, exceções customizadas e boas práticas de tratamento de erros.

---

## 🗂️ Projetos Práticos

### 📺 ScreenMatch
Sistema de catálogo de filmes e séries com avaliações, cálculo de média, filtro de recomendação e busca na **OMDb API**. Os resultados são serializados e salvos em `filmes.json`.

### 📍 Buscador de CEP
Consulta endereços a partir de um CEP utilizando a **API ViaCEP**. O endereço retornado é serializado com Gson e salvo em um arquivo `.json` nomeado com o CEP consultado.

### 💳 Simulador de Cartão de Crédito
Simula operações de um cartão de crédito: lançamento de compras com controle de saldo e exibição das compras ordenadas por valor.

---

## 📖 Desenvolvido durante o curso

Projeto desenvolvido acompanhando o curso **Java e Spring Boot** da [Alura](https://www.alura.com.br/).
