package refactoring.kata.kanban.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import refactoring.kata.kanban.dto.TaskInfo;

import java.util.List;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class ColumnService {
    private static Logger logger = LoggerFactory.getLogger(ColumnService.class);

    public List<TaskInfo> getTaskStatesByTeamId(String teamId) {
        logger.debug("getTaskStatesByTeamId {}", teamId);
        //omit implementation

        return null;
    }
}
