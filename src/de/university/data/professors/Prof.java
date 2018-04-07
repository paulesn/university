package de.university.data.professors;

public class Prof {
    //----variables----
    private String name;
    private int costs;
    private int knowledgeBonus;
    private int wellbeingBonus;
    private int studentCapacity;
    private String benefits;
    private String info;

    //----constructor----

    public Prof(String name, Integer costs, Integer knowledgeBonus, Integer wellbeingBonus, String benefits){
        this.name = name;
        this.costs = costs;
        this.knowledgeBonus = knowledgeBonus;
        this.wellbeingBonus = wellbeingBonus;
        this. benefits = benefits;
    }

    //----getter-setter----

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCosts() {
        return costs;
    }

    public void setCosts(int costs) {
        this.costs = costs;
    }

    public int getKnowledgeBonus() {
        return knowledgeBonus;
    }

    public void setKnowledgeBonus(int knowledgeBonus) {
        this.knowledgeBonus = knowledgeBonus;
    }

    public int getWellbeingBonus() {
        return wellbeingBonus;
    }

    public void setWellbeingBonus(int wellbeingBonus) {
        this.wellbeingBonus = wellbeingBonus;
    }

    public int getStudentCapacity() {
        return studentCapacity;
    }

    public void setStudentCapacity(int studentCapacity) {
        this.studentCapacity = studentCapacity;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
