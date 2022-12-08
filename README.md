<h2>Курсовая работа Книга_Сотрудников:</h2>

<h3>Реализация:<h3>

<h3>Cписок всех сотрудников со всеми имеющимися по ним данными</h3>

<code>public static void getAllInfo(ArrayList<Employee> people)</code>
  
<h3>Получить Ф. И. О. всех сотрудников</h3>
 
from <code>Employee.java</code>

<code>public String toStringName()</code>

<h3>Посчитать сумму затрат на зарплаты в месяц.</h3>

<h5>Базовая сложность</h5>
  
<code>public static void getAllSalary(ArrayList<Employee> people)</code>
  
<h5>Повышенная сложность (с учетом отдела)</h5>
  
<code>public static void getMidSalary(ArrayList<Employee> people, int department)</code>

<h3>Найти сотрудника с минимальной зарплатой.</h3>

<h5>Базовая сложность</h5>
  
<code>public static void getMinSalary(ArrayList<Employee> people)</code>

<h5>Повышенная сложность (с учетом отдела)</h5>

<code>public static void getMinSalary(ArrayList<Employee> people, int department)</code>
  

<h3>Найти сотрудника с максимальной зарплатой.</h3>
 
<h5>Базовая сложность</h5>

<code>public static void getMaxSalary(ArrayList<Employee> people)</code>
  
<h5>Повышенная сложность (с учетом отдела)</h5>
  
<code>public static void getMaxSalary(ArrayList<Employee> people, int department)</code>
  
<h3>Подсчитать среднее значение зарплат</h3>
  
<h5>Базовая сложность</h5>

<code>public static void getMidSalary(ArrayList<Employee> people)</code>
  
<h5>Повышенная сложность (с учетом отдела)</h5>
  
<code>public static void getMidSalary(ArrayList<Employee> people, int department)</code>



<h3>Проиндексировать зарплату на %, переданный в качестве аргумента</h3>
  
<h5>Повышенная сложность</h5>
  
<code>public static void increaseSalary(ArrayList<Employee> people, int percent)</code>
  
<h5>Повышенная сложность (с учетом отдела)</h5>
  
<code>public static void increaseSalary(ArrayList<Employee> people, int department, int percent)</code>
  
<h3>Напечатать всех сотрудников отдела (все данные, кроме отдела)</h3>  
  
<h5>Повышенная сложность</h5>
    
from <code>Employee.java</code>
  
<code>public String toStringDepartment()</code>  

<h3>Получить в качестве параметра число и найти:</h3>

<h5>Повышенная сложность</h5>  
  
<h4>Всех сотрудников с зарплатой меньше числа</h4>
  
<code>public static void compareLess(ArrayList<Employee> people, int compare)</code> 
  
<h5>Всех сотрудников с зарплатой больше (или равно) числа</h5>

<code>public static void compareMore(ArrayList<Employee> people, int compare)</code>
  
<h3>Удалить сотрудника </h3>
  
<h3>Сложно: считывает с консоли ответ пользователя, по имени или айди будем искать сотрудника, удаляет элемент ArrayList</h3>
  
<code>public static void removeEmployee(ArrayList<Employee> people)</code>
  
<h3>Добавить нового сотрудника </h3>

<h3>Сложно: вызывает конструктор, считывает с консоли данные для нового сотрудника, добавляет элемент в ArrayList</h3>
  
<code>public static void addNewEmployee(ArrayList<Employee> people)</code>

<h3>Изменить сотрудника: зарплату/отдел</h3> 
  
<h3>Сложно: вызывает конструктор, считывает с консоли ответы пользователя, меняет атрибуты элемента в ArrayList</h3>

<code>public static void changeEmployeeData(ArrayList<Employee> people)</code>
  
<h2>Методы перегружены разными параметрами, передающимися в них</h2>


<h2>Список сгенерированных ФИО, отделов и зарплат для проверки при вводе (заполнение хранилища реализовано с помощью
Scan) находится в файле names.txt</h2>
