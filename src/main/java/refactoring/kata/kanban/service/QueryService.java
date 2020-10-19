package refactoring.kata.kanban.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import refactoring.kata.kanban.dto.QueryBuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author  <a href="mailto:meixuesong@gmail.com">Mei Xuesong</a>
 */
public class QueryService {
    private static Logger logger = LoggerFactory.getLogger(QueryService.class);
    public <E> List<E> queryDocs(String index, QueryBuilder query, int from, int to, Class<E> entityClass) {
        logger.debug("Query docs: {} {} {} {} {}", index, query, from, to, entityClass.getName());
        return new ArrayList<>();
    }
}
