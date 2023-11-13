record Task (int taskPriority, String name, String date, String status){

    @Override
    public String toString() {
        return "No: " + taskPriority + ", " + name + ", Date: " + date + ", Status: " + status;
    }
}
