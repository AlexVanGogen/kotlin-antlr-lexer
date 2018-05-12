# kotlin-antlr-lexer

Приложение для лексического и синтаксического разбора языка L.

## Инструкция по установке

```
git clone https://github.com/AlexVanGogen/kotlin-antlr-lexer.git
cd kotlin-antlr-lexer/kotlin-antlr-lexer
sh requirements.sh
```

## Инструкция по запуску

```
sh lparser.sh
```

Передаваемые аргументы:

* -c --- разбить код на токены (ввод кода из консоли);
* -f <filename> --- разбить код на токены (чтение кода из файла с заданным именем);
* -tc --- получить дерево разбора (ввод кода из консоли);
* -tf <filename> -- получить дерево разбора (чтение кода из файла с заданным именем)

Результат работы программы --- список токенов в формате `<тип токена> (<имя>*, <номер строки>, <позиция первого символа токена>, <позиция, следующая за последним символом токена>)` либо дерево разбора переданного кода, в зависимости от аргументов.
В случае ошибки, возникшей во время выполнения (например, лексическая ошибка), выводится сообщение об ошибке.

> \* Выводится только в случае, когда токеном является идентификатор или лексема (в остальных случаях имя однозначно определяется типом токена, см. примеры ниже).
 

## Примеры работы
### Разбиение на токены, чтение кода с консоли:
```
$ sh lparser.sh -c
while (x == 1) do {
	y := a + b;
}
```
Результат:
```
WHILE      (1, 0, 5)
LPAREN     (1, 6, 7)
ID         ('x', 1, 7, 8)
EQ         (1, 9, 11)
NUMBER     ('1', 1, 12, 13)
RPAREN     (1, 13, 14)
DO         (1, 15, 17)
LFIG       (1, 18, 19)
ID         ('y', 1, 20, 21)
ASSIGN     (1, 22, 24)
ID         ('a', 1, 25, 26)
PLUS       (1, 27, 28)
ID         ('b', 1, 29, 30)
SEP        (1, 30, 31)
RFIG       (1, 31, 32)
```

### Разбиение на токены, чтение из файла:
```
$ sh lparser.sh -f examples/comment.l 
```
Результат:
```
COMMENT    (1, 0, 14)
ID         ('x', 2, 0, 1)
ASSIGN     (2, 2, 4)
NUMBER     ('1', 2, 5, 6)
SEP        (2, 6, 7)
COMMENT    (2, 8, 31)
COMMENT    (3, 0, 26)
```

### Дерево разбора, чтение с консоли
```
$ sh lparser.sh -tc
if (x == 1) then {}
```
Результат:
```
Start of program
	Branch
		Condition
			Comparing operation
				Operation: ==
				Value: variable x
				Value: numeric constant 1
		True branch
End of program
```

### Дерево разбора, чтение из файла
```
$ sh lparser.sh -tf examples/parser/comments.l
```
Результат:
```
Start of program
	Assignment
		To variable: x
		Value: numeric constant 1
	Write
		Value: variable x
End of program
```

### Чтение с консоли файла кода с ошибкой
```
$ sh lparser.sh -c
a $= 1;
```
Результат:
```
token recognition error at: '$' (line: 1, position: 2)
```

### Чтение из файла кода с ошибкой
```
$ sh lparser.sh -f examples/bad/strangeSymbols2.l 
```
Результат:
```
token recognition error at: 'ई' (line: 1, position: 5)
```

Примеры хороших и плохих программ можно найти в папке `examples/`. Программы для проверки парсинга лежат в папке `examples/parser`.
