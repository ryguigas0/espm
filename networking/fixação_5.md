# Exercício de fixação 5

## Parte 1

### Etapa 1: DECIMAL -> BINÁRIO

> Régua: 128 64 32 16 8 4 2 1

- 192 -> 11000000
- 168 -> 10101000
- 10 -> 00001010
- 255 -> 11111111
- 2 -> 00000010

### Etapa 2: IP DECIMAL -> IP BINÁRIO

- 192.168.10.10 -> 11000000.10101000.00001010.00001010
- 209.165.200.229 -> 11001000.10100101.10100000.11100101
- 172.16.18.183 -> 10101100.00010000.00010010.10110111
- 10.86.252.17 -> 00001010.00000000.00000000.00000000 TODO
- 255.255.255.128 -> 00000000.00000000.00000000.00000000 TODO
- 255.255.192.0 -> 00000000.00000000.00000000.00000000 TODO

## Parte 2

### Etapa 1

1. IPV4 Decimal -> IPV4 Binário
2. Máscara de Sub-Rede Decimal -> Máscara de Sub-Rede Binário
3. IPV4 Bin AND Mask Bin = Endereço de rede

### Etapa 2

> Régua: 128 64 32 16 8 4 2 1

#### A

- IPV4: 172.16.145.29 -> 10101100.00010000.10010001.00011101
- Mask: 255.255.0.0 -> 11111111.11111111.00000000.00000000
- Addr: 172.16.0.0 -> 10101100.00010000.00000000.00000000

#### B

- IPV4: 172.16.145.29 -> 10101100.00010000.10010001.00011101
- Mask: 255.255.0.0 -> 11111111.11111111.00000000.00000000
- Addr: 172.16.0.0 -> 10101100.00010000.00000000.00000000

#### C

- IPV4: 192.168.10.10
- Mask: 255.255.255.0
- Addr: 192.168.10.0

#### D

- IPV4: 192.168.68.210 -> 210 = 11010010
- Mask: 255.255.255.128 -> 128 = 10000000
- Addr: 192.168.68.128 <- 128 = 10000000

#### E

- IPV4: 10.172.2.8 -> 172 = 10101100
- Mask: 255.224.0.0 -> 224 = 11100000
- Addr: 10.160.0.0 <- 160 = 10100000

## Parte 3

### Etapa 1

#### A

IP PC-A: 192.168.1.18 | IP PC-B: 192.168.1.33 | MASK: 255.255.255.240

Qual endereço do PC-A? 192.168.1.16

Qual endereço do PC-B? 192.168.1.32

Esses computadores vão poder se comunicar diretamente um com o outro? Sim

Qual é o endereço mais alto que pode ser atribuído a PC-B de forma que ele fique
na mesma rede de PC-A? 192.168.15.254

#### B

IP PC-A: 10.0.0.16 | IP PC-B: 10.1.14.68 | MASK: 255.254.0.0

Qual endereço do PC-A? 10.0.0.0

Qual endereço do PC-B? 10.0.0.0

Esses computadores vão poder se comunicar diretamente um com o outro? Sim

Qual é o endereço mais alto que pode ser atribuído a PC-B de forma que ele fique
na mesma rede de PC-A? 192.168.15.254

### Etapa 2

#### A

HOST1: 172.16.140.24 | MASK: 255.255.192.0

Qual é o endereço de rede dessa rede? 172.16.128.0

Qual é o endereço do gateway padrão desse host? 172.16.128.1

#### B

HOST1: 192.168.184.227 | MASK: 255.255.255.248

Qual é o endereço de rede dessa rede? 192.168.0.0

Qual é o endereço do gateway padrão desse host? 192.168.0.1

### Reflexão

Por que a máscara de sub-rede é importante para determinar o endereço de rede?
Porque o endereço de subrede consegue subdividir os dispositivos em redes
específicas
