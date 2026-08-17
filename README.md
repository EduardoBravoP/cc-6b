# Comparação

## Raciocínio antes de escrever código

- **Funcional:** o enunciado já descreve a solução — transformar cada elemento (quadrado) e agregar (soma). Traduzimos quase literalmente para `map` + `sum`.
- **Lógico (Portugol):** pensamos na definição recursiva — lista vazia (índice ≥ tamanho) → 0; caso contrário → quadrado do elemento + soma do resto. Depois transcrevemos isso em funções recursivas com índice e tamanho.
- **Orientado a objetos:** antes de calcular, decidimos *quem* é o objeto, como guardar a lista, o que expor e o que esconder — decisões que o enunciado não pedia.

**Menos tradução mental:** funcional. Em segundo, lógico (Portugol). OO exigiu mais, porque o problema não traz uma entidade natural a modelar.

## Qual comunica a intenção mais rápido?

Lendo o código pronto, sem simular a execução:

- **Funcional** — `.mapToInt(n -> n * n).sum()` diz diretamente “elevar ao quadrado e somar”.
- **Lógico (Portugol)** — a recursão com caso-base deixa a intenção clara, mas o índice e o tamanho atrapalham a leitura.
- **OO** — o laço com acumulador (`soma = 0`, `for`, `soma = soma + …`) obriga a rodar o algoritmo mentalmente para ter certeza do resultado.

**Mais rápido:** funcional.

## Tabela

Linhas efetivas: sem `import`, sem chaves isoladas, sem comentários, sem linhas em branco e sem `println`/`escreva` de demonstração.

| Paradigma | Linhas efetivas | Conceitos novos |
|---|---:|---:|
| Funcional (Java) | 4 | 5 — `Stream`, lambda, `map`/`mapToInt`, `sum`/`reduce`, method reference |
| Lógico (Portugol) | 6 | 4 — função recursiva, caso-base, índice como “cauda”, passagem de vetor + tamanho |
| Orientado a objetos (Java) | 17 | 7 — classe, atributo, encapsulamento, construtor, imutabilidade/cópia defensiva, `new`, método auxiliar privado |
