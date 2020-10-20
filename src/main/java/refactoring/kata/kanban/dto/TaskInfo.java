package refactoring.kata.kanban.dto;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class TaskInfo {
    private User assignToUser;
    private String id;
    private String name;
    private TaskStateInfo state;
    private Long sequence;

    public User getAssignToUser() {
        return assignToUser;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public TaskStateInfo getState() {
        return state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
