
class Prezes extends Manager {
    private boolean isPrezes;
    public Prezes(String name, String surname, int money, boolean isManager, boolean isPrezes) {
        super(name, surname, money, isManager);
        this.isPrezes = isPrezes;
    }

    public boolean getPrezes() {
        return isPrezes;
    }

    public void setPrezes(boolean isPrezes) {
        this.isPrezes = isPrezes;
    }
    @Override
    public String toString() {
        return  (isPrezes ? "Prezes " : "" ) + super.toString();
    }

}
