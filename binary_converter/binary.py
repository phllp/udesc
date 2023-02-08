def to_binary(number, arr):
  number = int(number)
  division = number // 2
  rest = number % 2

  arr.append(str(rest))
  if division != 1 and number != 0:
    to_binary(division, arr)
  elif number == 0:
    arr = ['0']
  else:
    arr.append(str(1))

  arr.reverse()
  return ''.join(arr)

def to_decimal(binary):
  arr = [*str(binary)]
  arr.reverse()
  i = 0
  sum = 0
  exp = 0
  for number in arr:
    if int(number) != 0 and int(number) != 1:
      raise Exception('Números binários só podem utilizar dois algarismos, 0 ou 1.')
    if int(number) != 0:
      exp = 2 ** int(i)
      sum += exp  
    i += 1
  return sum
  
DIV_LENGTH = 35

def converter():
  print('='* DIV_LENGTH)
  print('Binary to Decimal Converter')
  print('='* DIV_LENGTH)
  print('\n')

  while True:
    print('='* DIV_LENGTH)
    print("Qual operação você deseja realizar? \n 1: Binário -> Decimal \n 2: Decimal -> Binário")
    operation = int(input())

    if operation == 1:
      print('='* DIV_LENGTH)
      print("Informe o número que deseja converter para decimal")
      binary_number = input()
      print(f'O número binário "{binary_number}" equivale ao número decimal "{to_decimal(binary_number)}".')
    elif operation == 2:
      print('='* DIV_LENGTH)
      print("Informe o número que deseja converter para binário")
      list = []
      decimal_number = input()
      print(f'O número decimal "{decimal_number}" equivale ao número binário "{to_binary(decimal_number, list)}"')
    else: 
      print('='* DIV_LENGTH)
      print('Operação inválida')
    
    print('Converter novamente? (Y/N)')
    run_again = input()
    if (run_again.lower() == 'n'):
      break
    elif run_again.lower() != 'y' and run_again.lower() != 'n':
      print(f'Considerando que era pra informar "Y" ou "N" e você informou "{run_again}", vamos considerar que você deseja executar mais uma conversão.')

converter()