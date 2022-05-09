#! /bin/bash

echo "Deletando usuário $1..."

sudo userdel $1

echo "Usuário $1 deletado!"
