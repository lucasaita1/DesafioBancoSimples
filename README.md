# 💸 API Bancária – Desafio Banco de Konoha 🏦

Este projeto é uma API simples de contas bancárias, desenvolvida em Java como parte de um exercício de orientação a objetos. Ele simula funcionalidades básicas de contas correntes e poupanças, com foco em herança, abstração, interfaces e polimorfismo.

## 📚 Conceitos aplicados

- Interface Java (`Conta`)
- Classe abstrata (`ContaBancaria`)
- Herança (`ContaCorrente` e `ContaPoupanca`)
- Encapsulamento de atributos (`saldo`)
- Polimorfismo de métodos (`depositar()`)

## 🛠️ Estrutura do Projeto

```bash
src/
├── Conta.java              # Interface com os métodos base
├── ContaBancaria.java      # Classe abstrata com saldo e lógica comum
├── ContaCorrente.java      # Classe concreta sem taxa de depósito
├── ContaPoupanca.java      # Classe concreta com 1% de taxa no depósito
└── Main.java               # Classe para testar as funcionalidades
