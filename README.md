# java-labs

Обратите внимание:  
                
                - В среде IDE ( например, Eclipse)  есть возможность ввести параметры из командной строки.
                - Обработка ошибок должна быть сделана для всех заданий, если есть ввод параметров. 
                - Введенные параметры и результаты работы должны выводиться на дисплей (вместе с соответствующими пояснениями, если это необходимо для понимания решенной задачи ).
                - Поток выполнения  имеет имя по умолчанию, которое нужно получить во время выполнения с помощью метода Thread.currentThread.getName().
                - 3 и 4 задания для потоков выполнения предполагают выполнение потоков четко по очереди.

1. Создать приложение, выполняющее простые арифметические действия над операндами-параметрами командной строки. 
Проверить наличие и количество параметров, а также их соответствие предъявляемым ниже требованиям.
Операндами могут быть как целые числа, так и числа с плавающей точкой.
Параметры задаются в виде :
	Операнд1 Операция Операнд2, где операция - + | - | x | / 
Результат должен быть выдан в виде:
                Операнд1= (значение параметра1)
                Операция= (значение параметра2)
                Операнд2= (значение параметра3)
                
	Сумма| Разность| Произведение| Частное  =   (результат)


2. Создать приложение с 2 классами- Book, Shoe  и  интерфейсом Product. Интерфейс содержит метод whoAmI, который будет реализован в имплементирующих классах. Определить новый интерфейс  Present,
 расширяющий интерфейс Product и содержащий  метод it_can_be_presented(), который может возвращать строку.
Объявить 2 новых класса (например Toy, Picture), реализующих  интерфейс Present.
В приложении создать массив объектов Product-(Book, Shoe,Toy, Picture) , состоящий из количества элементов заданного параметром.
Перебирая в цикле элементы массива Product, находить  c помощью оператора  instanceof  те объекты, которые реализуют  интерфейс Present.
Для каждого найденного элемента массива Product, реализующего новый интерфейс Present, 
выполнить метод нового интерфейса it_can_be_presented(). Вывод должен содержать названия всех продуктов из массива, затем тех продуктов, которые реализуют интерфейс Present.

3. Напишите приложение с 2 потоками- производителем и потребителем, которые имеют разделяемую статическую переменную- склад. То есть склад не является массивом!
Склад хранит целые числа от 0 до 100.
Производитель генерирует число от 0 до 100 и отправляет его на склад, выводя имя производителя и сгенеренное число.
Потребитель читает значение числа со склада, как только оно там появилось, и выводит  на консоль имя потребителя и полученное число.
  Выполнить задание   с использованием конструкции synchronized . 
Не использовать в этом задании флаги для синхронизации потоков, а только методы wait и notify. 
Также не использовать любые задержки для потоков после начала их работы в виде методов sleep, yield или wait c параметром.

4.  Выполнить приложение командной строки с двумя параметрами , один из которых – количество потоков, другой параметр – количество выводимых строк.
Нужно так синхронизовать потоки, чтобы имена потоков выводились поочередно- в каждой строке.
Под синхронизацией подразумевается использование конструкции synchronized и методов wait, notify.
Использовать ограничения из задания 3. 
Имя первого потока должно всегда выводится в новой строке.

Пример вывода для приложения с параметрами 3 и 2:
Thread-0 Thread-1 Thread-2 
Thread-0 Thread-1 Thread-2 

5. Создать  приложение с пользовательским интерфейсом для заданий 1-4. Для этого приложения должна быть реализована возможность выбора из списка любого приложения и его выполнение. 
Модифицировать задания 1-4 так, чтобы весь вывод происходил в текстовых областях . 
Т. е это должно быть не приложение командной строки , а полностью  графическое приложение. Не используйте в приложении всплывающие окна.

6. Создать приложение для мобильного телефона, которое выводит круги в квадратах разных цветов и размеров на каждое нажатие кнопки.

7. Создать бизнес-приложение или приложение-игру для мобильного телефона . Подготовить отчет этого курсового проекта в электронном виде. В отчете необходимо 
наличие титульного листа, диаграмм классов, описания предназначения классов и методов, скриншотов и кода приложения в конце. 

