#! /bin/bash

echo "Criando o usuário $1..."

sudo useradd -U -m -p $2 $1

echo "Usuário $1 criado!"
