package Streams;

public class Project {
    private String projectCode;
    private String name ;
    private String client;
    private String buLeadName;

    public Project(){}
    public Project(String buLeadName, String client, String name, String projectCode) {
        this.buLeadName = buLeadName;
        this.client = client;
        this.name = name;
        this.projectCode = projectCode;
    }

    public String getBuLeadName() {
        return buLeadName;
    }

    public void setBuLeadName(String buLeadName) {
        this.buLeadName = buLeadName;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Project{" +
                "buLeadName='" + buLeadName + '\'' +
                ", projectCode='" + projectCode + '\'' +
                ", name='" + name + '\'' +
                ", client='" + client + '\'' +
                '}';
    }
}
