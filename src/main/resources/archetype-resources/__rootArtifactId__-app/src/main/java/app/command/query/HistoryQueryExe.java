#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.command.query;

import ${package}.app.converter.HistoryEventConverter;
import ${package}.model.vo.HistoryEventVO;
import ${package}.repository.entity.HistoryEventPO;
import ${package}.repository.mapper.HistoryEventMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 历史事件查询器
 */
@Component
public class HistoryQueryExe {

    @Autowired
    HistoryEventMapper historyEventMapper;

    /**
     * 查询历史事件
     *
     * @return HistoryEventVO
     */
    public HistoryEventVO queryHistory() {
        HistoryEventPO eventPO = historyEventMapper.query();
        return HistoryEventConverter.convert(eventPO);
    }


}
