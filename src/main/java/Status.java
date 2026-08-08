public enum Status {
    TODO("Todo"), IN_PROGRESS("In progress"), COMPLETED("Completed");
    private final String state;

    Status(String todo) {
        this.state = todo;
    }

    public String getState() {
        return this.state;
    }
}
