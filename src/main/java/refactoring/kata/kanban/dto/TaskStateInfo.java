package refactoring.kata.kanban.dto;

import java.util.List;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class TaskStateInfo {
    private String id;
    private Long sequence;
    private String name;
    private List<TaskStateInfo> nextStates;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(Long sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TaskStateInfo> getNextStates() {
        return nextStates;
    }

    public void setNextStates(List<TaskStateInfo> nextStates) {
        this.nextStates = nextStates;
    }

}
