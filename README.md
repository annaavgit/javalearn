# javalearn
--- Lesson_3-11-02-2020 ---

1 Вопрос: В какой момент (в какой части программы) закрывать потоки?

Например,
//------------------------
Scanner in = new Scanner(System.in);
String value = in.nextLine();
...
//закрываем поток
in.close();
//------------------------

2 Вопрос: почему, когда мы сравниваем в if-else строки  "11" == "11" - это FALSE?!
Ответ дан равёрнуто в твоей ссылке 
https://javarush.ru/groups/posts/equals-java-sravnenie-strok

То есть по сути это разные объекты, а то что у них свойство одинаковые, это ничего не меняет.
Для теста, в это задаче я сразу присвоиваю 
    ` String score = in.nextLine();
             score = "1";`
 и сразу после завпуска у меня выполняется `if`.
 
 Результат
 `Введите оценку фильма (1-5), чтобы узнать рецензию: 
  1
  Оценка: 1
  Отвратительный фильм. Смотреть не стоит`
  
  3 Переопределяем equal() для сравнения String ов
 