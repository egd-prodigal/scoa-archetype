#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.app.service;

import ${package}.model.vo.HistoryEventVO;

/**
 * 历史故事服务接口定义
 */
public interface StoryService {

    /**
     * 演绎历史
     */
    void performs();

    /**
     * 重置历史
     */
    void reset();

    /**
     * 查询历史
     *
     * @return HistoryEventVO
     */
    HistoryEventVO queryHistory();

}
