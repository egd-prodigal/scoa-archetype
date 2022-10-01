#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.converter;

import ${package}.model.vo.HistoryEventVO;
import ${package}.repository.entity.HistoryEventPO;

/**
 * 实体类转换器
 */
public class HistoryEventConverter {

    /**
     * 历史事件数据库实体类转换成展示实体类
     *
     * @param po 数据库实体类
     * @return HistoryEventVO 展示实体类
     */
    public static HistoryEventVO convert(HistoryEventPO po) {
        HistoryEventVO historyEventVO = new HistoryEventVO();
        historyEventVO.setEvent(String.format("%s，%s", po.getReignTitle(), po.getHistory()));
        return historyEventVO;
    }

}
