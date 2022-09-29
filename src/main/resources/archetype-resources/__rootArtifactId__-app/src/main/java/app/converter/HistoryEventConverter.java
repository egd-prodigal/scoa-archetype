#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.converter;

import ${package}.model.vo.HistoryEventVO;
import ${package}.repository.entity.HistoryEventPO;

public class HistoryEventConverter {

    public static HistoryEventVO convert(HistoryEventPO po) {
        HistoryEventVO historyEventVO = new HistoryEventVO();
        historyEventVO.setEvent(String.format("%s，%s", po.getReignTitle(), po.getHistory()));
        return historyEventVO;
    }

}
