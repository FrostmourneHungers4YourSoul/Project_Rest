# Task-7

[Task 3.1.3](https://github.com/FrostmourneHungers4YourSoul/Project_Rest/pull/1)

Задание:

Перенесите классы и зависимости из предыдущей задачи.
Создайте класс Role и свяжите User с ролями так, чтобы юзер мог иметь несколько ролей.
Имплементируйте модели {{Role}} и {{User}} интерфейсами {{GrantedAuthority}} и {{UserDetails}} соответственно. Измените настройку секьюрности с {{inMemory}} на {{userDetailService}}
Все CRUD-операции должны быть доступны только пользователю с ролью admin по url: /admin/. Добавление/изменение юзера должно быть с ролями за один запрос
Пользователь с ролью user имеет доступ только по своему url /user и получать данные только о себе. Доступ к этому url должен быть только у пользователей с ролью user и admin. Не забывайте про несколько ролей у пользователя!
Настройте logout с любого url
Необходимо установить Postman/Insomnia (на выбор) и разобраться как он работает
С помощью Postman/Insomnia протестировать все endpoints.

