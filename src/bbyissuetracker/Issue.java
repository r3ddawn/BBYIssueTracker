package bbyissuetracker;

public class Issue {
    public String planogramTitle;
    public String description;
    public String additionalNotes;
    
    public Issue(String planogramTitle, String description, String additionalNotes) {
        this.planogramTitle = planogramTitle;
        this.description = description;
        this.additionalNotes = additionalNotes;
    }
    
    public class Node {
        public Node next = null;
        public Issue issue;
        
        public Node (Issue issue) {
            this.issue = issue;
        } 
    }
    
    private Node first;
    private int numberOfIssues;
    
    public void print(Issue issue) {
        System.out.println("Planogram: " + planogramTitle);
        System.out.println("Description of Issue: " + description);
        System.out.println("Notes: " + additionalNotes);
    }
}
