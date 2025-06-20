# 🖨️ Sistema de Fila de Impressão com Prioridade (DEQUE)

Este projeto implementa um sistema de controle de **fila de impressão inteligente** utilizando a estrutura de dados **DEQUE** (Fila Duplamente Encadeada), que simula uma impressora moderna capaz de:

- Priorizar documentos urgentes  
- Processar trabalhos tanto do início quanto do final da fila  
- Gerenciar documentos com tipos e páginas variadas  

---

## 📌 Funcionalidades

| Função                          | Descrição                                                   |
|--------------------------------|--------------------------------------------------------------|
| `adicionar_documento_normal()` | Adiciona o documento ao final da fila                       |
| `adicionar_documento_urgente()`| Adiciona o documento ao início da fila                      |
| `processar_proximo()`          | Processa (remove e retorna) o documento no início da fila   |
| `processar_ultimo()`           | Processa (remove e retorna) o documento no final da fila    |
| `visualizar_fila()`            | Exibe todos os documentos atualmente na fila                |
| `fila_vazia()`                 | Verifica se a fila está vazia                               |
| `total_documentos()`           | Retorna o total de documentos na fila                       |
| `total_paginas()`              | Retorna o total de páginas restantes para impressão         |

---

## 📄 Modelo de Documento

Cada documento da fila possui os seguintes atributos:

- `ID`: Identificador único aleatório entre `1` e `1000` (não pode se repetir)
- `Tipo`: Um dos seguintes formatos gerados aleatoriamente:
  - `PDF`, `TXT`, `JPG`, `PNG`, `DOCX`, `XLSX`
- `Páginas`: Número aleatório entre `1` e `100`

---

## 🧠 Lógica do Sistema

- O sistema utiliza um **DEQUE (Double Ended Queue)** para representar a fila de documentos.
- Documentos urgentes são inseridos no **início da fila**.
- Documentos normais são inseridos no **final da fila**.
- Impressões podem ser processadas **do início ou do final** conforme necessidade.
- A geração de documentos utiliza mecanismos de aleatoriedade para simular um ambiente realista.

---

## 🛠️ Tecnologias e Requisitos

- Linguagem: Java (ou linguagem escolhida)
- Estrutura de dados: Implementação própria ou nativa de DEQUE
- Nenhuma biblioteca externa obrigatória

---

## 🚀 Como Executar

1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/fila-impressao-deque.git
   ```

2. Compile o projeto:
   ```bash
   javac Main.java
   ```

3. Execute o sistema:
   ```bash
   java Main
   ```

> 💡 Use sua IDE favorita (Eclipse, IntelliJ, VSCode) para melhor organização e testes.

---

## 💡 Possíveis Extensões Futuras

- Adição de prioridade por número de páginas  
- Controle de diferentes impressoras (paralelismo real)  
- Interface gráfica para manipulação da fila  
- Exportação de logs de impressão  

---

## 📁 Estrutura de Arquivos

```
/src
├── Documento.java
├── ImpressoraDeque.java
└── Main.java
README.md
```

---

## 👨‍💻 Autor

Desenvolvido por Felipe Sanches.  
Sinta-se livre para contribuir ou sugerir melhorias! 🤝