# Atividade usando o Padrão Command

Este projeto implementa o padrão **Command** em Java para controlar dispositivos, como luz, TV, ventilador, entre outros. O sistema permite que os comandos sejam **armazenados** em um arquivo, **executados**, e depois **restaurados** após uma simulação de **pane elétrica**.

A solução foi desenvolvida com a ajuda da IA (ChatGPT), que forneceu um passo-a-passo detalhado e sugeriu as etapas para implementar a solução de forma eficiente e dentro do padrão Command.

## Uso da IA

O prompt inicial enviado para a IA foi o seguinte:

> **"ChatGPT, preciso implementar uma simulação usando o padrão Command. Cada comando deve possuir `execute()`, `store()` e `load()`. Preciso registrar comandos usados em um arquivo, simular uma pane elétrica e depois restaurar o estado executando os comandos lidos. Não gere código agora — gere um passo-a-passo lógico e organizado, explicando como criar as classes, interfaces, comandos concretos, persistência dos comandos e como simular a restauração. Esse passo-a-passo será convertido em commits separados."**

A IA sugeriu os seguintes passos para implementar a solução utilizando o padrão Command:

- **Criar a interface `Command`**: A interface define os métodos `execute()`, `store()` e `load()`, que os comandos concretos devem implementar.
- **Criar os comandos concretos**: Para cada dispositivo (como luz, TV, ventilador), a IA sugeriu a criação de comandos específicos, como `LightOnCommand`, `TVOnCommand`, etc.
- **Implementar o invocador (`ControleRemoto`)**: A classe `ControleRemoto` será responsável por executar os comandos e mantendo um histórico de execução.
- **Implementar a persistência de comandos**: A IA sugeriu o uso do método `store()` para salvar os comandos executados em um arquivo e o método `load()` para restaurá-los após uma falha.

Embora a IA tenha sugerido uma estrutura inicial para os comandos e a execução, alguns ajustes foram feitos para melhorar a solução:

- **Armazenamento no arquivo `historico.txt`**: A IA sugeriu apenas a execução dos comandos, mas foi necessário adicionar um mecanismo de **persistência** para salvar os comandos no arquivo `historico.txt` e restaurá-los quando necessário.
- **Adição de novos dispositivos**: A IA sugeriu a criação de comandos para dispositivos como luz e TV, mas foram adicionados mais dispositivos para garantir que o sistema estivesse completo e de acordo com o enunciado da questão.
- **Simplificação do código**: Não foi necessária a criação da classe `Casa`, e a lógica foi simplificada, com os comandos diretamente executando as ações desejadas.

A IA forneceu insights sobre **como organizar o código**, sugerindo que os comandos fossem **modulares** e que o **processo de execução e restauração** fosse mantido de forma simples e eficiente. Além disso, a IA indicou que a **persistência dos comandos** seria essencial para simular a recuperação do estado após uma falha (pane elétrica).

## Execução

Para testar a implementação:

1. **Clone o repositório**:
   ```bash
   git clone https://github.com/seu-usuario/Command_Lista2POO.git
