package refactoring.kata.kanban.dto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class QueryBuilder {
    private static Logger logger = LoggerFactory.getLogger(QueryBuilder.class);
    public QueryBuilder should() {
        return this;
    }

    public void match(String summary, String search) {
        //omit implementation
    }

    public QueryBuilder filter() {
        //omit implementation
        return this;
    }

    public QueryBuilder term(String name, String value) {
        logger.debug("term: {} {}", name, value);
        //omit implementation
        return this;
    }
}
