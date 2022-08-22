# Networking exercicio fixação 2.5.5

## Parte 1

### Etapa 2

Quantas interfaces Fast Ethernet o switch possui?

> Ele possui 24 interfaces (100Mbps)

Quantas interfaces Gigabit Ethernet o switch possui?

> Ele possui 2 interfaces (1000Mbps ou 1Gbps)

Qual é a faixa de valores mostrados nas linhas VTY?

> Ele possui dois intervalos, 0 a 4 e 5 a 15

Que comando exibirá o conteúdo atual da memória de acesso aleatório não volátil (NVRAM)?

> `show startup-config`

Por que o switch responde com "startup-config is not present?"

> Porque não tem uma configuração salva na memória NVRAM dispositivo

## Parte 2

### Etapa 2

Por que o comando login é necessário?

> Porque ele força o uso da senha quando houver uma conexão pela porta console

### Etapa 7

O que é exibido como a senha de ativação?

> É exibido caracteres da criptografia da senha

Por que a senha de ativação é exibida de forma diferente do que configuramos?

> Porque a senha foi encriptada

### Etapa 8

Se você configurar mais senhas no switch, elas serão exibidas no arquivo de configuração como texto simples ou em formato criptografado? Explique.

> Elas vão ser exibidas no formato criptografado, pois o comando `service password-encryption` encripta todas as senhas atuais e as futuras

## Parte 3

### Etapa 1

Quando esse banner será exibido?

> Será exibido quando é feito o acesso no nível de usuário

Por que cada switch deve ter um banner MOTD?

> Para avisar usuário que vão acessar esse switch

## Parte 4

### Etapa 1

Qual é a versão mais curta abreviada do comando `copy running-config startup-config`?

> `cop r st`

Que comando exibirá o conteúdo da NVRAM?

> `show startup-config` pois a NVRAM persiste a configuração inicial

Todas as alterações que foram digitadas foram registradas no arquivo ?

> Sim
