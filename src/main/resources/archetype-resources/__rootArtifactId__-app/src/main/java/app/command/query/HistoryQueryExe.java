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

@Component
public class HistoryQueryExe {

    @Autowired
    HistoryEventMapper historyEventMapper;

    public HistoryEventVO queryHistory() {
        HistoryEventPO eventPO = historyEventMapper.query();
        return HistoryEventConverter.convert(eventPO);
    }


}
