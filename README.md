# Padrão de Design Estratégia

Este é um exemplo simples de um padrão de design Estratégia em Java, que permite que você altere o comportamento de um objeto em tempo de execução.

## Visão Geral

O padrão de design Estratégia é usado quando você deseja definir uma família de algoritmos, encapsulá-los e torná-los intercambiáveis. Isso permite que você escolha o algoritmo a ser usado dinamicamente. No exemplo fornecido, temos um objeto `Personagem` que pode executar diferentes tipos de ações, como "Ataque", "Defesa" e "Normal", e você pode alternar entre essas ações em tempo de execução.

## Uso

Para executar este exemplo:

1. Clone ou faça o download deste repositório para a sua máquina local.
2. Importe o projeto em sua IDE Java preferida.
3. Execute a classe `App` para ver o funcionamento do padrão Estratégia.

## Estrutura do Projeto

A estrutura do projeto é organizada em pacotes:

- **`app`**: Contém a classe `App`, que é a classe principal para execução do exemplo.
- **`app.personagem`**: Contém a classe `Personagem`, que representa o personagem que executa ações.
- **`app.service`**: Contém a interface `Service`, que define o contrato para as diferentes estratégias.
- **`app.service.ataque`**: Contém a implementação da estratégia de "Ataque".
- **`app.service.defesa`**: Contém a implementação da estratégia de "Defesa".
- **`app.service.normal`**: Contém a implementação da estratégia "Normal".

## Funcionalidades

Este projeto demonstra como usar o padrão Estratégia para encapsular diferentes comportamentos e alterá-los dinamicamente em tempo de execução. O objeto `Personagem` pode ser configurado com diferentes estratégias (ações) e executar a ação escolhida.

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo [LICENSE](LICENSE) para obter detalhes.

## Autor

- Hudson Silva