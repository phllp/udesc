from ascii_values import get_ascii


# A tabela ASCII é um importante componente para programação de computadores, 
# ela representa todos os caracteres que podem existir nas mais diversas representações numéricas.

# Dito isso, utilizando qualquer linguagem de programação, crie um programa 
# que receba um byte e retorne o seu caractere correspondente, bem como o inverso.
DIV_LENGTH = 30

def hello():
  print('Esse e o conversor de binário para ASCII que o Felipe Beiger fez')
  print('Primeiramente, informe seu nome de usuário')
  username = input()
  print(f'Bem vindo {username}')
  return username

def get_operation():
  print('=' * DIV_LENGTH)
  print(f'Se você deseja converter um binário para um caractere ASCII digite 1')
  print(f'Se você deseja converter um caractere ASCII para um binário digite 2')
  print('=' * DIV_LENGTH)
  operation = int(input())
  return operation

def from_binary():
  print('BINARIO --> ASCII')
  print('Insira um byte')
  byte = input()

  ascii = get_ascii()
  
  if byte in ascii:
    output = ascii[byte]

    print('='  * DIV_LENGTH)
    print(f'O binário "{byte}" equivale ao caractere "{output}"')
    print('='  * DIV_LENGTH)
  else:
    print('='  * DIV_LENGTH)
    print(f'O binário "{byte}" não corresponde a nenhum caractere na tabela ASCII')
    print('='  * DIV_LENGTH)


def from_char():
  print('ASCII --> BINÁRIO')
  print('Insira um caractere')
  char = input()


  ascii = get_ascii()

  output = [k for k, v in ascii.items() if v == char]

  if len(output) == 0:
    print('='  * DIV_LENGTH)
    print(f'Caractere {char} não encontrado')
    print('='  * DIV_LENGTH)
  else: 
    print('='  * DIV_LENGTH)
    print(f'O caractere "{char}" equivale ao binário "{output[0]}"')
    print('='  * DIV_LENGTH)

#################

username = hello()


while True:
  operation = get_operation()
  if operation == 1:
    from_binary()
  elif operation == 2:
    from_char()
  else:
    print('Operação inválida.')
  
  print('Converter novamente? (y/n)')
  again =  str(input()).lower()
  if (again == 'n'):
    break
  elif again != 'y':
    print(f'Era pra informar "y" ou "n", mas tu informou "{again}", logo por decisão arbitrária do desenvolvedor o programa vai continuar rodando')
print('=' * DIV_LENGTH)
print('Programa encerrado')
print(f'Obrigado por usar nossos produtos {username}')
print('=' * DIV_LENGTH)