package org.autojava;

public class MainSite implements iNeedChekVirus{
    private String login;
    private String pass;
    private String section;

    public String getSection() {
        return section;
    }

    public MainSite(String login, String pass, String section) {
        this.login = login;
        this.pass = pass;
        this.section = section;
    }




}
/*
ДЗ 3
1. Используйте полиморфизм, можете просто напечатать код из занятия или из видео из ютуба
2. Создайте три интерфейса с абстрактными и дефолтными методами
3. Добавьте интерфейсы в класс
4. Переопределите методы в классах из интерфейсов
 */