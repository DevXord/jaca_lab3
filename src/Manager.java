
class Manager extends Person {
    private boolean isManager;

    public Manager(String name, String surname, int money, boolean isManager) {
        super(name, surname, money);
        this.isManager = isManager;

    }

    public boolean getManager() {
        return isManager;
    }

    public void setManager(boolean isManager) {
        this.isManager = isManager;
    }

    @Override
    public String toString() {
        return (isManager ? "Manager " : "") + super.toString();
    }
}