


class Person {
    protected String name;
    protected String surname;
    protected int money;
    protected boolean isPerson;


    public Person(String name, String surname, int money) {
        this.name = name;
        this.surname = surname;
        this.money = money;
        this.isPerson = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public boolean isPerson() {
        return isPerson;
    }

    public void setPerson(boolean person) {
        isPerson = person;
    }

    @Override
    public String toString() {
        return  "Name: " + this.name + ", Surname: " + this.surname + ", Money: " + this.money;
    }


}