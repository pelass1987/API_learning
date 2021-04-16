package reqresAPI;

public class UpdatedUser {

    private String name;
    private String job;
    private String updatedAt;

    public UpdatedUser() {
    }

    public UpdatedUser(String name, String job) {
        this.name = name;
        this.job = job;
    }


    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String createdAt) {
        this.updatedAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob(String leader) {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "UpdatedUser{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
