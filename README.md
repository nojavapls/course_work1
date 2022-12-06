# course_work1
<h4>Курсовая работа Книга_Сотрудников:</h4>

Реализация:

Базовая сложность: 

<h4>Cписок всех сотрудников со всеми имеющимися по ним данными</h4>

<code>public static void getAllInfo(ArrayList<Employee> people)</code>
  
<h4>Получить Ф. И. О. всех сотрудников</h4>
 
from <code>Employee.java</code>

<code>public String toStringName()</code>

<h4>Посчитать сумму затрат на зарплаты в месяц.</h4>

<h5>Базовая сложность</h5>
  
<code>public static void getAllSalary(ArrayList<Employee> people)</code>
  
<h5>Повышенная сложность (с учетом отдела)</h5>
  
<code>public static void getMidSalary(ArrayList<Employee> people, int department)</code>

<h4>Найти сотрудника с минимальной зарплатой.</h4>

<h5>Базовая сложность</h5>
  
<code>public static void getMinSalary(ArrayList<Employee> people)</code>

<h5>Повышенная сложность (с учетом отдела)</h5>

<code>public static void getMinSalary(ArrayList<Employee> people, int department)</code>
  

<h4>Найти сотрудника с максимальной зарплатой.</h4>
 
<h5>Базовая сложность</h5>

<code>public static void getMaxSalary(ArrayList<Employee> people)</code>
  
<h5>Повышенная сложность (с учетом отдела)</h5>
  
<code>public static void getMaxSalary(ArrayList<Employee> people, int department)</code>
  
<h4>Подсчитать среднее значение зарплат</h4>
  
<h5>Базовая сложность</h5>

<code>public static void getMidSalary(ArrayList<Employee> people)<code>
  
<h5>Повышенная сложность (с учетом отдела)</h5>
  
<code>public static void getMidSalary(ArrayList<Employee> people, int department)</code>



<h4>Проиндексировать зарплату на %, переданный в качестве аргумента</h4>
  
<h5>Повышенная сложность</h5>
  
<code>public static void increaseSalary(ArrayList<Employee> people, int percent)</code>
  
<h5>Повышенная сложность (с учетом отдела)</h5>
  
<code>public static void increaseSalary(ArrayList<Employee> people, int department, int percent)</code>
  
<h4>Напечатать всех сотрудников отдела (все данные, кроме отдела)</h4>  
  
<h5>Повышенная сложность</h5>
    
from <code>Employee.java</code>
  
<code>public String toStringDepartment()</code>  


<h5>Получить в качестве параметра число и найти:</h5>

<h5>Повышенная сложность</h5>  
  
<h4>Всех сотрудников с зарплатой меньше числа</h4>
  
<code>public static void compareLess(ArrayList<Employee> people, int compare)</code> 
  
<h5>Всех сотрудников с зарплатой больше (или равно) числа</h5>

Сложно:

Добавить нового сотрудника
Удалить сотрудника 

Изменить сотрудника
1. Изменить зарплату.
2. Изменить отдел.

Получить Ф. И. О. всех сотрудников по отделам

<code>nano</code>.


Методы переопределены разными аргументами, передающимися в них

Список сгенерированный ФИО, отделов и зарплат для проверки при вводе (заполнение хранилища реализовано с помощью
Scan) находится в файле names.txt
